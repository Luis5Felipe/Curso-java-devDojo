package academy.DevDojo.javaoneforall.introduction;

public class Class05ConditionalStatements03 {
    public static void main(String[] args) {
        // if salary > 2000 "Dont't buy ps5"
        double salary = 3500;
        String shouldBuyMessage = "buy PS5";
        String shouldNotbuyMessage = "don´t buy PS5";
        String displayMessage;
        if(salary > 200){
            displayMessage = shouldBuyMessage;
        }else{
            displayMessage = shouldNotbuyMessage;
        }
        System.out.println(displayMessage);
        displayMessage = salary < 200 ? shouldBuyMessage : shouldNotbuyMessage;
        System.out.println(displayMessage);
    }

}
