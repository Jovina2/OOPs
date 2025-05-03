import java.util.Scanner;
class AuthenticationException extends Exception 
{
public AuthenticationException(String message) 
{
super(message);
    }
}
public class UserAuthentication 
{
public static void authenticate(String username, String password) throws AuthenticationException 
{
String validUsername = "admin";
String validPassword = "password123";
if (!username.equals(validUsername) || !password.equals(validPassword)) 
{
throw new AuthenticationException("Authentication failed: Invalid username or password.");
}
System.out.println("Authentication successful!");
}
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);  
System.out.print("Enter username: ");
String username = scanner.nextLine();      
System.out.print("Enter password: ");
String password = scanner.nextLine();      
try 
{
authenticate(username, password);
} 
catch (AuthenticationException e) 
{
System.out.println(e.getMessage());
}
scanner.close(); // Close scanner
}
}

