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
  void searchStudent(int id){
    for (Student student : students){
      if (student.id == id){
        student.display();
        return;
      }
    }
    System.out.println("Student not found");
  }
  void deleteStudent( int id){
     for (Student student : students){
      if (student.id == id){
        students.remove(student);
        System.out.println("Student deleted successfully");
        return;
      }
     }
    System.out.println("Student not found");
}
}
