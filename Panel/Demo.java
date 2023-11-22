package Panel;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {
        ArrayList<String> emails =new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1 to signup 2 to Exit :");
        String Exit =sc.nextLine();
        if (Exit.equals("2")) {
            sc.close();
            System.exit(0);
        }
        System.out.println();
        while (true) {
            System.out.println("Enter the mail-ID :");
            String check =sc.nextLine();
            if (check.equalsIgnoreCase("Exit")) {
                break;
            }
            else{
            emails.add(check);
            }
            for (String mail : emails) {
            if (isValid(mail)) {
                System.out.println(mail+"mail-id verified");
                break;
            }
            else{
                System.out.println(mail + "invalid mail-id (eg: dharrun@gmail.com)");
                System.out.println();
                System.out.println("Please Re-Enter mail-ID.");
            }
        }
        
        }
      sc.close();
    
        
    
}

    private static boolean isValid(String email) {
        return email.contains("@");
    }


}

    

