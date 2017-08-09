package com.endless.web.upload;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController {
	
	@RequestMapping("/fileUpload")
	public ModelAndView getFileUploadForm() {
		return new ModelAndView("fileUpload", "upload", new UploadInfo());
	}
	
	@RequestMapping(value="/upload")
	public ModelAndView displayResult( UploadInfo upload) throws IOException {
		ModelAndView mv=new ModelAndView();
			mv.setViewName("fileUpload");
			mv.addObject("upload",upload); //不加这句会出错，为什么？<spring入门经典>没有这句话
			mv.addObject("filename",upload.getName());
			mv.addObject("fileLength",upload.getFile().getBytes().length);
		return mv;
	}
}
