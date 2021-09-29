package Week1Homework3;

public class Student {
	   private String name;
       private long id;
       private double gpa;
       private PersonalData pd;
	
       
   public Student(String name, long id, double gpa, PersonalData pd) {
    	super();
		this.name = name;
		this.id = id;
	    this.gpa = gpa;
		this.pd = pd;
    }


	public double getGpa() {
		return gpa;
	}


	public long getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public PersonalData getPd() {
		return pd;
	}


	@Override
	public String toString() {
		return "Student : Name=" + this.name + ", Id=" + this.id + ", Gpa=" + this.gpa + ", Adress="+this.pd.getAdress()+" , Birthdate="+this.pd.getBirthDate()+" ,Ssn="+this.pd.getSsn();
	}
	
	
       
	
       


}
