package MyDate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MyDateCreator {



    private static SimpleDateFormat simpleDate () {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        return sdf;
    }

    public static String dateCreator() {
        return simpleDate().format(new Date());
    }


}
