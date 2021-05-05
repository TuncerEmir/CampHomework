package Entities;

public class Player {
	
	private int id;
	private String birthDay;
	private String firstName;
	private String lastName;
	private String identityNumber;
	
	public Player() {
		
	}

	public Player(int id, String birthDay, String firstName, String lastName, String identityNumber) {
		
		super();
		this.id = id;
		this.birthDay = birthDay;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	
	
	
}
