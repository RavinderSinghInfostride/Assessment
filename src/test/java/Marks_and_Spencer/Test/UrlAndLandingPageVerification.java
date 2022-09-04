package Marks_and_Spencer.Test;

public class UrlAndLandingPageVerification extends BaseClass {
    public static void main(String[] args) {
        urlVerification();
        verification("(//a[@class='navigation-mns-logo navigation-logo'])[1]","M&S");
        close();
    }
}
