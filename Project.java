import java.util.Scanner;
class Traffic {
    public void signal(int time) {
        while (true) {
            try {
                System.out.println("RED Light — STOP");
                  countdown(time);
                System.out.println("YELLOW Light — READY");
                countdown(3);
                System.out.println("GREEN Light — GO");
                countdown(time);
          } catch (InterruptedException e) {
                System.out.println("Timer interrupted");
                return;
            }
        }
    }
    private void countdown(int seconds) throws
    InterruptedException{
        for (int i = seconds; i > 0; i--) {
             System.out.println(i);
             Thread.sleep(1000);//This will make program pause for 1sec
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

