package GeneralPrograms;

import java.util.concurrent.ConcurrentHashMap;

public class ConcHMapEx {

    public static void main(String[] args) {

        ConcurrentHashMap concurrentHashMap=new ConcurrentHashMap();

        concurrentHashMap.put(1,"deep");
        concurrentHashMap.put(2,"adeep");
        concurrentHashMap.put(3,"sdeep");
        concurrentHashMap.put(4,"wdeep");

        concurrentHashMap.forEach((x,y)-> System.out.println("Key is "+x+"val "+y));



    }


}
