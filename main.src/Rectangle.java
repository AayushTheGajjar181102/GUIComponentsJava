package classes;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import components.*; // new 
import java.awt.event.*;

public class Rectangle extends ManageComponents{
	
	String[] recsize = {"Width", "Height"};
	
	Rectangle(){
		
		super("Rectangle Area");
		
		for(String size : recsize){
			addLabel(size);
			addTextField();
		}
			
		addButton("Submit", true);
		addLabel();
		
		setFrame();
	}
	
	public static void main(String[] args){
		
		new Rectangle();
	}
	
	public void actionPerformed(ActionEvent e){
		
		boolean flag = true;
		int[] size = new int[recsize.length];
		int start = 0;
		
		if(e.getActionCommand() == "Submit"){
			
			for(JTextField text : input){
				
				if(!text.getText().equals(""))
					size[start++] = Integer.parseInt(text.getText());
			}
			
			for(int value : size){
				
				if(value == 0){
					flag = false;
					break;
				}
			}
			
			if(flag)
				recent(label).setText("Area = "+size[0]+" * "+size[1]+" = "+String.valueOf(size[0]*size[1]));
			else
				recent(label).setText("Area = null");
		}
			
	}
}