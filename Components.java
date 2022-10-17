package components;

public class Components extends ManageComponents{
	
	
	Components(){
		
		super("My Frame");
			
		addLabel("Hello GLS, Hello BCA");
		addLabel("My name is Aayush");
		addLabel("My name is Aayush Naval Gajjar");	
	}
	
	public static void main(String[] args){
		
		new Components();
	}
}