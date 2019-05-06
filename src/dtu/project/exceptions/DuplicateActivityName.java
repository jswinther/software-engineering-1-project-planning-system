package dtu.project.exceptions;

public class DuplicateActivityName extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String duplicateActivity = "Activity name already taken";
	
	
	public String toString()
	{
		return duplicateActivity;
	}
}