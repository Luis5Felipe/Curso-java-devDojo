package academy.DevDojo.javaoneforall.introduction;

public class Class05ConditionalStatements02 {
   public static void main(String[] args) {
      // age < 15 category junior
      // age => 15 && < category senior
      // age 18 category master
      int age = 14;
      String category;
      if(age < 15){
         category = "Category Junior";
      }else if(age >= 15  && age < 18 ){
         category = "Category Senor";
      }else
         category = "Category Master";
   }
}
