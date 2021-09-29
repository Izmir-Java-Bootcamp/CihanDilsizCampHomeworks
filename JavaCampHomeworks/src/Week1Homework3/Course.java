package Week1Homework3;

public class Course {
	private String name;
    private Student[] students;
    private int capacity;
    private int numberOfStudent=0;
	
    public Course(String name) {
		this.name = name;
		this.capacity=40;
		students=new Student[this.capacity];
	}
    public Course(String name,int capacity) {
		this.name = name;
		this.capacity=capacity;
		students=new Student[this.capacity];
	}
	public String getName() {
		return name;
	}
	public Student[] getStudents() {
		return students;
	}
	public int getNumberOfStudent() {
		return numberOfStudent;
	}
	public boolean addStudent(Student student) {
		if(getNumberOfStudent()==this.capacity) {
			System.out.println("\nYeterli kapasite yok ��renci eklenemedi");
			return false;
		}
		if(getNumberOfStudent()>0) {
			System.out.println();
			for(int i=0;i<getNumberOfStudent();i++) {
				if(students[i].getId()==student.getId()) {
					System.out.println("Ayn� ��renci �ki kez eklenemez");
					return false;
				}
			}
		}
		
		students[getNumberOfStudent()]=student;
		System.out.println(student.toString()+" Derse eklendi");
		this.numberOfStudent++;
		return true;
	}
	
	public boolean dropStudent(Student student) {
		int index=-1;
		Student[] studentsSub=new Student[this.capacity];
		
		for(int i=0;i<getNumberOfStudent();i++) {
			if(students[i].getId()==student.getId()) {
				index=i;
				break;
			}
		}
		
		if(index<0) {
			System.out.println("B�yle bir ��renci bulunmad�");
				return false;
		}
		else if(index==0) {
			for(int i=1;i<getNumberOfStudent();i++)
			studentsSub[i-1]=students[i];
		}
		else {
			for(int i=0;i<index;i++) {
				studentsSub[i]=students[i];
			}
			for(int i=index+1;i<getNumberOfStudent() ;i++) {
				studentsSub[i]=students[i];
			}
		}
		students=studentsSub;
		this.numberOfStudent--;
		return true;	
	}
	public void increaseCapacity() {
		this.capacity+=5;
		Student[] studentsSub=new Student[this.capacity];
		for(int i=0;i<students.length;i++) {
			studentsSub[i]=students[i];
		}
		students=studentsSub;
	} 
	public Student getBestStudent() {
		Student studentMaxGpa=students[0];
		for(int i=1;i<getNumberOfStudent();i++) {
			if(students[i].getGpa()>=studentMaxGpa.getGpa()) {
				studentMaxGpa=students[i];
			}
		}
		return studentMaxGpa;
	}
	public Student getYoungestStudent(){
		Student  youngestStudent=students[0];
		for(int i=1;i<this.getNumberOfStudent();i++) {
			if(students[i].getPd().getBirthDate().compareTo(youngestStudent.getPd().getBirthDate())<0) {
				youngestStudent=students[i];
			}
		}
		
		return youngestStudent;
	}
	public void clear() {
		Student[] studentsSub=new Student[this.capacity];
		students=studentsSub;
		this.numberOfStudent=0;
	}
	public void list() {
		if(this.getNumberOfStudent()==0) {
			System.out.println("Bu s�n�fta hi�bir ��renci bulunmuyor");
		}else {
			System.out.println(this.name+" Dersi ��rencileri");
			for( int i=0;i<getNumberOfStudent();i++) {
				System.out.println(this.students[i].toString());
			}    
		}
	}
	@Override
	public String toString() {
		return "Course Name=" + name + ", Capacity=" + capacity + ", Number Of Student=" + numberOfStudent ;
	}
	
    
    
}
