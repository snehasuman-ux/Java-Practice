public class Main{
  public static void main(String [] args){

  Student S1= new Student(101, "Sneha", 20);
  Student S2= new Student(102, "Neha", 20); 

  StudentManager manager= new StudentManager();

  manager.addStudent(S1);
    manager.addStudent(S2);

  manager.displayStudent();
  }
}
