package main;

public class Subject {
	String name;
	String teacher;
	String classroom;

	public String getName () {
		return name;
	}

	public String getTeacher () {
		return teacher;
	}

	public String getClassroom () {
		return classroom;
	}


	public Subject ( String name, String teacher, String classroom ) {
		this.name = name;
		this.teacher = teacher;
		this.classroom = classroom;
	}
}
