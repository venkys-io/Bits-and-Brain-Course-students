//constructor : same name as class
//no return type.
//called when object is created
//can be over loaded but not over riding
//overriding is same as inheritance
//3 types : default,with one paramerter ,with one or more parameters..

    public class Person {
        private String name;
        private int age;
    
        // Default constructor
        public Person() {
            this.name = "Unknown";
            this.age = 0;
        }
    
     //   Constructor with name parameter
        public Person(String name) {
            this.name = name;
           this.age = 20;
       }
    
        // Constructor with name and age parameters
       public Person(String name, int age) {
          this.name = name;
           this.age = age;
       }
    
        public static void main(String[] args) {
            Person person1 = new Person();
           Person person2 = new Person("sri");
           Person person3 = new Person("vsk",  19);
    
            System.out.println("person1:");
            System.out.println("Name: " + person1.name);
            System.out.println("Age: " + person1.age);
    
           System.out.println("\nperson2:");
          System.out.println("Name: " + person2.name);
          System.out.println("Age: " + person2.age);
    
      System.out.println("\nperson3:");
           System.out.println("Name: " + person3.name);
           System.out.println("Age: " + person3.age);
        }
    }
    
    //person 1 : name :unknown   age :0
    //person 2:  name : sri      age : 20
    // person 3: name :vsk      age 19

