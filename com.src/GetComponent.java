package components;

import java.util.*;
import javax.swing.*;

interface GetComponent{
	
	<T> T recent(ArrayList<T> list);
	<T> T recent(int serial, ArrayList<T> list);
	
	<T> String getClass(ArrayList<T> list);
	<T> int recentIndex(ArrayList<T> list);
	void getObject(String name) throws Exception;
}