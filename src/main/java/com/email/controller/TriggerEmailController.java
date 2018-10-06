package com.email.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.email.service.TriggerEmailService;

@CrossOrigin(origins = "*")
@RestController
public class TriggerEmailController {

	@Autowired
	private TriggerEmailService triggerEmailService;
	
	@RequestMapping(value = "/trigggerMail", method = RequestMethod.GET)
	public boolean trigggerMail(@RequestParam("mailId") String mailId) throws ParseException {
		return triggerEmailService.sendMail(mailId);
	}
}

