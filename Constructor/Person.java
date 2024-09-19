package Constructor;

public class Person {
	
	private String name;
	private int age;
	
	//1st constructor
	public Person() {
		this("unknown", 0);
	}
	
	//s2t constructor
		public Person(String name) {
			this("name", 0);
		}
	
     // Third constructor
        public Person(String name, int age) {
        this.name = name;
        this.age = age;
       }
        
        @Override
        public String toString() {
            return "Person (Name=" + name + ", Age=" + age + ")";
        }

	

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person("Aarti");
		Person p3 = new Person("pooja" , 30);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
