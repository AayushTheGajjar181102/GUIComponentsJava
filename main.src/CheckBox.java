package classes;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import components.*;

class CheckBox extends ManageComponents{
	
	CheckBox(){
		
		super("Select CheckBox");
		
		addLabels(null, "Select : ");
		
		addCheckBoxes(true, "C++", "Java", "Python", "JavaScript");
		
		setFrame();
	}
	
	public static void main(String[] args){
		
		new CheckBox();
	}
}