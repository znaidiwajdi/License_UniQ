package com.example.demo.web.controller;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import java.security.spec.KeySpec;

import com.example.demo.model.License;

@Controller
public class UniqLicenseRest {
	private static final String UNICODE_FORMAT = "UTF8";

	public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";
	private KeySpec ks;
	private SecretKeyFactory skf;
	private Cipher cipher;
	byte[] arrayBytes;
	SecretKey key;
	private String myEncryptionKey;
	private String myEncryptionScheme;

	public UniqLicenseRest() throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException,
			NoSuchPaddingException, InvalidKeySpecException {

		myEncryptionKey = "UniQSoftTechnologyKeySecure";
		////////////////////////////////////////////// ***************/////////////////////////////////////////////////

		myEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;
		arrayBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
		ks = new DESedeKeySpec(arrayBytes);
		skf = SecretKeyFactory.getInstance(myEncryptionScheme);
		cipher = Cipher.getInstance(myEncryptionScheme);
		key = skf.generateSecret(ks);

	}

	@RequestMapping(value = "/generateUniqLicense", method = RequestMethod.POST)
	public @ResponseBody String generateUniqLicense(@RequestBody License license) {

		String targetUniQLicense = license.getAppName() + "#" + license.getEmail() + "#" + license.getCity() + "#"
				+ license.getDateDebut() + "#" + license.getVersion() + "#" + license.getDateFin() + "#"
				+ license.getCountry() + "#" + license.getState();
		String decryptedUniQLicense = encrypt(targetUniQLicense);
		System.out.println(decryptedUniQLicense);
		return decryptedUniQLicense;

	}

	@RequestMapping(value = "/generateAdminLicense", method = RequestMethod.POST)
	public @ResponseBody String generateAdminLicense(@RequestBody License license) {

		String targetUniQLicense = license.getAppName() + "#" + license.getEmail() + "#" + license.getCity() + "#"
				+ license.getDateDebut() + "#" + license.getVersion() + "#" + license.getDateFin() + "#"
				+ license.getCountry() + "#" + license.getModule() + "#" + license.getState();
		String decryptedUniQLicense = encrypt(targetUniQLicense);
		System.out.println(decryptedUniQLicense);
		return decryptedUniQLicense;

	}
	
	
	@RequestMapping(value = "/generateLicensePayable", method = RequestMethod.POST)
	public @ResponseBody String generatePayableLicense(@RequestBody License license) {

		String targetUniQLicense = license.getAppName() + "#" + license.getEmail() + "#" + license.getCity() + "#"
				+ license.getDateDebut() + "#" + license.getVersion() + "#" + license.getDateFin() + "#"
				+ license.getCountry() + "#" + license.getModule() + "#" + license.getState();
		String decryptedUniQLicense = encrypt(targetUniQLicense);
		System.out.println(decryptedUniQLicense);
		return decryptedUniQLicense;

	}
	
	@RequestMapping(value = "/generateLicenseReceivable", method = RequestMethod.POST)
	public @ResponseBody String generateReceivableLicense(@RequestBody License license) {

		String targetUniQLicense = license.getAppName() + "#" + license.getEmail() + "#" + license.getCity() + "#"
				+ license.getDateDebut() + "#" + license.getVersion() + "#" + license.getDateFin() + "#"
				+ license.getCountry() + "#" + license.getModule() + "#" + license.getState();
		String decryptedUniQLicense = encrypt(targetUniQLicense);
		System.out.println(decryptedUniQLicense);
		return decryptedUniQLicense;

	}
	
	@RequestMapping(value = "/generateLicenseFramework", method = RequestMethod.POST)
	public @ResponseBody String generateFrameworkLicense(@RequestBody License license) {

		String targetUniQLicense = license.getAppName() + "#" + license.getEmail() + "#" + license.getCity() + "#"
				+ license.getDateDebut() + "#" + license.getVersion() + "#" + license.getDateFin() + "#"
				+ license.getCountry() + "#" + license.getModule() + "#" + license.getState();
		String decryptedUniQLicense = encrypt(targetUniQLicense);
		System.out.println(decryptedUniQLicense);
		return decryptedUniQLicense;

	}
	
	@RequestMapping(value = "/generateLicenseTreasury", method = RequestMethod.POST)
	public @ResponseBody String generateTreasuryLicense(@RequestBody License license) {

		String targetUniQLicense = license.getAppName() + "#" + license.getEmail() + "#" + license.getCity() + "#"
				+ license.getDateDebut() + "#" + license.getVersion() + "#" + license.getDateFin() + "#"
				+ license.getCountry() + "#" + license.getModule() + "#" + license.getState();
		String decryptedUniQLicense = encrypt(targetUniQLicense);
		System.out.println(decryptedUniQLicense);
		return decryptedUniQLicense;

	}
	
	@RequestMapping(value = "/generateLicenseGeneral", method = RequestMethod.POST)
	public @ResponseBody String generateGeneralLicense(@RequestBody License license) {

		String targetUniQLicense = license.getAppName() + "#" + license.getEmail() + "#" + license.getCity() + "#"
				+ license.getDateDebut() + "#" + license.getVersion() + "#" + license.getDateFin() + "#"
				+ license.getCountry() + "#" + license.getModule() + "#" + license.getState();
		String decryptedUniQLicense = encrypt(targetUniQLicense);
		System.out.println(decryptedUniQLicense);
		return decryptedUniQLicense;

	}
	
	
	@RequestMapping(value = "/generateLicenseAnalytic", method = RequestMethod.POST)
	public @ResponseBody String generateAnalyticLicense(@RequestBody License license) {

		String targetUniQLicense = license.getAppName() + "#" + license.getEmail() + "#" + license.getCity() + "#"
				+ license.getDateDebut() + "#" + license.getVersion() + "#" + license.getDateFin() + "#"
				+ license.getCountry() + "#" + license.getModule() + "#" + license.getState();
		String decryptedUniQLicense = encrypt(targetUniQLicense);
		System.out.println(decryptedUniQLicense);
		return decryptedUniQLicense;

	}
	
