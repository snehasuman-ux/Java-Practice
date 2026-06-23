import java.util.ArrayList;
public class StudentManager{
  
  ArrayList<Student> students= new ArrayList<>();
  
  void addStudent(Student student){
    students.add(student);
  }
  void displayStudent(){
    for (Student student : students){
      student.display():
        
System.out.println("-----------");
    }
  }
}
