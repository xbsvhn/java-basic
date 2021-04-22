import java.util.Scanner;

public class chiahet3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] danhsach = new int[5];

        int i;
        for(i = 0; i < danhsach.length; ++i) {
            System.out.println("Nhap vao phan tu thu " + (i + 1));
            danhsach[i] = sc.nextInt();
        }

        System.out.print("Cac so chia het cho 3: ");

        for(i = 0; i < danhsach.length; ++i) {
            if (danhsach[i] % 3 == 0) {
                System.out.println(danhsach[i]);
            }
         }
        }

    }
