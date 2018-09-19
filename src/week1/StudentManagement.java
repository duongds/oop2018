package week1;

public class StudentManagement {
  
       private static ArrayList<Student> students = new ArrayList<Student>(100);
        // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        String str1 = s1.getGroup();

        String str2 = s2.getGroup();
       
        if(str1.equals(str2)) return true;
        else return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        HashSet<String> List = new HashSet<String>();
	
        for(Student st: students) {
	    
	List.add(st.getGroup());
	    }
	   
        for(String Group : List) {System.out.println("Class"+ Group);
	    	for(Student st:students) {
	    		if        (st.getGroup().equals(Group)) {
	    			        System.out.println(st.getInfo());
	    		}
	    	}
	    }
        // TODO:
    }

    void removeStudent(String id) {
        int length = students.size();

        Student student = null;
		
        for(int i = 0; i < length; i++){
             if(students.get(i).getId() == id){
			                 student = students.get(i); 
			                 break;
			}
		}
		        if(student != null) students.remove(student);

        else System.out.println("Can't not Detele!");
        // TODO:
    }

    public static void main(String[] args) {
        Student st1 = new Student();
		
        st1.setName("Bùi Nguyễn Minh Dương");
		
        st1.setId("17020652");
		
        st1.setGroup("INT22041");
		
        st1.setEmail("buiduong76021@gmail.com");
		              System.out.println(st1.getName());
		                System.out.println(st1.getInfo());
		
        Student st2 = new Student();
		
        st2.setName("Bùi Nguyễn Minh Dương");
		
        st2.setId("17020652");

        st2.setGroup("INT22042");

	st2.setEmail("buiduong76021@gmail.com");

        Student st3 = new Studen("Bùi Dương","1702873","17020228@vnu.edu.vn");

	Student st4 = new Student(st2);
	
	students.add(st1);
		
        students.add(st2);
	
	students.add(st3);
	
	students.add(st4);
	
	StudentManagement student = new StudentManagement();
		       if(student.sameGroup(st1, st2)) System.out.println("Cùng lớp");
		else System.out.println("Không Cùng lớp");
		
	
        // TODO:
    }
}
