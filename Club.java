
package club;

public class Club {
    private String Name;
    private String SideName;
    private Student Student[];
    private int MaxMember;
    private int count;
    
    /*public Club(String Name,String SideName,int MaxMember){
        this.Name = Name;
        this.SideName = SideName;
        this.MaxMember = MaxMember;
        
    }
*/
    private void setClub(String Name,String SideName,int MaxMember){
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
    public void listMember(){
        for (int i = 0; i < count; i++) {
            System.out.println(student[i]);
        }
      
    } 
    
    public boolean editInfo(){
        Scanner edit = new Scanner(System.in);
       System.out.println("enter your studentId : ");
        long id = edit.nextLong();
        
        for (int i = 0; i < count; i++) {
            if(student[i].getStudentId()==id){
                System.out.println(student[i].getName());
                  System.out.println("edit your information : ");
                    String name = edit.nextLine();
                System.out.println("now your name is" +name );
                student[i].getName()=name;
                
       }
            return true;
    
   
    
}
