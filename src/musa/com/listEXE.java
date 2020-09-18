package musa.com;

/**
 * @author Musa Dzhabirov
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class listEXE {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> arrayList = new LinkedList<>();

        for(int i=0; i<n; i++) {
            int num = in.nextInt();
            arrayList.add(num);
        }

        int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            String s  = in.next();
            if (s.equals("Insert")) {
                int x = in.nextInt();
                int y = in.nextInt();
                arrayList.add(x, y);
            }

            if (s.equals("Delete")) {
                int x = in.nextInt();
                arrayList.remove(x);
            }
        }
        in.close();

        for(Integer x : arrayList)
            System.out.print(x + " ");

    }
}
