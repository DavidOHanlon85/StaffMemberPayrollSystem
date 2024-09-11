/**
 * 
 */
package slideDeckExercises;

/**
 * 
 */
public class Programmer extends StaffMember {

	// Instance Variable

	private String language;

	// Getters and setters

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Programmer [language=" + language + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + "]";
	}

}
