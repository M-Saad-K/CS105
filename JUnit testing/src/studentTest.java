
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class studentTest {
    @Test
    void test() {

        List<Integer> number = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Assertions.assertAll(() -> assertEquals(1, number.get(0)),
                             () -> assertEquals(2, number.get(1))
        );

    }



}
