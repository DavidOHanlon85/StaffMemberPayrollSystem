/**
 * 
 */
package slideDeckExercises;

/**
 * 
 */
public class StaffMember {

	// Instance variables

	private String firstName;
	private String lastName;
	
	// Getters and setters

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// toString Method
	
	@Override
	public String toString() {
		return "StaffMember [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
