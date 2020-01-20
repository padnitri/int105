
package club;
import java.util.Scanner;
public class Club2 {
    private String Name;
    private String ShortName;
    private int MaxMember;
    private int count = 0;
    private Student Student[];
    private boolean Status;

/*    public Club2(String Name, String ShortName, int MaxMember) {
        this.Name = Name;
        this.ShortName = ShortName;
        this.MaxMember = MaxMember;
    }*/
    public void allSetting(String Name,String ShortName,int MaxMember){
                this.Name = Name;
        this.ShortName = ShortName;
        this.MaxMember = MaxMember;
        Student = new Student[MaxMember];
    }

    public Student[] getStudent() {
        return Student;
    }

    public String getName() {
        return Name;
    }

    public String getShortName() {
        return ShortName;
    }

    public int getMaxMember() {
        return MaxMember;
    }
    public void addStudent(long StudentId,String name){
        if(checkStatus() == true){
            if(StudentId == 0 || name == null){
            System.out.println("Can't Run Programe");
            
        }
        Student[count++] = new Student(StudentId,name);
            System.out.println("Register is Finish");
            
        }
        System.out.println("Member of Club is Full");
    }
    public boolean checkStatus(){
        if(count == MaxMember){
            return false;
        }
        return true;
    }
    public String checkStatusOpenClose(){
        if(count == MaxMember){
            return "Close";
        }
        return "Open";
    }
    public void searchStudentId(long StudentId){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            if (StudentId == Student[i].getStudentId()) {
                int choice;
                System.out.println(Student[i]);
                do {
            String menu = "<Menu> \n"
                    + "1.Change Name \n"
                    + "2.Exit \n" ;
            System.out.println(menu);
            System.out.print("Enter Your Menu [1‐2]: ");
            choice = input.nextInt();
            if(choice == 1){
                String name;
                System.out.println("Enter New Name");
                name = input.nextLine();
                Student[i] = new Student(StudentId,name);
                System.out.println("Now your Name is "+name);
                break;
            }
            else{
                
            }
        } while (choice == 2);
                System.out.println("Exited!");
                break;
                
                
            }
        }
        System.out.println("Sorry not found");
        
    }
    public void listMember(){
        System.out.println("--------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.println(Student[i].getName());
        }
        System.out.println("--------------------------------");
    }
    public void outClub(long StudentId){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            int choice;
            if (StudentId == Student[i].getStudentId()) {
                
                System.out.println("Do you want Exit this club?");
                do {
            String menu = "1.Yes \n"
                         + "2.No \n" ;
            System.out.println(menu);
            System.out.print("Enter Your Menu [1‐2]: ");
            choice = input.nextInt();
                    if (choice == 1) {
                        int numberCount;
                        numberCount = count -(i+1);
                        Student newStudent[] = new Student[50];
                        System.arraycopy(Student,i+1, newStudent, 0, numberCount);
                        System.arraycopy(newStudent,0,Student,i,numberCount);
                        System.out.println("Done");
                        count -= 1;
                        break;
                    }
                    } while (choice != 2);
                System.out.println("Exited!");
                break;
                
            }
            
            
            
            
        }
        
    }
    public boolean menuChoices() {
        Scanner input = new Scanner(System.in);
        int key;
        do {
            String menu = "<<Main Menu>> \n"
                    + "1. New Club \n"
                    + "2. Membership Subscribe \n"
                    + "3. Edit Membership Information \n"
                    + "4. Membership Unsubscribe \n"
                    + "5. List Members \n"
                    + "6. Exit";
            System.out.println(menu);
            System.out.print("Enter Your Menu [1‐6]: ");
            key = input.nextInt();
            chooseMenu(key);
        } while (key != 6);
        System.out.println("Exited!");
        
      /*  switch (key){
            case 1 :
            case 2 : 
                System.out.println("Please insert your name : ");
                return Register(Student Student);
            case 3 :
            case 4 :
            case 5 :
        } */
        return true;
    }
    public void chooseMenu(int key){
            switch (key){
                
            case 1 :
                Scanner input = new Scanner(System.in);
                String name;
                String sidename;
                int MaxMember;
                System.out.println("Please insert your name club");
                name = input.nextLine();
                System.out.println("Please insert your sidename club");
                sidename = input.nextLine();
                System.out.println("Please insert your MaxMember");
                MaxMember = input.nextInt();
                allSetting(name,sidename,MaxMember);
                System.out.println("Done");
                
                System.out.println("Name Club : " +this.Name + "| Short Name : "+this.ShortName+" |MaxMember : "+this.MaxMember);
                System.out.println("-----------------------------------------------------------------------");
                break;
            case 2 : 
                System.out.println("Name Club : " +this.Name + "| Short Name : "+this.ShortName+" |MaxMember : "+this.MaxMember+ " "+this.Student.length);
                Scanner input1 = new Scanner(System.in);
                long StudentId;
                String Name; 
                System.out.println("Please insert your name : ");
                Name = input1.nextLine();
                System.out.println("Please insert your StudentId");
                StudentId = input1.nextLong();
                addStudent(StudentId,Name);
                System.out.println(" "+Name+" "+StudentId);
                System.out.println("Now you are member");
                break;

            case 3 :
                Scanner input2 = new Scanner(System.in);
                long StudentIdC3;
                System.out.println("Please searchStudentId");
                StudentIdC3 = input2.nextLong();
                searchStudentId(StudentIdC3);
                break;
                
            case 4 :
                Scanner input3 = new Scanner(System.in);
                long StudentIdC4;
                System.out.println("Please searchStudentId");
                StudentIdC4 = input3.nextLong();
                outClub(StudentIdC4);
                break;
            case 5 :
                System.out.println("Member List");
                listMember();
                break;
        }
}

    @Override
    public String toString() {
        return "Club2{" + "Name=" + Name + ", ShortName=" + ShortName + ", MaxMember=" + MaxMember + ", count=" + count + ", Status=" + Status +" " + this.Student.length;
    }
    
    
}
