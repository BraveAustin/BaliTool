package cn.bali.tool.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author BraveAustin
 * @Description //TODO
 * @Date 2021/4/12 0012
 **/
public class LocalDateTimeUtil {

    /**
     * 返回相应格式的String
     * @param localDateTime
     * @param pattern
     * @return
     */
    public static String getFormatString(LocalDateTime localDateTime,String pattern){
        if (localDateTime == null || pattern == null) {
            return null;
        }
        return localDateTime.format(DateTimeFormatter.ofPattern(pattern));
    }

}
