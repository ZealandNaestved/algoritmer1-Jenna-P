import com.sun.tools.javac.util.ArrayUtils;

import java.text.DateFormat;
import java.util.Random;
import java.util.Arrays;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms1 {
    Random rd = new Random();  //랜덤 클라스 (랜덤으로 넘버 뽑을때)

    // TODO 1 - Gennemse Data klassen, og skriv gode kommentarer til det

    // TODO 2 - Skriv en randomBoyName() metode i Algorithms1, som returnerer et tilfældigt drengenavn fra Data klassens randomDrengeNavne property OBS: randomDrengeNavne skal forblive private!
    public String randomBoyName(){

        String[] names;
        names = new Data().getRandomDrengeNavne();
        int randomInt = rd.nextInt(names.length);
        String boyRdName = names[randomInt];
        System.out.println(boyRdName);

        return boyRdName;

    }
    // TODO 3 - Skriv en test til randomBoyName() metoden HINT: Se metoden exampleOfPredictableRandomNumber() for at se, hvordan du kan lave et tilfældigt nummer som er altid det samme (til test)
    // Se Test class
    // TODO 4 - Skriv en randomGirlName() metode i Algorithms1, som returnerer et tilfældigt pigenavn fra Data klassen
    public String randomGirlName() {
        Data data = new Data();
        String[] names = data.getRandomPigeNavne();
        int rdInt = rd.nextInt(names.length);
        String girlRdName = names[rdInt];
        System.out.println(girlRdName);

        return girlRdName;

    }
    // TODO 5 - Skriv en randomName() metode i Algorithms1, som laver et sammenlagt array som indeholder både piger og drenge, og returnerer det
   public String[] randomName() {
        Data data = new Data();
        String[] name1 = data.getRandomDrengeNavne();
        String[] name2 = data.getRandomPigeNavne();

        int length = name1.length + name2.length;

        String[] allNames = new String[length];
        int pos = 0;
        for (String n1 : name1) {
            allNames[pos] = n1;
            pos++;
        }
        for (String n2 : name2) {
            allNames[pos] = n2;
            pos++;
        }

        System.out.println(Arrays.toString(allNames));

        return allNames;

    }

    // TODO 6 - Skriv en test til randomName() metoden
    // Se Test class
    // TODO 7 - Skriv en random bogstavs-generator metode (du kan tage udgangspunkt i randomNumbers() i Data)
   /* public char charGenerator() {

        Data data = new Data();

        int[] bogstav = data.getRandomNumbers1000();
        int rdInt = rd.nextInt(data.getRandomNumbers1000().length);
        char character  = (char) bogstav[rdInt];
        System.out.println(character);

        return character;
    } */
    public void charGenerator() {
        final int MAX = 121;
        int rdNum = 1;
        while ((rdNum < 65) || (90 < rdNum  &&  rdNum <97) ) {
            rdNum = rd.nextInt(MAX) + 1;

        }
        System.out.println((char)rdNum);

    }
    // TODO 8 - Skriv en  plet eller krone generator metode (plet er boolean true og krone er boolean false)

    public static void coinGenerator() {
        boolean plet = true;
        boolean krone = false;

       int rdNum = new Algorithms1().rd.nextInt(2);
       if (rdNum == 0) {
           plet = true;
          // krone = false;
           System.out.println("plet");

       } else {
           krone = true;
          // plet = false;
           System.out.println("krone");

       }

    }


    public static void main(String[] args) {
       //exampleOfPredictableRandomNumber();
      // new Algorithms1().charGenerator();
       // new Algorithms1().randomName();
        coinGenerator();

    }

    private static void exampleOfPredictableRandomNumber() {
        Random random = new Random();
        random.setSeed(15L); // Hvis vi angiver et seed som et long number, vil random klassen altid generere det samme tal, i det her tilfælde 21
        System.out.print("Hvis vi bruger seed, vil random altid returnere de samme værdier, f.eks. giver denne 21 --> ");
        System.out.println(random.nextInt(45));
    }

}
