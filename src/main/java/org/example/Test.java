package org.example;

import java.util.HashMap;
import java.util.Map;

public class Test
{
    public static void main(String[] args)
    {
//        try
//        {
//            throw new IllegalArgumentException();
//        } catch(Exception e) {
//            throw new RuntimeException();
//        }finally
//        {
//            return;
//        }

//        Map<String, Integer> map = new HashMap<>();
//        map.put("A", 1);
//        System.out.println("10" + 5 + 5);
//
//        System.out.println(5 + 5 + "10");
//
//        System.out.println(map.put("A", 3));
//        try{
//            throw new Exception("Error");
//        } catch(RuntimeException e ){
//        System.out.println("Runt");
//    } catch(Exception e){
//        System.out.println("Excep");
//    }finally
//        {
//            System.out.println("fina");
//        }
        int i = 0;
        outer: while (true) {
            i++;
            inner: for (int j = 0; j < 10; j++) {
                if (i > 1) break outer;
                if (j > 5) continue outer;
                System.out.print(j);
            }
        }
    }
}
