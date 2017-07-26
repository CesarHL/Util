package v2.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import v2.dao.ContactDAO;
import v2.model.Contact;

@Controller
public class UserController {
	
	@Autowired
	private ContactDAO contactService;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, ModelAndView model) throws IOException{
	        
		Date date = new Date();
	    DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
	        
	    String fD = dateFormat.format(date);
	    model.setViewName("home");
	        
		return model;
	}
	
	
	@RequestMapping(value = "/newContact", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Contact newContact = new Contact();
		model.addObject("contact", newContact);
		model.setViewName("contact");
		return model;
	}
	

}
