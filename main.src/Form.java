package classes;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import components.*; // new
import java.awt.event.*;

public class Form extends ManageComponents{
	
	String[] labels = {"First Name", "Last Name", "Email", "Mobile No"};
	
	Form(){
		
		super("Registration Form");
		
		for(String text : labels){
			
			addSingle(label, text);
			addSingle(input);
		}
		
		addSingle(button, "Submit", true);
		addMultiples(label, labels.length);
		
		setFrame();
	}
	
	public static void main(String[] args){
		
		new Form();
	}
	
	public void actionPerformed(ActionEvent e){
		
		int index = labels.length;
		int start = 0;
		
		if(e.getActionCommand() == "Submit"){
			
			System.out.println("submit button clicked.");
			
			for(JTextField text : input){
				
				if(text.getText().equals(""))
					setSingle(label, index++, recent(start++, label).getText()+" = null");
				else
					setSingle(label, index++, recent(start++, label).getText()+" = "+text.getText());
			}
		}
	}
}