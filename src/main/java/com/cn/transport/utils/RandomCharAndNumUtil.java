package com.cn.transport.utils;

import java.util.Calendar;
import java.util.Random;

public class RandomCharAndNumUtil {


        //生成随机数字和字母,
        public String getStringRandom() {
            int length = 16;
            String val = "";
            Random random = new Random();

            //参数length，表示生成几位随机数
            for(int i = 0; i < length; i++) {
                String num = random.nextInt(2) % 2 == 0 ? "char" : "num";
                String ch = "char";
                //输出字母
                if( "char".equalsIgnoreCase(ch) ) {
                    //输出是大写字母还是小写字母
                    int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
                    val += (char)(random.nextInt(26) + temp);
                }
            }
            //加入随机数字
            for(int i = 0; i < 3; i++) {
                String num = "num";
                    val += String.valueOf(random.nextInt(10));
                }
            //接入时间戳
            val += Calendar.getInstance().getTimeInMillis();
            return val;
        }
    }
