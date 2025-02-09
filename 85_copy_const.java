public class Encapsuation {
    public static void main(String[] args) {
        Student s1= new Student("Siddhi");
        System.out.println(s1.name);
        Student s2= new Student(2);
        System.out.println(s2.roll);
        // System.out.println("");  
        
    }
    
}
class  Student{
    String name;
    int roll;
    // parameterized constructor
    Student(String name ){
        this.name= name;
    }
    Student(int roll){
        this.roll=roll;
    }
    }



