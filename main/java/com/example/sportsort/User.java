package com.example.sportsort;

import java.util.ArrayList;

public class User {
	
	//Declares global variables
	String name;
	ArrayList<String> interests;
	ArrayList<Integer> skillLevel;
	short endorsement;
	ArrayList<String> currentEvents;
	ArrayList<String> previousEvents;
	boolean privacy;
	
	//Constructor
	public User(String n, ArrayList<String> i, ArrayList<Integer> sk, short e, ArrayList<String> c, ArrayList<String> p, boolean priv){
		//Assigns parameters to relevant global variables
		name = n;
		interests = i;
		skillLevel = sk;
		endorsement = e;
		currentEvents = c;
		previousEvents = p;
		privacy = priv;	
	}
	
	
	
	//getter methods
	public String getName() {
		return name;
	}
	
	public ArrayList<String> getInterests() {
		return interests;
	}
	
	public ArrayList<Integer> getSkillLevels() {
		return skillLevel;
	}
	
	public short getEndorsement() {
		return endorsement;
	}
	public ArrayList<String> getCurrentEvents() {
		return currentEvents;
	}
	public ArrayList<String> getPreviousEvents() {
		return previousEvents;
	}
	public boolean getPrivacy() {
		return privacy;
	}
	
	
	//setter methods
	public void setName(String m) {
		name = m;
	}
	public void addInterest(String n) {
		interests.add(n);
	}
	public String removeInterest(String o) {
		interests.remove(o);
		return o;
	}
	public void addSkillLevel(int p) {
		skillLevel.add(p);
	}
	public int removeSkillLevel(int q) {
		skillLevel.remove(q);
		return q;
	}
	public void setEndorsement(short r) {
		endorsement = r;
	}
	public void addCurrentEvent(String s) {
		currentEvents.add(s);
	}
	public String removeCurrentEvent(String t) {
		currentEvents.remove(t);
		return t;
	}
	public void addPreviousEvent(String u) {
		previousEvents.add(u);
	}
	public String removePreviousEvent(String v) {
		previousEvents.remove(v);
		return v;
	}
	public void togglePrivacy() {
		privacy = !privacy;
	}
}
