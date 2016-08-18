import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;

public class RotateMatrixTest {

    @Test
    public void testSquare() {
        int[][] square = new int[][]{
              {0, 1, 0, 0},
              {0, 1, 1, 0},
              {0, 0, 1, 0},
              {0, 0, 0, 0}
            };

        int[][] square_rotated = new int[][]{
              {0, 0, 0, 0},
              {0, 1, 1, 0},
              {1, 1, 0, 0},
              {0, 0, 0, 0}
            };

        RotateMatrix rm = new RotateMatrix();

        assertTrue(Arrays.deepEquals(rm.rotate(square), square_rotated));

    }
    
    @Test
    public void testRectangle() {
        int[][] rectangle = new int[][] {
              {0, 1, 0},
              {1, 1, 1}
            };

        int[][] rectangle_rotated = {
              {0, 1},
              {1, 1},
              {0, 1}
            };

        RotateMatrix rm = new RotateMatrix();

        assertTrue(Arrays.deepEquals(rm.rotate(rectangle), rectangle_rotated));
    }
}
