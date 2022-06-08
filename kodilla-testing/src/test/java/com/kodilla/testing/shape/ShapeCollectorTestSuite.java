package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;

public class ShapeCollectorTestSuite {
    public ShapeCollectorTestSuite() {
    }
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollection = new ShapeCollector(new Triangle());

        //When
        shapeCollection.addFigure(new Triangle());

        //Then
        Assertions.assertEquals(1, shapeCollection.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollection = new ShapeCollector(new Triangle());
        Shape triangle = new Triangle();
        shapeCollection.addFigure(triangle);

        //When
        shapeCollection.removeFigure(triangle);

        //Then
        Assertions.assertEquals(0, shapeCollection.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollection = new ShapeCollector(new Triangle());
        shapeCollection.addFigure(new Triangle());

        //When
        String retrievedShape = shapeCollection.getFigure(0);

        //Then
        Assertions.assertEquals("Triangle", retrievedShape);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollection = new ShapeCollector(new Triangle());
        shapeCollection.addFigure(new Triangle());
        shapeCollection.addFigure(new Square());
        shapeCollection.addFigure(new Circle());

        //When
        shapeCollection.showFigures();
        String retrievedShape = shapeCollection.getFigure(1);
        boolean isEqual = "Square" == retrievedShape;

        //Then
        Assertions.assertEquals(3, shapeCollection.size());
        Assertions.assertTrue(isEqual);
    }
}