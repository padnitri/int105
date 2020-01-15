
package club;

public class Student {
    private long StudentId;
    private String Name;
    
    public Student(long StudentId, String Name){
        this.StudentId = StudentId;
        this.Name = Name;
    }
    
    public long getStudentId(){
        return StudentId;
    }
}

