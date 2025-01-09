package org.example;

import java.util.*;
import java.util.stream.IntStream;


public class Test {
    public static void main(String[] args)
    {
        int g = 45;
        long d = 5;
        int c = (int)Math.max(g, d);
        System.out.println(Math.max(100, 200) + " " + Math.min(2, -4));
    }
}


//class Mammal {
//    public String name = "furry ";
//}
//
//public class Test extends Mammal
//{
//    public String name = "feathered ";
//    public String title = """
//            The title is
//                  Big""";
//
//    public static void main(String[] args)
//    {
//        /* * Testing instance variable "name"
//         * using hiding technique
//         * @author   Vinay
//         */
//        Test m = new Test();
//        System.out.println(m.hashCode());
//        System.out.println(m.name);
//        System.out.println(m.title);
//    }


//    public static void main(String[] args)
//    {


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
//        int i = 0;
//        outer: while (true) {
//            i++;
//            inner: for (int j = 0; j < 10; j++) {
//                if (i > 1) break outer;
//                if (j > 5) continue outer;
//                System.out.print(j);
//            }
//        }
//        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);
//        int sum1 = IntStream.rangeClosed(1, 100).sum();
//        List<Integer> uniquelist = integerList.stream().distinct().toList();
//        System.out.println("RPG Game: " + sum1 + " " + uniquelist);
    //}
//}

