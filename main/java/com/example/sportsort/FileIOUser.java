package com.example.sportsort;

import java.io.*;
import java.util.ArrayList;
public class FileIOUser {
	
	
	public static int readFromUsersFile (String fileName) {
		try {
			RandomAccessFile UsersFile = new RandomAccessFile(fileName, "r");
			
			//UsersFile.seek
			
			
			return UserGlobals.FILE_OK;
		}catch(IOException error){
			return UserGlobals.FILE_ERROR;
		}
	}
	
	public static int writeNewUser (String fileName, User user) {
		try {
			RandomAccessFile usersFile = new RandomAccessFile(fileName, "rw");
			
			usersFile.seek(usersFile.length());
			
			String userLine = prepUser(user);
			
			usersFile.write(userLine.getBytes());
			usersFile.close();
			
			return UserGlobals.FILE_OK;
		}catch(IOException error){
			return UserGlobals.FILE_ERROR;
		}
	}
	
	private static String prepUser (User user) {
		String fileText = "";
		
		fileText += UserGlobals.NAME_START + user.getName();
		fileText += UserGlobals.INTERESTS_START + user.getInterests().toString();
		fileText += UserGlobals.SKILLS_START + user.getSkillLevels().toString();
		fileText += UserGlobals.ENDORSEMENTS_START +""+ user.getEndorsement();
		if(user.getPrivacy()) {fileText += UserGlobals.PRIVACY_START + "true";}
		else {fileText += UserGlobals.PRIVACY_START + "false";}
		fileText += UserGlobals.CURRENT_EVENTS_START + user.getCurrentEvents().toString();
		fileText += UserGlobals.EVENT_HISTORY_START + user.getPreviousEvents().toString();
		fileText += UserGlobals.USER_END;
		return fileText;
	}
	
	
}
