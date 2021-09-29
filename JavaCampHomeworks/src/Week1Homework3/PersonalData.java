package Week1Homework3;

import java.time.LocalDate;

public class PersonalData {

	private LocalDate birthDate;
	
	private String adress;
	
	private long ssn;

	public PersonalData(LocalDate birthDate, long ssn) {
		super();
		this.birthDate = birthDate;
		this.adress = adress;
		this.ssn = ssn;
	}
	public PersonalData(int year,int month,int day,long ssn) {
		super();
		this.birthDate = LocalDate.of(year, month, day);
		this.ssn=ssn;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getSsn() {
		return ssn;
	}

	
	
}
