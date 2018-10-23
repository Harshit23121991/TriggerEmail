package com.email.TriggerEmail.service;

import java.text.ParseException;

public interface TriggerEmailService {

	boolean sendMail(String mailId) throws ParseException;

}
