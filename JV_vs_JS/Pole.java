package JV_vs_JS;

import java.util.ArrayList;
import java.util.Scanner;

public class Pole {
    public static void main(String[] args) {

        ArrayList<Object> dataList = new ArrayList<>();

        dataList.add("Tomas");
        dataList.add(25);
        dataList.add(true);
        dataList.add(3.14);

        System.out.println("Data v kolekci: ");
        for (Object data : dataList) {
            System.out.println(data);
        }
    }
}
