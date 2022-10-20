package net.control;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileController {
	@SuppressWarnings("null")
	@RequestMapping(path="/upload", method = RequestMethod.POST)
	public String uploaded(@RequestParam("img") CommonsMultipartFile file,HttpSession session, Model model) {
		System.out.println(file.getOriginalFilename());
		String nul=null;
//		System.out.println(nul.length());
		String path=session.getServletContext().getRealPath("/")+"resources"+File.separator+"images"+File.separator+ file.getOriginalFilename().toString().replaceAll("\\s+", "");
//		String path=session.getServletContext().getRealPath("/")+"resources"+File.separator+"images"+File.separator+ file.getOriginalFilename().toString();
		System.out.println(path);
		FileOutputStream fos;
		File f=new File(path);
//		System.out.println(f.mkdirs());
//		if(f.canRead()==false) {
//			f.setReadable(true);
//		}
//		if(f.canWrite()==false) {
//			f.setWritable(true);
//		}
		try {
			fos=new FileOutputStream(f);
			fos.write(file.getBytes());
			System.out.println("File Uploaded");
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("upload error");
		} 
		model.addAttribute("fileName",file.getOriginalFilename().replaceAll("\\s+", ""));
		return "success";
	}
	
	
//	Exception Handlers
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public String genericException() {
		return "error";
	}
}
