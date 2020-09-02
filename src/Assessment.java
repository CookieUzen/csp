package Assessment;
import java.util.Date;
import main.*;

public class Assessment {
	Date time;				// A date object containing time of assessment
	String name;			// Name of assessment
	String subjectName;		// Name of Subject
	String submissionType;	// Type of Submission: Performance, Dropbox, Presentation
	String status;			// Status of submission: Pending, Submitted

	// get functions
	public Date getTime () {
		return time;
	}

	public String getName () {
		return name;
	}

	public String getSubjectName () {
		return subjectName;
	}

	public String getSubmissionType () {
		return submissionType;
	}

	public String getStatus () {
		return status;
	}

	// set functions
	public void setTime ( Date time ) {
		this.time = time;
	}

	public void setName ( String name ) {
		this.name = name;
	}

	public void setSubjectName ( String subjectName ) {
		this.subjectName = subjectName;
	}

	public void setSubmissionType ( String submissionType ) {
		this.submissionType = submissionType;
	}

	public void setStatus ( String status ) {
		this.status = status;
	}

	// Allow defining empty Assessment 
	public Assessment () { }
	
	// Constructor for Assessment
	public Assessment ( Date time, String name, String subjectName, String submissionType, String status ) {
		this.time = time;
		this.name = name;
		this.subjectName = subjectName;
		this.submissionType = submissionType;
		this.status = status;
	}
}
