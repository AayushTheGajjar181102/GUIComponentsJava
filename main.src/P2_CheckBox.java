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
	
	public void itemStateChanged(ItemEvent e){
		
		JCheckBox box = (JCheckBox) e.getItem();
		String text;
		
		if(box.isSelected())
			text = box.getText()+" CheckBox Selected ...";
		else
			text = box.getText()+" CheckBox Unselected ...";
		
		//setLabel(0, text, text.length()+400);
		
		recent(0, label).setText(text);
		recent(0, label).setBounds(xstart, recent(0, label).getY(), text.length()+400, height);
	}
}