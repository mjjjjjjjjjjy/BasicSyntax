package basic.enumtest;

import javax.websocket.Session;

/**
* @author MoJianyue
* @version 创建时间：2018年9月28日 下午8:05:11
*/
public class Enumtest {
    public static void main(String[] args) {
       /* for (Season s : Season.values()) {
            System.out.println(s);
            System.out.println(s.ordinal());
            System.out.println(s.name());
        }*/
        /*Season.SPIRNG.name="ss";
        System.out.println(Season.SPIRNG.name);*/
        
        String name = Season.SPIRNG.getName();
        System.out.println(name);
        Season.set();
        String name1 = Season.SPIRNG.getName();
        System.out.println(name1);
    }
}
