import java.util.*;
import main.Subject;
import main.Student;

public class main {
	public static void main (String[] args) {
		// Create a new student called foo
		Student foo = new Student();

		// Give Foo two subjects, Math and Physics
		foo.subjects.add(new Subject("Math","Platt","A504"));
		foo.subjects.add(new Subject("Physics","Platt","A504"));

		// Print the name of the teacher that teaches Foo Physics
		System.out.println(foo.getSubjectName("Physics").getTeacher());

		// Prints out the name of all the classes Platt teaches
		ArrayList<Subject> platt = foo.getSubjectTeacher("Platt");
		for ( int i = 0; i < platt.size(); i++ )
			System.out.println(platt.get(i).getName());
	}
}
