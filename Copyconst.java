public class Copyconst{
    public static void main(String[] args) {
        Student s1= new Student(2);
        s1.name= "Siddhi";
        s1.roll=345;
        s1.password="abcd";
        Student s2 = new Student(s1);
        s1.password="xyz";
        System.out.println(s2);
        
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks=new int[3];


    Student(Student s1){
        // marks =  new int[3];
        this.name= s1.name;
        this.roll= s1.roll;
        this.marks= s1.marks; 
        // this.password= s1.password; 
    }


}
