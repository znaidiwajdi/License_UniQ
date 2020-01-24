package com.example.demo.web.controller;

import java.security.spec.KeySpec;
import java.time.LocalTime;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UniqLicense {
	private static final String UNICODE_FORMAT = "UTF8";

	public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";
	private KeySpec ks;
	private SecretKeyFactory skf;
	private Cipher cipher;
	byte[] arrayBytes;
	private String myEncryptionKey;
	private String myEncryptionScheme;
	private static String appName;
	private static String email;
	private static String city;
	private static String state;
	private static String version;
	private static String country;
	private static String date_debut;
	private static String date_expired;

	//////////////////// Payable License Attrubit///////////////////
	private static String appNameAP;
	private static String emailAP;
	private static String cityAP;
	private static String stateAP;
	private static String versionAP;
	private static String countryAP;
	private static String date_debutAP;
	private static String date_expiredAP;
	private static String moduleAP;

	//////////////////// Receivable License Attrubit///////////////////
	private static String appNameAR;
	private static String emailAR;
	private static String cityAR;
	private static String stateAR;
	private static String versionAR;
	private static String countryAR;
	private static String date_debutAR;
	private static String date_expiredAR;
	private static String moduleAR;

	//////////////////// License Framework///////////////////
	private static String appNameFO;
	private static String emailFO;
	private static String cityFO;
	private static String stateFO;
	private static String versionFO;
	private static String countryFO;
	private static String date_debutFO;
	private static String date_expiredFO;
	private static String moduleFO;

	//////////////////// License Treasury///////////////////
	private static String appNameTR;
	private static String emailTR;
	private static String cityTR;
	private static String stateTR;
	private static String versionTR;
	private static String countryTR;
	private static String date_debutTR;
	private static String date_expiredTR;
	private static String moduleTR;

	//////////////////// License Fixed ASSET///////////////////
	private static String appNameFA;
	private static String emailFA;
	private static String cityFA;
	private static String stateFA;
	private static String versionFA;
	private static String countryFA;
	private static String date_debutFA;
	private static String date_expiredFA;
	private static String moduleFA;

	//////////////////// License General Ledger ///////////////////
	private static String appNameGE;
	private static String emailGE;
	private static String cityGE;
	private static String stateGE;
	private static String versionGE;
	private static String countryGE;
	private static String date_debutGE;
	private static String date_expiredGE;
	private static String moduleGE;

	//////////////////// License Accounting Engine ///////////////////
	private static String appNameAE;
	private static String emailAE;
	private static String cityAE;
	private static String stateAE;
	private static String versionAE;
	private static String countryAE;
	private static String date_debutAE;
	private static String date_expiredAE;
	private static String moduleAE;

	//////////////////// License Analytic ///////////////////
	private static String appNameAQ;
	private static String emailAQ;
	private static String cityAQ;
	private static String stateAQ;
	private static String versionAQ;
	private static String countryAQ;
	private static String date_debutAQ;
	private static String date_expiredAQ;
	private static String moduleAQ;

	//////////////////// License Stock ///////////////////
	private static String appNameSK;
	private static String emailSK;
	private static String citySK;
	private static String stateSK;
	private static String versionSK;
	private static String countrySK;
	private static String date_debutSK;
	private static String date_expiredSK;
	private static String moduleSK;

	//////////////////// License Payroll ///////////////////
	private static String appNamePR;
	private static String emailPR;
	private static String cityPR;
	private static String statePR;
	private static String versionPR;
	private static String countryPR;
	private static String date_debutPR;
	private static String date_expiredPR;
	private static String modulePR;

	//////////////////// License Humman Resources ///////////////////
	private static String appNameHR;
	private static String emailHR;
	private static String cityHR;
	private static String stateHR;
	private static String versionHR;
	private static String countryHR;
	private static String date_debutHR;
	private static String date_expiredHR;
	private static String moduleHR;

	//////////////////// License Administrator ///////////////////
	private static String appNameAD;
	private static String emailAD;
	private static String cityAD;
	private static String stateAD;
	private static String versionAD;
	private static String countryAD;
	private static String date_debutAD;
	private static String date_expiredAD;
	private static String moduleAD;

	//////////////////// License Staff Expenses ///////////////////
	private static String appNameEX;
	private static String emailEX;
	private static String cityEX;
	private static String stateEX;
	private static String versionEX;
	private static String countryEX;
	private static String date_debutEX;
	private static String date_expiredEX;
	private static String moduleEX;
	
	
	
	
	
	//////////////////// License Data Integration ///////////////////
	private static String appNameDI;
	private static String emailDI;
	private static String cityDI;
	private static String stateDI;
	private static String versionDI;
	private static String countryDI;
	private static String date_debutDI;
	private static String date_expiredDI;
	private static String moduleDI;

	
	
	
	
	
	
	
	
	
	private static int EXIT_STATUS_ERR_CANT_OUR_PROPERTIES_FILE = 4;
	SecretKey key;
	@Autowired
    private UserDetailsService userService;
	public UniqLicense() {}
	
	@RequestMapping(value = "/login")
	public String login() {
		
				
		return "login";
		
	}
	 @RequestMapping("/login-error")
	  public String loginError(Model model) {
	    model.addAttribute("loginError", true);
	    return "login";
	  }

	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String RedirectLicense() {
		
				
		return "License";
		
	}
	
	@GetMapping("/logout")
    public String getLogoutPage(HttpServletRequest request, HttpServletResponse response){

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null)
            new SecurityContextLogoutHandler().logout(request, response, authentication);

        return "redirect:login";
    }
	
	
	
	
	
	
	
	public String encrypt(String unencryptedString) {
		String encryptedString = null;
		try {
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] plainText = unencryptedString.getBytes(UNICODE_FORMAT);
			byte[] encryptedText = cipher.doFinal(plainText);
			encryptedString = new String(Base64.encodeBase64(encryptedText));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encryptedString;
	}
}
