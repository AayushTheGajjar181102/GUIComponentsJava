package components;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

interface SetComponent{
	
	//Set Single List Recent Components
	
	<T extends JComponent> void setSingle(ArrayList<T> list, int event);
	<T extends JComponent> void setSingle(ArrayList<T> list, String text);
	<T extends JComponent> void setSingle(ArrayList<T> list, int... bounds);
	<T extends JComponent> void setSingle(ArrayList<T> list, String text, int event);
	<T extends JComponent> void setSingle(ArrayList<T> list, String text, int... bounds);
	
	//Set Single List Indexed Components
	<T extends JComponent> void setSingle(ArrayList<T> list, int index, int event);
	<T extends JComponent> void setSingle(ArrayList<T> list, int index, String text);
	<T extends JComponent> void setSingle(ArrayList<T> list, int index, String text, int event);
	<T extends JComponent> void setSingle(ArrayList<T> list, int index, String text, int... bounds);
}