package com.learning.otpgenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.otpgenerator.service.OTPGeneratorService;

@RestController
public class OtpPasswordController {

	@Value( "${numeric.length}" )
	private int numericLength;
	
	@Value( "${alpha.numeric.length}" )
	private int alphaNumericLength;
	
	@Value( "${pswd.length}" )
	private int pswdLength;
	
	@Autowired
	OTPGeneratorService otpGeneratorService;
	
	@GetMapping(value="/numericOTP")
	public char[] getNumericOtp() {
	return	otpGeneratorService.generateNumericOTP(numericLength);
	}
	
	@GetMapping(value="/alphaNumericOTP")
	public char[] getAlphaNumericOtp() {
	return	otpGeneratorService.generateAlphaNumericOTP(alphaNumericLength);
	}
	
	@GetMapping(value="/generate-password")
	public char[] getpswd() {
	return	otpGeneratorService.generatePswd(pswdLength);
	}
}
