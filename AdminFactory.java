/**
 * 
 */
package slideDeckExercises;

/**
 * 
 */
public class AdminFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaffMember s1 = new StaffMember();
		
		s1.setFirstName("John");
		s1.setLastName("McGowan");
		
		System.out.println(s1);
		
		Doctor d1 = new Doctor();
		d1.setFirstName("Dr.");
		d1.setLastName("McDoctorson");
		d1.setWard(4);
		
		System.out.println(d1);
		
		Programmer p1 = new Programmer();
		p1.setFirstName("Bill");
		p1.setLastName("Gates");
		p1.setLanguage("Java");
		
		System.out.println(p1);
		
		

	}

}
