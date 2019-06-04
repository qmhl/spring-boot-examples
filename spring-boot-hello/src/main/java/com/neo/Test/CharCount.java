package com.neo.Test;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        String str ="2342asfghgyu56asdasda";

        Map<String,Integer> maps = new HashMap<String,Integer>();

        for (int i = 0; i <str.length() ; i++) {
            String key = String.valueOf(str.charAt(i));

            if (!maps.containsKey(key)) {
                maps.put(key,1);
            }else{
                maps.put(key,maps.get(key)+1);
            }
        }

        StringBuffer sb = new StringBuffer();

        for (String a :maps.keySet()) {
            Integer value = maps.get(a);
            sb.append(a).append("(").append(value).append(")").toString();
        }

        System.out.println(sb);
    }
}
