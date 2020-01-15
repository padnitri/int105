/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

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

    public String getName() {
        return Name;
    }

    public void setStudentId(long StudentId) {
        this.StudentId = StudentId;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
   
}
    