	@RequestMapping(value = "/generateLicenseFixedAsset", method = RequestMethod.POST)
	public @ResponseBody String generateFixedAssetLicense(@RequestBody License license) {

		String targetUniQLicense = license.getAppName() + "#" + license.getEmail() + "#" + license.getCity() + "#"
				+ license.getDateDebut() + "#" + license.getVersion() + "#" + license.getDateFin() + "#"
				+ license.getCountry() + "#" + license.getModule() + "#" + license.getState();
		String decryptedUniQLicense = encrypt(targetUniQLicense);
		System.out.println(decryptedUniQLicense);
		return decryptedUniQLicense;

	}
	
	
	@RequestMapping(value = "/generateLicenseAccountingE", method = RequestMethod.POST)
	public @ResponseBody String generateAccountingEngineLicense(@RequestBody License license) {

		String targetUniQLicense = license.getAppName() + "#" + license.getEmail() + "#" + license.getCity() + "#"
				+ license.getDateDebut() + "#" + license.getVersion() + "#" + license.getDateFin() + "#"
				+ license.getCountry() + "#" + license.getModule() + "#" + license.getState();
		String decryptedUniQLicense = encrypt(targetUniQLicense);
		System.out.println(decryptedUniQLicense);
		return decryptedUniQLicense;

	}
	
	
	@RequestMapping(value = "/generateLicensePayroll", method = RequestMethod.POST)
	public @ResponseBody String generatePayrollLicense(@RequestBody License license) {

		String targetUniQLicense = license.getAppName() + "#" + license.getEmail() + "#" + license.getCity() + "#"
				+ license.getDateDebut() + "#" + license.getVersion() + "#" + license.getDateFin() + "#"
				+ license.getCountry() + "#" + license.getModule() + "#" + license.getState();
		String decryptedUniQLicense = encrypt(targetUniQLicense);
		System.out.println(decryptedUniQLicense);
		return decryptedUniQLicense;

	}
	
	
	@RequestMapping(value = "/generateLicenseHuman", method = RequestMethod.POST)
	public @ResponseBody String generateHumanLicense(@RequestBody License license) {

		String targetUniQLicense = license.getAppName() + "#" + license.getEmail() + "#" + license.getCity() + "#"
				+ license.getDateDebut() + "#" + license.getVersion() + "#" + license.getDateFin() + "#"
				+ license.getCountry() + "#" + license.getModule() + "#" + license.getState();
		String decryptedUniQLicense = encrypt(targetUniQLicense);
		System.out.println(decryptedUniQLicense);
		return decryptedUniQLicense;

	}
	
	@RequestMapping(value = "/generateLicenseStock", method = RequestMethod.POST)
	public @ResponseBody String generateStockLicense(@RequestBody License license) {

		String targetUniQLicense = license.getAppName() + "#" + license.getEmail() + "#" + license.getCity() + "#"
				+ license.getDateDebut() + "#" + license.getVersion() + "#" + license.getDateFin() + "#"
				+ license.getCountry() + "#" + license.getModule() + "#" + license.getState();
		String decryptedUniQLicense = encrypt(targetUniQLicense);
		System.out.println(decryptedUniQLicense);
		return decryptedUniQLicense;

	}
	
	@RequestMapping(value = "/generateLicenseExpenses", method = RequestMethod.POST)
	public @ResponseBody String generateLicenseExpenses(@RequestBody License license) {

		String targetUniQLicense = license.getAppName() + "#" + license.getEmail() + "#" + license.getCity() + "#"
				+ license.getDateDebut() + "#" + license.getVersion() + "#" + license.getDateFin() + "#"
				+ license.getCountry() + "#" + license.getModule() + "#" + license.getState();
		String decryptedUniQLicense = encrypt(targetUniQLicense);
		System.out.println(decryptedUniQLicense);
		return decryptedUniQLicense;

	}
	
	
	
	@RequestMapping(value = "/generateLicenseDataIntegration", method = RequestMethod.POST)
	public @ResponseBody String generateLicenseDataIntegration(@RequestBody License license) {

		String targetUniQLicense = license.getAppName() + "#" + license.getEmail() + "#" + license.getCity() + "#"
				+ license.getDateDebut() + "#" + license.getVersion() + "#" + license.getDateFin() + "#"
				+ license.getCountry() + "#" + license.getModule() + "#" + license.getState();
		String decryptedUniQLicense = encrypt(targetUniQLicense);
		System.out.println(decryptedUniQLicense);
		return decryptedUniQLicense;

	}
	
	@RequestMapping(value = "/generateLicenseRegulatoryReport", method = RequestMethod.POST)
	public @ResponseBody String generateLicenseRegulatoryReport(@RequestBody License license) {

		String targetUniQLicense = license.getAppName() + "#" + license.getEmail() + "#" + license.getCity() + "#"
				+ license.getDateDebut() + "#" + license.getVersion() + "#" + license.getDateFin() + "#"
				+ license.getCountry() + "#" + license.getModule() + "#" + license.getState();
		String decryptedUniQLicense = encrypt(targetUniQLicense);
		System.out.println(decryptedUniQLicense);
		return decryptedUniQLicense;

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
