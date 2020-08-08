package com.learning.otpgenerator.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class OTPGeneratorService {

	
	public String generateNumericOTP(int length) {
		System.out.println("Generating your numeric OTP using random(): ");
		String number = "1234567890";
		Random random = new Random();
		char[] otp = new  char[length];
		
		for (int i=0 ; i<length; i++ ) {
			otp[i]= number.charAt(random.nextInt(number.length()));
		}
		return new String(otp);
	}
	
	public String generateAlphaNumericOTP(int length) {
		System.out.println("Generating your alphanumeric OTP using random(): ");
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		Random random = new Random();
		char[] otp = new  char[length];
		
		for (int i=0 ; i<length; i++ ) {
			otp[i]= str.charAt(random.nextInt(str.length()));
		}
		return new String(otp);
	}
	
	public String generatePswd(int length) {
		System.out.println("Generating your password using random(): ");
		String smallStr = "abcdefghijklmnopqrstuvwxyz";
		String capStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String num = "1234567890";
		String spChar = "!~@#$%*()-_+=/?><;:&^";
		String values = smallStr + capStr + num + spChar;
		Random random = new Random();
		char[] pswd = new  char[length];
		
		for (int i=0 ; i<length; i++ ) {
		// pswd[i]= values.charAt((int) (Math.random() * values.length()));
			
		pswd[i]= values.charAt(random.nextInt(values.length()));
		}
		return new String(pswd);
	}
	
}
