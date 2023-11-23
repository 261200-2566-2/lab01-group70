// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.print("ใส่จำนวนตัวเลขที่ต้องการเรียง");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0 ; i < n; i++){
            System.out.print("ตัวเลขตัวที่ " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
        SortArray(array);
        System.out.println("เรียงลำดับจากน้อยไปมาก : ");
        for(int arr : array ){
            System.out.println(arr);
        }



        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.


    }
    public static void SortArray(int[]arr){
        Arrays.sort(arr);
    }
}
