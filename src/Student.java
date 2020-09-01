package main;
import java.util.*;
import main.Subject;

// The student class store all the information about the current student
public class Student {
	public ArrayList<Subject> subjects; // ArrayList containing all of the student's subjects

	// Constructor for Student
	public Student () {
		subjects = new ArrayList<Subject>();
	}


	// Accepts a subject name (as string), returns a Subject object if a match is found in the subjects ArrayList. Else, return null.
	public Subject getSubjectName ( String subjectName ) {
		for ( int i = 0; i < subjects.size(); i++ )
			if ( subjectName.equals(subjects.get(i).getName()) ) 
				return subjects.get(i);

		return null;
	}

	// Accepts a teacher name (as a string), returns a ArrayList of all class taught by said teacher. If there is no teacher, return null.
	public ArrayList<Subject> getSubjectTeacher ( String subjectTeacher) {
		ArrayList<Subject> output = new ArrayList<Subject>();
		for ( int i = 0; i < subjects.size(); i++ )
			if ( subjects.get(i).getTeacher().contains(subjectTeacher) ) 
				output.add(subjects.get(i));

		if ( output.isEmpty() ) 
			return null;
		else
			return output;
	}

	// Accepts a Classroom (as a string), return an ArrayList of all classes in the classroom. If Classroom does not exsist, return null.
	public ArrayList<Subject> getSubjectClassroom ( String subjectClassroom ) {
		ArrayList<Subject> output = new ArrayList<Subject>();
		for ( int i = 0; i < subjects.size(); i++ )
			if ( subjects.get(i).getClassroom().contains(subjectClassroom) ) 
				output.add(subjects.get(i));

		if ( output.isEmpty() ) 
			return null;
		else
			return output;
	}
}
