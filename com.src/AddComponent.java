package components;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

interface AddComponent{
	
	//Add Single List Components
	<T extends JComponent> void addSingle(ArrayList<T> list);
	<T extends JComponent> void addSingle(ArrayList<T> list, String text);
	<T extends JComponent> void addSingle(ArrayList<T> list, String text, boolean event);
	
	//Add Multiple List Components
	<T extends JComponent> void addMultiples(ArrayList<T> list, int total);
	<T extends JComponent> void addMultiples(ArrayList<T> list, String... texts);
	<T extends JComponent> void addMultiples(ArrayList<T> list, boolean event, String... texts);
	
}


