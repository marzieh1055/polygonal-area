import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ShoelaceTest {
    private Shoelace s;

    @BeforeEach
    public void init() {
        System.out.println("==================init==================");
        s = new Shoelace();
    }

    @Test
    public void calculateRectArea() {
        System.out.println("==================calculateRectArea==================");
        int[][] rect = new int[4][2];
        rect[0] = new int[]{1, 2};
        rect[1] = new int[]{2, 2};
        rect[2] = new int[]{2, 1};
        rect[3] = new int[]{1, 1};
        Assertions.assertEquals(s.area(rect), 1.0, 0.00001);
    }

    @Test
    public void calculateRect2Area() {
        System.out.println("==================calculateRect2Area==================");
        int[][] rect2 = new int[4][2];
        rect2[0] = new int[]{1, 3};
        rect2[1] = new int[]{2, 3};
        rect2[2] = new int[]{2, 1};
        rect2[3] = new int[]{1, 1};
        Assertions.assertEquals(s.area(rect2), 2.0, 0.00001);
    }

    @Test
    public void calculateMosalasArea() {
        System.out.println("==================calculateMosalasArea==================");
        int[][] mosalas = new int[3][2];
        mosalas[0] = new int[]{1, 2};
        mosalas[1] = new int[]{2, 1};
        mosalas[2] = new int[]{1, 1};
        Assertions.assertEquals(s.area(mosalas), 0.5, 0.00001);
    }
}