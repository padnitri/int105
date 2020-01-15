
package club;

public class Club {
    private String Name;
    private String SideName;
    private Student Student[];
    private int MaxMember;
    private int count;
    
    public Club(String Name,String SideName,int MaxMember){
        this.Name = Name;
        this.SideName = SideName;
        this.MaxMember = MaxMember;
        
    }
    public boolean Check(){
        if(this.MaxMember == count){
            return false;
        }
        return true;
    }
    public void Register(Student Student){
        if(Check() == true){
            this.Student[count++] = Student;
            System.out.println("Now You are Member");
        }
        System.out.println("Club Is Full");
       
    }
   
    
}
