# Central Studying Platform

CSP is a program that allows IB students to organize their school work systematically.
It would include a *Calendar*, *Assessment Database*, *Project Manager*, and a *Todolist*.
z
All of the data created would be stored in a database file.
In order to sync the database across many devices, the user would only have to sync the database file.

## Calendar
The calendar contains information about the upcoming classes.
The calendar should automatically generate the schedule based on a provided cycle, and have self correcting features to manually set the current class of the day.

## Assessment Database
The Assessment Database shows information about the upcoming assessments.
The assessments would be scraped from the ManageBac Dashboard iCal file.

## Project Manager
The Project Manager allows the user to categorize their homework/assessments to classes.
The program would allow students to dedicate a specific amount of time to each task, when to do it, and store information on the completion rate.
It would also provide a feature that allows the student to "do" their task;
taking down a time stamp of when they started and when they ended.

## Todolist
The todolist contains the non academic related tasks of a student.
It should store the data based on the "todo.txt" format.

# Objects
**Subject**
```java
String name			// Name of Subject
String teacher		// Name of Teacher
String classroom	// Location of Classroom
```

## Calendar

**Class**
```java
int time			// Time since start of day
Subject subject		// Subject Class
```

**Day**
```java
int date			// Days since 2000
Class classes[4]	// An array of Classes
```

**Schedule**
```java
ArrayList<Day> schedule = new ArrayList<Day>();	// ArrayList of Day in a month
```

## Assessment Database
**Assessment**
```java
int time			// Time since start of day
Subject subject		// Subject Class
String submission	// Submission Type
```

**Subject Database**
```java
ArrayList<Assessment> database = new ArrayList<Assessment>();	// ArrayList of all the assessment for one class
```

## Todo

## Planner
