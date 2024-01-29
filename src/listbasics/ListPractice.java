package listbasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPractice {
    public static void main(String[] args){

        List<String>names= new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a name: ");
        names.add(scan.nextLine());
        System.out.println("Enter a name: ");
        names.add(scan.nextLine());
        System.out.println("Enter a name: ");
        names.add(scan.nextLine());
       

        for (String string:names) {
            System.out.println("This name is in the list:" + string);
            
            // names.remove(string);
            // add,set remove ,get
            // mutable and immutable( change and cant change respectively)
        }


    }
}
