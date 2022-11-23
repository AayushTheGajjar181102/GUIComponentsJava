package components;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ManageLayouts extends ListComponents implements ActionListener, ItemListener{
	
	protected int xstart, ystart, width, height, xinc, yinc;
	
	private void setVariables(){
		
		xstart = 50;
		ystart = 50;
		width = 200;
		height = 30;
		xinc = 0;
		yinc = 0;
	}
	
	public void getVariables(){
		
		System.out.println("\nxstart = "+xstart+", ystart = "+ystart+", xinc = "+xinc+", yinc = "+yinc);
	}
	
	<T> boolean manageLayout(ArrayList<T> list){
		
		boolean sameClass = false;
		
		if(current != null)
			previous = current;
		
		current = getClass(list);
		
		if(previous != null)
			sameClass = previous.equals(current);
		
		return sameClass;
	}
	
	<T extends JComponent> void addDefault(ArrayList<T> list, String text, boolean event){
		
		list.add(getNew(list));
		boolean sameLayout = manageLayout(list);
		
		if(list == label){
			
			if(sameLayout)
				yinc+=30;
			else
				yinc+=50;
			
			recent(list).setBounds(xstart, yinc, width, height);
			recent(label).setText(text);
		}
		
		else if(list == input){
			
			xinc=100;
			recent(list).setBounds(xstart+xinc, yinc, width, height);
			recent(input).setText(text);
		}
		
		else if(list == button){
			
			if(sameLayout)
				yinc+=30;
			else
				yinc+=70;
			
			recent(list).setBounds(xstart, yinc, width, height);
			recent(button).setText(text);
			
			if(event)
				recent(button).addActionListener(this);
		}
		
		else if(list == checkbox){
			
			yinc += 30;
			recent(list).setBounds(xstart, yinc, width, height);
			recent(checkbox).setText(text);
			
			if(event)
				recent(checkbox).addItemListener(this);
		}
		
		else if(list == password){
			
			xinc=100;
			recent(list).setBounds(xstart+xinc, yinc, width, height);
			recent(password).setText(text);
		}
		
		add(recent(list));
	}
	
	
	<T extends JComponent> void setDefault(ArrayList<T> list, int index, String text, int event, int... bounds){
		
		boolean isText, isEvent, areBounds;
		isText = isEvent = areBounds = false;
		
		if(text != null)
			isText = true;
		
		if(event != -1)
			isEvent = true;
		
		if(bounds != null && bounds.length == 4)
			areBounds = true;
		
		
		if(list == label){
			
			if(isText)
				recent(index, label).setText(text);
			
			if(areBounds)
				recent(index, label).setBounds(bounds[0], bounds[1], bounds[2], bounds[3]);
		}
		
		else if(list == input){
			
		
			if(isText)
				recent(index, input).setText(text);
			
			if(areBounds)
				recent(index, input).setBounds(bounds[0], bounds[1], bounds[2], bounds[3]);
		}
		
		else if(list == button){
			
			if(isText)
				recent(index, button).setText(text);
			
			if(areBounds)
				recent(index, button).setBounds(bounds[0], bounds[1], bounds[2], bounds[3]);
		}
		
		else if(list == checkbox){
			
			if(isText)
				recent(index, checkbox).setText(text);
			
			if(areBounds)
				recent(index, checkbox).setBounds(bounds[0], bounds[1], bounds[2], bounds[3]);
		}
		
		else if(list == password){
			
			if(isText)
				recent(index, password).setText(text);
			
			if(areBounds)
				recent(index, password).setBounds(bounds[0], bounds[1], bounds[2], bounds[3]);
		}
	}
	
	public void setFrame(){
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	ManageLayouts(String frame){
		
		super(frame);
		setVariables();
	}
	
	//Action Event
	public void actionPerformed(ActionEvent e){
		
		System.out.println("ActionEvent Statement: Here, Default actionPerformed() performed now.");
	
	}
	
	//Item Event
	public void itemStateChanged(ItemEvent e){
		
		System.out.println("ItemEvent Statement: Here, Default itemStateChanged() performed now.");
	}
}