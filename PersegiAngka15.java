import java.util.Scanner;

public class PersegiAngka15 {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    /*
      - membuat tampilan persegi angka
      - nilai N minimal 3
      - contoh: N = 4
        4 4 4 4 
        4     4  
        4     4 
        4 4 4 4       
    */
    int N;
    System.out.print("Masukkan nilai N (minimal 3) = ");
    N = userInput.nextInt();

    // membuat for luar
    for (int i = 1; i <= N; i++) {
      // membuat for dalam
      for (int j = 1; j <= N; j++) {
        // membuat kondisi for luar = 1 atau for luar = N
        if (i == 1 || i == N) {
          System.out.print(N + " ");
        }
        else {
          if (j == 1 || j == N) {
            System.out.print(N + " ");
          }
          else {
            System.out.print("  ");
          }
        }
      }
      // membuat baris baru
      System.out.println();
    }

  }
}