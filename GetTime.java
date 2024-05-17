import java.time.LocalTime;

public class GetLocalTimeExample {

    public static void main(String[] args) {
      
        LocalTime localTime = LocalTime.now();
        System.out.println("The local time is: " + localTime);
    }
}