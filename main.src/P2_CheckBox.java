package classes;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Component.*;
import components.*; //new

public class P2_CheckBox extends ManageComponents{
	
	P2_CheckBox(){
		
		super("Select CheckBox");
		
		//add multiple checkboxes
		addMultiples(label, null, "Select : ");
		addMultiples(checkbox, true, "C++", "Java", "Python", "JavaScript");
		
		//add single checkbox
		addSingle(checkbox, "Kotlin", true);
		
		setFrame();
	}
	
	public static void main(String[] args){
		
		new P2_CheckBox();
	}
}