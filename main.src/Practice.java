package classes;

import java.util.*;
import java.awt.*;
import components.*;
import javax.swing.*;
import java.awt.event.*;

public class Practice extends ManageComponents{
	
	Practice(){
		
		super("Practice");
		addSingle(label, new JLabel(), "Welcome to Practice");
		setFrame();
	}
	
	public static void main(String[] args){
		
		new Practice();
	}
}