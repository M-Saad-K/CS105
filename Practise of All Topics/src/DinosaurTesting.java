import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class DinosaurTesting {

    @Test
    void TestingIfRaptor(){

        FunctionalProcessing dinohos = new FunctionalProcessing();
        dinohos.addDinosaur("Raptor", "T-rex", "Stegasaurus");

        Assertions.assertEquals(1, dinohos.getDino("  spino   "));




    }


}
