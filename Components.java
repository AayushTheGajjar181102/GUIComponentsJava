package components;

public class Components extends ManageComponents{
	
	
	String[] name = {"Aayush", "Shivam", "Jenil", "Tirth", "Anshul", "Riddhi", "Diya", "Nirali"};
	Components(){
		
		super("My Frame");
		
		addLabel("Hello World");
		
		for(int i=0; i<name.length; i++)
			addLabel(name[i]);
	}
	
	public static void main(String[] args){
		
		new Components();
	}
}