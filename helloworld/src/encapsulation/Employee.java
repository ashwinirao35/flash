package encapsulation;

public class Employee {

	private String id; //private field
	 
    public String getId() { //private field accessed inside public method
           return id;
    }
 
    public void setId(String id) {
           this.id = id;
    }
    
}
 
