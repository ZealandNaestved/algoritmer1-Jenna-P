import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Algorithms1Test {

    @Test
    void randomBoyName() {
        Algorithms1 al = new Algorithms1();
        al.rd.setSeed(17);
       // al.randomBoyName();
        assertEquals("Cobra", al.randomBoyName());

    }
    @Test
    void randomName() {
        Algorithms1 al = new Algorithms1();
        al.randomName();
    }
   /* @Test
    void charGenerator(){
        Algorithms1 al = new Algorithms1();
        al.rd.setSeed(0);
        //al.charGenerator();
        assertEquals('ȟ', al.charGenerator());
    }*/
}
