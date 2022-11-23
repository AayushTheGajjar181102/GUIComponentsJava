package components;

import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ManageComponents extends ManageLayouts implements AddComponent, SetComponent, Serializable{
	
	public ManageComponents(String frame){
		
		super(frame);
	}
	
	// add Single List Components
	public <T extends JComponent> void addSingle(ArrayList<T> list){
		
		addSingle(list, null, false);
	}
		
	public <T extends JComponent> void addSingle(ArrayList<T> list, String text){
		
		addSingle(list, text, false);
	}
	
	public <T extends JComponent> void addSingle(ArrayList<T> list, String text, boolean event){
	
		addDefault(list, text, event);
	} 
	
	// add Multi List Components
	public <T extends JComponent> void addMultiples(ArrayList<T> list, int total){
		
		for(int i=0; i<total; i++)
			addSingle(list, null, false);
	}
	
	public <T extends JComponent> void addMultiples(ArrayList<T> list, String... texts){
		
		addMultiples(list, false, texts);
	}
	
	public <T extends JComponent> void addMultiples(ArrayList<T> list, boolean event, String... texts){
		
		for(String text : texts)
			addSingle(list, text, event);
	}
	
	
	// set List Components
	public <T extends JComponent> void setSingle(ArrayList<T> list, int event){
		
		setDefault(list, recentIndex(list), null, event, null);
	}
	
	public <T extends JComponent> void setSingle(ArrayList<T> list, String text){
		
		setDefault(list, recentIndex(list), text, -1, null);
	}
	
	public <T extends JComponent> void setSingle(ArrayList<T> list, int... bounds){
		
		setDefault(list, recentIndex(list), null, -1, bounds);
	}
	
	public <T extends JComponent> void setSingle(ArrayList<T> list, String text, int event){
	
		setDefault(list, recentIndex(list), text, event, null);
	}

	public <T extends JComponent> void setSingle(ArrayList<T> list, String text, int... bounds){
	
		setDefault(list, recentIndex(list), text, -1, bounds);
	}
	
	public <T extends JComponent> void setSingle(ArrayList<T> list, int index, int event){
		
		setDefault(list, index, null, event, null);
	}

	public <T extends JComponent> void setSingle(ArrayList<T> list, int index, String text){
		
		setDefault(list, index, text, -1, null);
	}

	public <T extends JComponent> void setSingle(ArrayList<T> list, int index, String text, int event){
		
		setDefault(list, index, text, event, null);
	}

	public <T extends JComponent> void setSingle(ArrayList<T> list, int index, String text, int... bounds){
		
		setDefault(list, index, text, -1, bounds);
	}
}