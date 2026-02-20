import java.util.Scanner;
class Traffic {
    public void signal(int time,int cycles) {
      for(int i=1;i<=cycles;i++) {
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
        int timer = sc.nextInt();
        System.out.print("Enter the number of Cycles:");
        int cycles=sc.nextInt();
        if(timer>0&& cycles>0){
        Traffic tra = new Traffic();
        tra.signal(timer,cycles);
        }
        else{
            System.out.print("Invalid input");
        }
        sc.close();
    }

}


