package academy.DevDojo.javaoneforall.introduction;

public class Class08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arrayInt = new int [3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];
        int [][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};
        for (int[] arrayBase : arrayInt2){
            System.out.print("\n-------------------------\n");
            for(int num: arrayBase){

                System.out.print(num);
            }
        }
    }
}
