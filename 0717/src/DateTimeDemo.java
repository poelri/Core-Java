import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateTimeDemo {
    public static void main(String[] args) {
        // 날짜를 가져오는 4가지 방법

        // 첫번째 방법
        // Date now = new Date();
        // System.out.println(now); // now.toString();

        // 두번째 방법
        // Calendar cal = new Calendar();
        // Calendar cal = Calendar.getInstance();
        // System.out.printf("오늘은 %d년 %d월 %일 입니다. %n",
        //         cal.get(Calendar.YEAR), cal.get(Calendar.MONTH),
        //         cal.get(Calendar.DATE)
        //         cal.get(Calendar.DAY_OF_MONTH));

        // 세번째 방법
        // Calendar cal = new GregorianCalendar(2024, 11, 25);
        // System.out.printf("금년은 %d년%n", cal.get(Calendar.YEAR));

        // 네번째 방법
        // DateFormat df =DateFormat.getDateTimeInstance(
        //         DateFormat.FULL, DateFormat.MEDIUM, Locale.FRENCH);
        // System.out.println(df.format(new Date()));

        // 다섯번째 방법
        // String pattern = "오늘은 yyyy년 mm월 dd일 입니다 .";
        // DateFormat df = new SimpleDateFormat(pattern);
        // System.out.println(df.format(new Date()));

        // 여섯번째 방법
        String pattern = String.format("오늘은 %1$tY년 %1$tm월 %1$td일 입니다 .",new Date());
        System.out.println(pattern);
        System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일 입니다 .",new Date());

    }
}
