package MVCPatternExample;

public class StudentController {
	private Student stud;
	private StudentView view;
	
	public StudentController(Student stud, StudentView view) {
		super();
		this.stud = stud;
		this.view = view;
	}

	public Student getStud() {
		return stud;
	}

	public void setName(String name) {
		stud.setName(name);
	}
	public void setStudentId(String id) {
	        stud.setId(id);
	}

	public void setStudentGrade(String grade) {
	        stud.setGrade(grade);
	}
	
	public void update() {
		view.show(stud.getName(),stud.getId(),stud.getGrade());
	}
	
}
