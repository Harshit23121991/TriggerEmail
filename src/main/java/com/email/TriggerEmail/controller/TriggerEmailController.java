package com.email.TriggerEmail.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.email.TriggerEmail.service.TriggerEmailService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/")
public class TriggerEmailController {

	@Autowired
	private TriggerEmailService triggerEmailService;
	
	@GetMapping(value = "triggerMail")
	public boolean trigggerMail(@RequestParam("mailId") String mailId) throws ParseException {
		return triggerEmailService.sendMail(mailId);
	}
}

