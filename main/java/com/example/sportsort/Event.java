package com.example.sportsort;

import java.util.ArrayList;

public class Event {
	
	//Declaring global variables
	private boolean repeats;
	private String title;
	private ArrayList<String> categories;
	//CHANGE TO ArrayList<User>
	private ArrayList<String> participants;
	private String description;
	//date array represents date in following format: [DD,MM,YYYY]
	private byte[] date;
	//starTime array represents the start time in following format: [HH(hour in 24h format),MM(minute)]
	private byte[] startTime;
	//endTime array represents the start time in following format: [HH(hour in 24h format),MM(minute)]
	private byte[] endTime;
	
	//constructor with endTime
	public Event(boolean isRepeating, String titre, ArrayList<String> categorized, ArrayList<String> participantList, String desc, byte[] d, byte[] start, byte[] end) {
		//Assigns parameters to relevant global variables
		repeats = isRepeating;
		title = titre;
		categories = categorized;
		participants = participantList;
		date = d;
		startTime = start;
		endTime = end;
	}
	
	//constructor without endTime
	public Event(boolean isRepeating, String titre, ArrayList<String> categorized, ArrayList<String> participantList, String desc, byte[] d, byte[] start) {
		//Assigns parameters to relevant global variables
		repeats = isRepeating;
		title = titre;
		categories = categorized;
		participants = participantList;
		date = d;
		startTime = start;
		endTime = new byte[-1];
	}
	
	
	//getter methods
	public boolean getRepeat() {
	//returns if the event repeats or not
		return repeats;
	}
	public String getTitle() {
	//returns the title of the event
		return title;
	}
	public ArrayList<String> getCategories(){
	//returns the categories that the event applies to
		return categories;
	}
	public ArrayList<String> getParticipants(){
	//returns a list of the participants of the event
		return participants;
	}
	public String getDescription() {
	//returns the event description
		return description;
	}
	public byte[] getDate() {
	//returns the date on which the event happens
		return date;
	}
	public byte[] getStartTime() {
	//returns the time on which the event starts
		return startTime;
	}
	public byte[] getEndTime() {
	//returns the time on which the event ends
		return endTime;
	}
	
	
	
	//setter methods
	public void toggleRpt() {
	//toggles whether or not the event repeats
		repeats = !repeats;
	}
	public void setTitle(String m) {
	//changes the title of the event
		title = m;
	}
	public void addCategory(String n) {
	//adds a category to the category ArrayList
		categories.add(n);
	}
	public String removeCategory(String o) {
	//removes a category from the category ArrayList and returns the removed category
		categories.remove(o);
		return o;
	}
	public void addParticipant(String p) {
	//adds a participant to the participant ArrayList
		participants.add(p);
	}
	public String removeParticipant(String q) {
	//removes a participant from the participant ArrayList and returns the removed participant
		participants.remove(q);
		return q;
	}
	public void changeDate(byte[] r) {
	//changes the date of the event
		date = r;
	}
	public void changeStartTime(byte[] s) {
	//changes the starting time of the event
		startTime = s;
	}
	public void changeEndTime(byte[] t) {
	//changes the ending time of the event
		endTime = t;
	}
}
