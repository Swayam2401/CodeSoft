public class StudentData{

	private String name;
	private int id;

	private int maths;
	private int physics;
	private int chemistry;
	private int english;
	private int computer;

	public StudentData(String name,int id,int maths,int phy,int che,int eng,int com){
		this.name = name;
		this.id = id;
		this.maths = maths;
		this.physics = phy;
		this.chemistry = che;
		this.english = eng;
		this.computer = com;
	}

	public int getId(){
		return this.id;
	}

	public String getName(){
		return this.name;
	}

	public float getTotal(){
       return maths + physics + chemistry + english + computer;
	}

	public float getAvg(){
        return getTotal() / 5;
	}

	public float percent(){
		return getTotal() * 100 / 500;
	}
    public char getGrade(){
    	return getGrade(percent());
    }
	private char getGrade(float val){
       
       if(val < 33){
       	return 'F';
       }

       if(val >= 33 && val < 51){
       	return 'E';
       }

       if(val >= 51 && val < 71){
       	return 'D';
       }

       if(val >=71 && val < 81){
        return 'C';
       }

       if(val >= 81 && val < 91){
       	return 'B';
       }

       return 'A';
	}
}