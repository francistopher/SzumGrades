import java.io.IOException;
import java.util.Scanner;

public class SzumGrades
{
    public static void navigateToWebcourses(Scanner in) throws IOException
    {
        do 
        {
        } while (Scanner
        System.out.println("Have Google Chrome installed!");
        Runtime.getRuntime().exec(new String[]{"/usr/bin/open", "-a", "/Applications/Google Chrome.app", "https://idp-prod.cc.ucf.edu/idp/profile/SAML2/Redirect/SSO?execution=e2s1"});
        Runtime.getRuntime().exec(new String[]{"/usr/bin/open", "-a", "/Applications/Google Chrome.app", "https://webcourses.ucf.edu/"});
        System.out.println("Sign into your Webcourses!");
    }

    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        navigateToWebcourses();
    }
}
