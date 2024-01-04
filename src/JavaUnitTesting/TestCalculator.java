package JavaUnitTesting;

import org.junit.Test;
import org.junit.jupiter.api.*;

public class TestCalculator {
    private Calculator calculator=new Calculator();

    @BeforeEach
    public void beforeEach(){
        System.out.println("Before each...");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("after each...");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before all...");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("After all...");
    }

    @Test
    @DisplayName("This method tests add method of Calculator class")
    public void testAdd(){
        int actualSum = calculator.add(2,5);
        int expectedSum = 7;
        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    @DisplayName("This method tests subtract method of Calculator class")
    @Disabled
    public void testSubtract(){
        int actualDiff = calculator.subtract(5,2);
        int expectedDiff = 3;
        Assertions.assertEquals(expectedDiff, actualDiff);
    }

}
