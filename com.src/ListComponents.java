package components;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.reflect.*;

class ListComponents extends JFrame implements GetComponent{
	
	protected String previous, current;
	protected ArrayList<JLabel> label;
	protected ArrayList<JTextField> input;
	protected ArrayList<JButton> button;
	protected ArrayList<JCheckBox> checkbox;
	protected ArrayList<JPasswordField> password;
	
	private void setObjects(){
		
		label = new ArrayList<JLabel>();
		input = new ArrayList<JTextField>();
		button = new ArrayList<JButton>();
		checkbox = new ArrayList<JCheckBox>();
		password = new ArrayList<JPasswordField>();
	}
	
	ListComponents(String frame){
		
		super(frame);
		setObjects();
	}
	
	ListComponents(){}
	
	//Get List Component
	public <T> T recent(ArrayList<T> list){
		
		if(list.size() > 0)
			return list.get(list.size()-1);
		else
			return null;
	}
	
	public <T> T recent(int serial, ArrayList<T> list){
		
		if(list.size() > serial && serial >= 0)
			return list.get(list.size()-(list.size()-serial));
		else
			return null;
	}
	
	public void getObject(String name) throws Exception{
		
		Field field = ListComponents.class.getDeclaredField(name);
		System.out.println(((Class)((ParameterizedType)field.getGenericType()).getActualTypeArguments()[0]).getSimpleName());
	}
	
	public <T> int recentIndex(ArrayList<T> list){
		
		if(list.size() > 0)
			return list.size()-1;
		else
			return -1;
	}
	
	public <T> String getClass(ArrayList<T> list){
		
		return recent(list).getClass().getSimpleName();
	}
	
	<T> T getNew(ArrayList<T> list){
		
		if(list == label)
			return (T) new JLabel();
		
		else if(list == input)
			return (T) new JTextField();
		
		else if(list == button)
			return (T) new JButton();
		
		else if(list == checkbox)
			return (T) new JCheckBox();
		
		else if(list == password)
			return (T) new JPasswordField();
		else
			return null;
	}
}