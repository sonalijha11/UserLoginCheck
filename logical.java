import java.util.*;
public class logical{
    public static void main(String[]args)
    {
        String UI = "sonalijha_11";
        String Pass = "Sonali@11";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter user ID:");
        String user = sc.nextLine();
        System.out.print("Enter Password:");
        String password = sc.nextLine();
        if(UI.equals(user) && Pass.equals(password))
        {
            System.out.println("Welcome!");
        }else
        {
            System.out.println("Try again");
        }
    }
}
