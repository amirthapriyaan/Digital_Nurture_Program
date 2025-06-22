package MVCPatternExample;

public class MVCPatternTest {
	public static void main(String[] args) {
		
		Student stud=new Student("A","s1","O");
		
		StudentView view=new StudentView();
		
		StudentController control=new StudentController(stud,view);
		
		control.update();
		
		 control.setName("B");
	     control.setStudentId("S2");
	     control.setStudentGrade("A+");
	     control.update();
		
	}
}
