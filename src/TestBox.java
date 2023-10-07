import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestBox {

    //Test that a new Box object is created successfully.
    @Test
    public void TestCreateNewObj() {
        Box testBox1 = new Box(3.4, 3.5, 4.6);
        Box testBox2 = new Box(3.4, 3.5, 4.6);
        assertNotEquals(testBox1, testBox2);
    }

    //Test if values in object are positive
    @Test
    public void TestValidBoxValues() {
        assertThrows(IllegalArgumentException.class,
                () -> new Box(-1, 0, -3)
        );
    }

    //Test the volume method to ensure it calculates the volume correctly.
    @Test
    public void testCorrectVolume() {
        Box testBox1 = new Box(3.4, 3.5, 4.6);
        assertEquals(testBox1.volume(), 54.74, 0.01);
    }

    //Test the addItem method to check if it adds contents to the box properly.
    @Test
    public void TestAddsContents() {
        Box testBox = new Box(3.4, 3.5, 4.6);
        assertAll("All tests pass",
                () -> assertTrue(testBox.hasSpace()),
                () -> assertTrue(testBox.addItem("toy")),
                () -> assertTrue(testBox.addItem("bear")),
                () -> assertTrue(testBox.addItem("tree")),
                () -> assertTrue(testBox.addItem("spoon")),
                () -> assertTrue(testBox.addItem("cat")),
                () -> assertTrue(testBox.addItem("crayon")),
                () -> assertTrue(testBox.addItem("tv")),
                () -> assertTrue(testBox.addItem("controller")),
                () -> assertTrue(testBox.addItem("dish")),
                () -> assertTrue(testBox.addItem("fork")),
                () -> assertFalse(testBox.hasSpace()),
                () -> assertFalse(testBox.addItem("baby"))
        );
    }

    //Test the removeItem method to see if it removes contents as expected.
    @Test
    public void TestRemovesContent() {
        Box testBox = new Box(3.4, 3.5, 4.6);
        testBox.addItem("toy");
        testBox.addItem("bear");
        assertAll("Pass all tests",
                () -> assertTrue(testBox.hasItems()),
                () -> assertTrue(testBox.removeItem()),
                () -> assertTrue(testBox.removeItem()),
                () -> assertFalse(testBox.removeItem()),
                () -> assertFalse(testBox.hasItems())
        );
    }
}
