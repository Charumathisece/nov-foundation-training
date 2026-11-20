import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Username:");
        String username = sc.next();
        System.out.print("Password:");
        String password = sc.next();
        LoginService ls = new LoginService();
        if (ls.validate(username, password)) 
        {
            System.out.println("Welcome " + username);
        } else 
        {
            System.out.println("Invalid Credentials..");
        }
    }
}