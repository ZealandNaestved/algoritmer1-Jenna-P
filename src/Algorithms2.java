import java.text.DateFormat;
import java.util.Arrays;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms2 {

    // TODO 1 Skriv en metode her i denne klasse, som kan finde et tal i Data klassens randomNumbers1000 felt med LINEAR SEARCH
    public static void searchOneNum() {
        Data data = new Data();
        int[] rdNum = data.getRandomNumbers1000();
        int oneNumber = 777;
        boolean found = false;

        for (int i = 0; i < rdNum.length ; i++) {
            if (rdNum[i] == oneNumber)
                System.out.println("Element(numbers) has found at position " + i);
            found = true;

        }
        if (!found)
            System.out.println("element has not been found");
    }

    // TODO 2 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med LINEAR SEARCH
    public static void searchOneName() {
        Data data = new Data();
        String[] rdName = data.getRandomDrengeNavne();
        String oneName = "Rocky";
        boolean found = false;

        for (int i = 0; i < rdName.length; i++) {
            if (rdName[i].equals(oneName)) {
                System.out.println("Element(names) has found at position " + i);
                found = true;

            }
        }
        if (!found)
            System.out.println("element has not been found");
    }

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomNumbers1000
    public static int[] sortArrayNumber() {
        Data data = new Data();
        int[] rdNumber = data.getRandomNumbers1000();
        Arrays.sort(rdNumber);
        for (int n : rdNumber)
            System.out.print(n + " , ");
        return rdNumber;
    }

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomDrengeNavne
    public static String[] sortArrayNames() {
        Data data = new Data();
        String[] rdBoyNames = data.getRandomDrengeNavne();
        Arrays.sort(rdBoyNames);
        for (String name : rdBoyNames)
            System.out.print(name + " , ");
        return rdBoyNames;
    }

    // TODO 5 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomNumbers1000 felt med BINARY SEARCH
    public static void findNumber() {
        Data data = new Data();
        int[] rdNumber = data.getRandomNumbers1000();
        Arrays.sort(rdNumber);
        int oneNum = 777;

        System.out.println(oneNum + " has found at position " + Arrays.binarySearch(rdNumber, oneNum));

    }

    // TODO 6 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med BINARY SEARCH

    public static void main(String[] args) {
        //searchOneNum();
       searchOneName();
       // sortArrayNumber();
       // sortArrayNames();
        //findNumber();
    }
}
