package week1;
public class StudentManagement {

    public Student Students[] = new Student[100];
    private int n = 0;
    public void setList(Student st)
    {
        if (n<100)
        {
            Students[n] = st;
            n++;
        }

    }
        // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        String str1 = s1.getGroup();
        String str2 = s2.getGroup();
        if(str1.equals(str2)) return true;
        else return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        int[] A = new int[100];
        int i,j;
        for( i = 0;i<n;i++) A[i] = 1;
        for( i = 0;i<n;i++ )
        {
            if(A[i] == 1)
            {
                String s = Students[i].getGroup();
                System.out.println("Danh sach Sinh Vien Lop " + s + " :");
                for(j=i;j<n;j++)
                {
                    if(Students[j].getGroup().equals(s))
                    {
                        System.out.println(Students[j].getName());
                        A[j] = 0;
                    }


                }
            }
        }
        // TODO:
    }

    void removeStudent(String id) {
        int i = 0, j;
        while(!Students[i].getId().equals(id)){
            i++;
        }
        j = i;
        while(Students[j+1] != null)
        {
            Students[j] = new Student(Students[j+1]);
            j++;
            i=j;
        }


        n--;



    }
        // TODO:
    }

    public static void main(String[] args) {
        StudentManagement Sm = new StudentManagement();
        Student st1 = new Student("Bui A","17020421","INT22041","buia@gmail.com");
        Student st2 = new Student("Bui Duy","17030121","INT22042","bsdf@gmail.com");
        Student st3 = new Student("Bui Duong","1702873","INT220401","17020228@vnu.edu.vn");
	    Student st4 = new Student(st2);
        System.out.println(Sm.sameGroup(st1, st3));
        Sm.setList(st1);
        Sm.setList(st2);
        Sm.setList(st3);
        Sm.setList(st4);
        Sm.studentsByGroup();
        Sm.removeStudent("170204");
        Sm.studentsByGroup();
        // TODO:
    }
}
