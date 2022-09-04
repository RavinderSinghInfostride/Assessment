package Marks_and_Spencer.Test;

public class SignInLinkClick extends BaseClass {
    public static void main(String[] args) {
        urlVerification();
        pageFactory.getHomePage().signInLinkClick();
        verification("//div//h1","Sign In");
        close();
    }
}
