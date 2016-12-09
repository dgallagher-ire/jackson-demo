package jackson.demo;

public class Person1 {

	private Name name;
	private Gender gender;
	private boolean verified;
	private String userImage;
	
	public Person1(){
	}
	
	@Override
	public final String toString(){
		final StringBuilder sb = new StringBuilder();
		sb.append("First:").append(this.getName().getFirst()).append("\n");
		sb.append("Last:").append(this.getName().getLast()).append("\n");
		sb.append("Gender:").append(this.getGender().name()).append("\n");
		sb.append("Verified:").append(this.isVerified()).append("\n");
		sb.append("UserImage:").append(this.getUserImage()).append("\n");
		return sb.toString();
	}
	
	public final Name getName() {
		return name;
	}

	public final void setName(Name name) {
		this.name = name;
	}

	public final Gender getGender() {
		return gender;
	}

	public final void setGender(Gender gender) {
		this.gender = gender;
	}

	public final boolean isVerified() {
		return verified;
	}

	public final void setVerified(boolean verified) {
		this.verified = verified;
	}

	public final String getUserImage() {
		return userImage;
	}

	public final void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	
	public enum Gender {
		MALE, FEMALE;
	}
	
	public static final class Name {
		
		private String first;
		private String last;
		
		public Name(){
		}

		public final String getFirst() {
			return first;
		}

		public final void setFirst(String first) {
			this.first = first;
		}

		public final String getLast() {
			return last;
		}

		public final void setLast(String last) {
			this.last = last;
		}
		
	}
	
}
