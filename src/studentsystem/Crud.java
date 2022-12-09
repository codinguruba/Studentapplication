
package studentsystem;

public interface Crud {
    public void createStudent(Student std);
    public void showAllStudent();
    public void updateStudent(int id,String name);    
    public void  deleteStudent(int id);
    
    
}
