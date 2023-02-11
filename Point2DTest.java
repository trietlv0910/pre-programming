import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Point2DTest {


    Point2D point2D;
    @BeforeEach
    void setUp() {
        point2D = new Point2D(1.0f, 2.0f);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getXY() {
        float[] expected = new float[]{1.0f,2.0f};

        float[] result = point2D.getXY();
        assertEquals(Arrays.toString(expected),Arrays.toString(point2D.getXY()));
    }
}