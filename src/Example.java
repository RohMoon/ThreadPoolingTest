import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Example {

    public static int count;


    public static void main(String[] args) {



        /*
        Timer m_timer = new Timer();
        TimerTask m_task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Morph");
            }
        };
        m_timer.schedule(m_task,3000,2000);
        */

        count = 0;
        Scanner sc = new Scanner(System.in);



        Timer m_timer = new Timer();
        TimerTask m_task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Morph");
                count++;
                if (sc.hasNext("exit")){

                    m_timer.cancel();
            }else{
                    return;
                }





            }
        };
        m_timer.schedule(m_task,3000,2000);
        sc.nextLine();


    }

}
