package com.example.sportsort;

import java.io.*;
public class FileIOEvent {
	
	
	public static int readFromEventsFile (String fileName) {
		try {
			RandomAccessFile eventsFile = new RandomAccessFile(fileName, "r");
			
			//eventsFile.seek
			
			
			return EventGlobals.FILE_OK;
		}catch(IOException error){
			return EventGlobals.FILE_ERROR;
		}
	}
	
	public static int writeNewEvent (String fileName, Event event) {
		try {
			RandomAccessFile eventsFile = new RandomAccessFile(fileName, "rw");
			
			eventsFile.seek(eventsFile.length());
			
			String eventLine = prepEvent(event);
			
			eventsFile.write(eventLine.getBytes());
			eventsFile.close();
			
			return EventGlobals.FILE_OK;
		}catch(IOException error){
			return EventGlobals.FILE_ERROR;
		}
	}
	
	private static String arrayToString(byte[] list) {
		String text = "";
		for (int i = 0; i < list.length; i ++) {
			text = text+list[i];
		}
		return text;
	}
	private static String prepEvent (Event event) {
		String fileText = "";
		fileText += EventGlobals.TITLE_START + event.getTitle();
		fileText += EventGlobals.DATE_START + arrayToString(event.getDate());
		fileText += EventGlobals.START_TIME_START + arrayToString(event.getStartTime());
		fileText += EventGlobals.END_TIME_START;
		if (event.getEndTime()[0] != -1) {fileText += event.getEndTime().toString();}
		
		fileText += EventGlobals.CATEGORIES_START +  event.getCategories().toString();
		fileText += EventGlobals.PARTICIPANTS_START + event.getParticipants().toString();
		fileText += EventGlobals.DESCRIPTION_START + event.getDescription();
		if(event.getRepeat()) {fileText += EventGlobals.REPEAT_START + "true";}
		else {fileText += EventGlobals.REPEAT_START + "false";}
		
		fileText += EventGlobals.EVENT_END;
		return fileText;
	}
	
	
}
