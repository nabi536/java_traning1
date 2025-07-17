package Collections;

import java.util.ArrayList;
import java.util.List;

public class UserDetails1 {
    public static void main(String[] args) {

        UserDetails u1 = new UserDetails("nabi",25,"guntur");
        UserDetails u2 = new UserDetails("mani",24,"chirala");

        List<UserDetails> l1 = new ArrayList<>();
        l1.add(u1);
        l1.add(u2);

        for(UserDetails obj: l1){
            System.out.println(obj.getName());
            System.out.println(obj.getAge());
            System.out.println(obj.getLocation());
        }
    }
}
