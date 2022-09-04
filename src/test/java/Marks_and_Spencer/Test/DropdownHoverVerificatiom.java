package Marks_and_Spencer.Test;

public class DropdownHoverVerificatiom extends BaseClass {
    public static void main(String[] args) {
        urlVerification();
//        pageFactory.getDropdownHover().dropdownHover("Women");
//        pageFactory.getDropdownHover().dropdownHover("Lingerie");
//        pageFactory.getDropdownHover().dropdownHover("Men");
//        pageFactory.getDropdownHover().dropdownHover("Kids");
//        pageFactory.getDropdownHover().dropdownHover("School");
//        pageFactory.getDropdownHover().dropdownHover("Home");
//        pageFactory.getDropdownHover().dropdownHover("Furniture");
//        pageFactory.getDropdownHover().dropdownHover("Beauty");
//        pageFactory.getDropdownHover().dropdownHover("Brands");
//        pageFactory.getDropdownHover().dropdownHover("Flowers");
//        pageFactory.getDropdownHover().dropdownHover("Gifts");
//        pageFactory.getDropdownHover().dropdownHover("Food");
//        pageFactory.getDropdownHover().dropdownHover("Wine");
//        verification("(//h1","M&S");
        pageFactory.getDropdownHover().dropdownHover();
        verification("//h1","Women’s New In");
        close();
    }
}
