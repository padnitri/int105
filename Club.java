package club;

import java.util.Scanner;

public class Club {

     private String Name;
    private String SideName;
    private Student Student[];
    private int MaxMember;
    private int count;
    
//    public Club(String Name,String SideName,int MaxMember){
//        this.Name = Name;
//        this.SideName = SideName;
//        this.MaxMember = MaxMember;
//        
//    }
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
        System.out.println("Club Is Full");}
    
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
    public void listMember(){
        for (int i = 0; i < count; i++) {
            System.out.println(Student[i]);
        }
        System.out.println("kdsadaczxczxc");
    }
    
    public void chooseMenu(int key){
            switch (key){
            case 1 :
            case 2 : 
                System.out.println("Please insert your name : ");
                
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Member List");
                listMember();
        }
}
    public static void main(String[] args) {
        Club obj = new Club();
        obj.menuChoices();
    }
    }
