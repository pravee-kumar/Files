package com.nagarro.assignment1.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.nagarro.assignment1.service.CalculatorService;

@Controller
public class CalculatorController {
	
	@Autowired
	CalculatorService service;
	
	@RequestMapping("/cal")
	public ModelAndView calculator(HttpServletRequest request,HttpServletResponse response) {
		
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		String op=request.getParameter("op");
		op.toLowerCase();
		int res = 0;
		if(op=="add"){
			res=service.getAdd(i,j);
		    }
		else if(op=="sub"){
			res=service.getSub(i,j);
			}
		else if(op=="div"){
			res=service.getDiv(i,j);
			}
		else if(op=="mul"){
			res=service.getMul(i,j);
			}
		else{
			
			res=0;
		}
			ModelAndView mv= new ModelAndView();
			mv.addObject("result",res);
			mv.addObject("operation",op);
			mv.setViewName("display");
			return mv;
		
		
		
	}

}
