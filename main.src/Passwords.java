package classes;

import java.util.*;
import java.awt.*;
import components.*;
import javax.swing.*;
import java.awt.event.*;

public class Passwords extends ManageComponents{
	
	Passwords(){
		
		super("Passwords");
		
		addSingle(label, "Password");
		addSingle(password);
		
		addSingle(label, "OTP");
		addSingle(password);
		
		setFrame();
	}
	
	public static void main(String[] args){
		
		new Passwords();
	}
}