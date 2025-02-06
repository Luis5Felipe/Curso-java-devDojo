package academy.DevDojo.javaoneforall.introduction;

public class Class06EstuturaRepeticao01 {
    //while, do while, for
    public static void main(String[] args) {
        int count = 0;
        while (count < 10){
            System.out.println(++count);
        }
        count = 0;
        do {
            System.out.println(++count);
        }while (count < 10);
    }
}
