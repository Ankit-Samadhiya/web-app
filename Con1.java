public class Con1{
	static String name;
	static int age;
	Con1(String name,int age){
		this.name = name;
		this.age = age;
	}
	public static void main(String [] args){
		Con1 co = new Con1("Rahul Samadhiya",25);
		
		System.out.println("NAME : "+name+" , "+"AGE : "+age);
		
	}
}