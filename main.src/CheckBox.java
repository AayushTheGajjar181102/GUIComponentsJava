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
	
	public void itemStateChanged(ItemEvent e){
		
		JCheckBox box = (JCheckBox) e.getItem();
		String text;
		
		if(box.isSelected())
			text = box.getText()+" CheckBox Selected ...";
		else
			text = box.getText()+" CheckBox Unselected ...";
		
		//setLabel(0, text, text.length()+400);
		
		recent(0, label).setText(text);
		recent(0, label).setBounds(xstart, getY(), text.length()+400, height);
	}
}