package student;

public class Student {
	   private String id, name; 
	   private int height, weight;
	
	Student(String i , String nm , int h , int w){
		this.id = i;
		this.name = nm; 
		this.height = h;
		this.weight = w;
	}
	
	Student(Student s){
		this.id = s.getId();
		this.name = s.getName(); 
		this.height = s.getHeight();
		this.weight = s.getWeight();;
	}
	
	void setId(String i) {
		this.id = i;
	}
	
	String getId() {
		return this.id;
	}
	
	void setName(String nm) {
		this.name = nm;
	}
	
	String getName() {
		return this.name;
	}
	
	void setHeight(int h) {
		if(h >= 0 &&h <= 300 )	this.height = h;
		else System.out.println("height set error");
	} 
	
	int getHeight() {
		return this.height;
	}
	
	void setWeight(int w) {
		if(w >= 0 && w <= 500 )	this.weight = w;
		System.out.println("weight set error");
		
	}
	
	int getWeight() {
		return this.weight;
	}
	
	public String toString() {
		return "id=" + this.id + ",name=" + this.name + ",height=" + this.height + ",weight=" + this.weight;
	}
}
