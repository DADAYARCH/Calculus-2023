package Utils;

import Model.Point;

import java.util.List;

public class Print {
    public static void printMessage(String s) {
        System.out.print(s);
    }

    public static void printlnMessage(String s) {
        System.out.println(s);
    }

    public static void printError(String s) {
        System.err.print(s);
    }

    public static void printlnError(String s) {
        System.err.println(s);
    }

    public static void printList(List<String> lstr) {
        for(Integer i = 0; i < lstr.size(); ++i) {
            printlnMessage(i + 1 + " : " + lstr.get(i).toString());
        }
    }

    public static void printTable(Double[][] x, int n) {
        for(int i = 0 ;i <n; ++i) {
            for(int j = 0 ;j < n; ++j) {
                System.out.format("%-15s", String.valueOf(x[i][j]));
            }
            printlnMessage("");
        }
    }
}
