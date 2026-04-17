package practice;

import java.util.HashSet;
public class Drive{
    private String ownerName;
    public static void main(String[] args) {
        HashSet<Cara>hs = new HashSet<>();
        hs.add(new Cara("aaa", 32));
        hs.add(new Cara("bb",40));

        for(Cara item: hs){
            System.out.println(item.getName());
        }
    }


}
