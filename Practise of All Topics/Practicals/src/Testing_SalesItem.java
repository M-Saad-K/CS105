import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing_SalesItem {

    @Test
    void boundaryTest(){

        SalesItem z = new SalesItem("Zimia",899);
                z.addComment("LOL", "Lol", 5);
                z.addComment("ni", "no", (5+1));
                z.addComment("lil", "nil", (5-1));
    }

    @Test
    void addCommentTest(){

        SalesItem y = new SalesItem("Saad", 900);
        y.addComment("A.Complainer", "F*ck you", 1);
        Assertions.assertEquals(1, y.getNumberOfComments());

    }
}
