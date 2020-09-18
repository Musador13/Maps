package musa.com;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, Long> map = new HashMap<>(n);

        for(int i=0; i<n; i++) {
            String name = in.nextLine().trim();
            long phone = in.nextLong();
            in.nextLine();
            map.put(name, phone);
        }

        while(in.hasNext()) {
            String s  = in.nextLine().trim();
            try {
                long man = map.get(s);
                System.out.println(s + "=" + man);
            }catch (NullPointerException e) {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
