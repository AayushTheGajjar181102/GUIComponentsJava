package components;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Components extends ManageComponents implements ActionListener{
	
	String[] labels = {"First Name", "Last Name", "Email", "Mobile No"};
	
	Components(){
		
		super("Student Form");
		
		for(String label : labels){
			addLabel(label);
			addTextField();
		}
		
		addButton("submit");
		button.get(button.size()-1).addActionListener(this);
		
		for(int i=0; i<4; i++)
			addLabel();
		
		setFrame();
	}
	
	
	public void actionPerformed(ActionEvent e){
		
		int setindex = 3;
		int getindex = -1;
		
		if(e.getActionCommand() == "submit"){
			
			System.out.println("Submit Button is clicked ...");
			
			for(JTextField text : input){
				
				if(text.getText().equals(""))
					setLabel(++setindex, text.getText());
				else
					setLabel(++setindex, label.get(++getindex).getText()+" = "+text.getText());
					
			}
		}
	}
	
	
	public static void main(String[] args){
		
		Components com = new Components();
		com.setFrame();
	}
}