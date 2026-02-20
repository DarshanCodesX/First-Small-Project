import java.util.Scanner;
class Traffic {
    public void signal(int time) {
        while (true) {
            try {
                System.out.println("RED Light — STOP");
                for (int i = time; i >= 0; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);//This will make program pause for 1sec
                }
                System.out.println("YELLOW Light — READY");
                for (int i = 3; i >= 0; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);
                }
                System.out.println("GREEN Light — GO");
                for (int i = time; i >= 0; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);
                }
          } catch (InterruptedException e) {
                System.out.println("Timer interrupted");
            }
        }
    }
}
public class Project{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter timer value: ");
        int num = sc.nextInt();
        Traffic tra = new Traffic();
        tra.signal(num);
        sc.close();
    }

}
