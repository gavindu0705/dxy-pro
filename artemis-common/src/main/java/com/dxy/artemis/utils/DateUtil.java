package com.dxy.artemis.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 */
public class DateUtil {

    enum FormatEnum {
        YYYY_MM_DD("yyyy-MM-dd"),
        YYYY_MM_DD_HH_MM_SS("yyyy-MM-dd HH:mm:ss"),
        YYYYMMDD("yyyyMMdd"),
        YYYYMMDDHHMMSS("yyyyMMddHHmmss"),;

        FormatEnum(String format) {
            this.format = format;
        }

        private final String format;

        public String getFormat() {
            return format;
        }

    }

    /**
     * DAY_FORMAT yyyy-MM-dd 时间格式
     */
    public static final String FORMAT_YYYY_MM_DD = "yyyy-MM-dd";

    /**
     * DATE_HM_FORMAT yyyy-MM-dd HH:mm:ss 时间格式
     */
    public static final String FORMAT_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";


    public static String format(Date date) {
        return new SimpleDateFormat(FormatEnum.YYYY_MM_DD_HH_MM_SS.getFormat()).format(date);
    }
}
