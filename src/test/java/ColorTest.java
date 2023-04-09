
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ColorTest {

    @Test
    public void mustReturnRedSquare() {
        Shape square = new Square(new Red());

        assertEquals(square.applyColor(), "Square filled with red");
    }
    @Test
    public void mustReturnBlueTriangle() {
        Shape triangle = new Triangle(new Blue());

        assertEquals(triangle.applyColor(), "Triangle filled with blue");
    }
}
