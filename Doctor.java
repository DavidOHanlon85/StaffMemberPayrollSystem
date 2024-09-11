/**
 * 
 */
package slideDeckExercises;

import inClassCodingAlong.StaffMember;

/**
 * 
 */
public class Doctor extends StaffMember {
	
	// Instance Variables
	
	private int ward;

	// Getters and Setters

	/**
	 * @return the ward
	 */
	public int getWard() {
		return ward;
	}

	/**
	 * @param ward the ward to set
	 */
	public void setWard(int ward) {
		this.ward = ward;
	}

	@Override
	public String toString() {
		return "Staff Member [First Name =" + this.getFirstName() + ", Last Name =" + this.getLastName() + ", Ward=" + this.ward + "]";
	}

	

	


	
	

}
