import java.util.Scanner;

public class Triangle15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan nilai N = ");
    int N = sc.nextInt();
    int i = 1; // inisialisasi i = 1

    while (i <= N) {
      int j = 1; // inisialisasi j = 1
      while (j <= i) {  // ubah kondisi menjadi j <= i
        System.out.print("*");
        j++;
      }
      i++;
      System.out.println(); // untuk membuat baris baru
    }

  }
}