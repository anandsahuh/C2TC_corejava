package day15_exceptionhandling;

public class StudentIdNotFound extends Exception {

	int sid;

	StudentIdNotFound()
	{		
	}

	public StudentIdNotFound(int sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
      return "Exception :: Student id not found!!";
	}

	@Override
	public String getMessage() {
		return "Student with id "+ sid + " Not found!!";
	}
	
	
}
