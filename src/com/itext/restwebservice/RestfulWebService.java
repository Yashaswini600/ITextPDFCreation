package com.itext.restwebservice;

import java.io.IOException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.itextpdf.text.DocumentException;

@RestController
public class RestfulWebService {
	public static final String dest = "C:\\Users\\Yashaswini\\Desktop\\info.pdf";
	@RequestMapping(value="/info",produces = "text/plain")
	public String printHello () throws DocumentException, IOException{
		String result = null;
		System.out.println("Creation in process");
		
		ITextPDF it= new ITextPDF();
		boolean val=it.pdfCreate(dest);
		if(val){
		result= "PDF Successfully Created!!";
		}
		else
		{
			result= "PDF Creation Failed!!";
			}
		return result;
		}
	}
