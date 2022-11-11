package classes;

import java.util.*;
import java.awt.*;
import components.*;
import javax.swing.*;
import java.awt.event.*;

public class Practice extends ManageComponents{
	
	Practice(){
		
		super("Practice");
		addSingle(label, "Welcome to Practice");
		setSingle(label, "Hello Practice", 200, 50, 200, 30);
		setFrame();
	}
	
	public static void main(String[] args){
		
		new Practice();
	}
}