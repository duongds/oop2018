package week1;

public class Student {
    
    private String name;
    private String id;

    private String group;
    private String email;
    // TODO: khai báo các thuộc tính cho Student

    public String getName(){
		return name;
	}
	    public void setName(String name){
		this.name = name;
	}
	
    public String getId(){
		return id;
	}
	      public void setId(String id){
		this.id = id;
	}
	    public String getGroup(){return group;}
	
    public void setGroup(String group)
	{
  
            this.group = group;
	}
	
    public String getEmail(){return email;}
	
    public void setEmail(String email)
	{
	
         	if(email == null || email.isEmpty()){
			                     this.email = "Group không hợp lệ!";	}
		                else this.email = email;
	}
    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     */
    Student() {
        this.name = "Student";
    	
        this.id = "000";
    	
        this.group = "INT22041";
    	
        this.email = "uet@vnu.edu.vn";
    
        // TODO:
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        this.name = n;
        
        this.id = sid;
 
        this.email = em;
    
        // TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        this.name  = s.name;
        
        this.id = s.id;
        
        this.group = s.group;
       
        this.email = s.email;
        // TODO:
    }

    String getInfo() {
        String s = name + " " + id + " " + group +" " +email;
               return s;
        // TODO:
        
    }
}
