package com.example.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.dao.HscBoardDao;
import com.example.dao.HscDao;
import com.example.dao.PassingYearHscDao;
import com.example.dao.PassingYearSscDao;
import com.example.dao.ProgramDao;
import com.example.dao.SscBoardDao;
import com.example.dao.SscDao;
import com.example.dao.StudentInformationDao;
import com.example.entity.StudentInformation;
import com.example.util.FileUploadUtil;

//@RestController
//@RequestMapping("/api/v1/")
@Controller
public class StudentInformationController {
	
	@Autowired
	private StudentInformationDao studentInformationDao;
	
	@Autowired
	private HscDao hscDao;
	
	@Autowired
	private HscBoardDao hscBoardDao;
	
	@Autowired
	private PassingYearHscDao passingYearHscDao;
	
	@Autowired
	private PassingYearSscDao passingYearSscDao;
	
	@Autowired
	private ProgramDao programDao;
	
	@Autowired
	private SscDao sscDao;
	
	@Autowired
	private SscBoardDao sscBoardDao;
	
	@GetMapping("/studentInformation/form")
	public String districtFormGet(@RequestParam(value = "id", required = false) StudentInformation studentInformation, Model model) {
		if(studentInformation == null) {
			studentInformation = new StudentInformation();
		}
		model.addAttribute("studentInformation", studentInformation);
		model.addAttribute("hsc", hscDao.findAll());
		model.addAttribute("ssc", sscDao.findAll());
		
		model.addAttribute("hscBoard", hscBoardDao.findAll());
		model.addAttribute("sscBoard", sscBoardDao.findAll());
		
		model.addAttribute("passingYearHsc", passingYearHscDao.findAll());
		model.addAttribute("passingYearSsc", passingYearSscDao.findAll());
		
		model.addAttribute("program", programDao.findAll());
		
		return "studentInformation/form";
		
	}
	
	@PostMapping("/studentInformation/form")
    public String simpan(@ModelAttribute @Validated StudentInformation studentInformation, BindingResult errors, SessionStatus status,
    		@RequestParam(name = "btnSubmit", required = false) String btnSubmit, RedirectAttributes redirAttrs,
    		@RequestParam("image") MultipartFile multipartFile) throws IOException{
        if (errors.hasErrors()) {
            return "studentInformation/form";
        }
        
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        studentInformation.setPicture(fileName);
         
        StudentInformation savedUser = studentInformationDao.save(studentInformation);
 
        String uploadDir = "user-photos/" + savedUser.getId();
 
        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);

		return "redirect:/studentInformation/form";
		
        
    }


}
