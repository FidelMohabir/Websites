package io.fidelmohabir.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import io.fidelmohabir.beans.HomeLinksBean;
import io.fidelmohabir.dao.HomeLinksDao;
import io.fidelmohabir.dao.Impl.HomeLinksDaoImpl;



@Controller
public class HomeController {

	@Autowired
	HomeLinksDaoImpl homeLinksDaoImpl;
	
	@RequestMapping("/home")
	public ModelAndView home() {
		
		List<HomeLinksBean> homeLinks = homeLinksDaoImpl.getLinks();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("homeLinks", homeLinks);
		
		return modelAndView;
	}
}
