import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse=null;
        try {
           parse = simpleDateFormat.parse("1999-8-17");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------------------------------------------------");
      long time = parse.getTime();
       System.out.println(time);

    Calendar calendar=Calendar.getInstance();
        calendar.clear();
        calendar.set(1999,8,17);
    long timeInMillis = calendar.getTimeInMillis();
        System.out.println(timeInMillis);
        find();
    }

    public static void  find(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next());
        int i= 1;

    }



}
