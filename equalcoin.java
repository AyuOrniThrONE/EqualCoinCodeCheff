import java.util.Scanner;

public class equalcoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (1 <= t && t <= 1000) {
            for (int i = 0; i < t; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (0 <= x && x <= Math.pow(10, 8) && 0 <= y && y <= Math.pow(10, 8)) {
                    if (x%2==0) {
                        if (x==0 && y%2==0) {
                            System.out.println("YES");
                        }else if (x==0 && y%2!=0) {
                            System.out.println("NO");
                        }else{
                            System.out.println("YES");
                        }
                    }
                    else{
                        System.out.println("NO");
                    }
                    
                }
            }
        }
    }
}