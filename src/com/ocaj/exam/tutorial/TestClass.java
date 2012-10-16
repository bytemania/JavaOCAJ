package com.ocaj.exam.tutorial;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

import com.sun.istack.internal.logging.Logger;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		/*Ensure directory has been created*/
		new File("logs").mkdir();
		/*Get the date to be used in the filename*/
		DateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
		Date now = new Date();
		String date = df.format(now);
		String logFileName = "logs\\testlog-" + date + ".txt";
		/*Set up Logger*/
		FileHandler myFileHandler = new FileHandler(logFileName);
		myFileHandler.setFormatter(new SimpleFormatter());
		Logger ocajLogger = Logger.getLogger("OCAJ Logger",TestClass.class);
		ocajLogger.setLevel(Level.ALL);
		ocajLogger.info("\nThis is a logged information message.");
		myFileHandler.close();
	}

}
