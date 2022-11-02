package classes;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Component.*;
import components.*; //new

public class CheckBox extends ManageComponents{
	
	CheckBox(){
		
		super("Select CheckBox");
		
		addMultiples(label, null, "Select : ");
		
		addMultiples(checkbox, true, "C++", "Java", "Python", "JavaScript");
		
		setFrame();
	}
	
	public static void main(String[] args){
		
		new CheckBox();
	}
}