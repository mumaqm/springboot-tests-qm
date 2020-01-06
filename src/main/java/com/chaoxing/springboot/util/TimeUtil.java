package com.chaoxing.springboot.util;

import java.time.LocalDate;
import java.time.LocalTime;

public class TimeUtil {
    public static void main(String[] args) {

        LocalDate now= LocalDate.now();
        System.out.println(now);
        LocalTime time = LocalTime.now();
        System.out.println(time);

    }
}
