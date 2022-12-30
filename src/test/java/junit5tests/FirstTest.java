package junit5tests;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstTest {

    @BeforeAll
    void beforeAll(){
        System.out.println("--this is before All method");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("--this is before Each method");
    }

    @AfterAll
    void afterAll(){
        System.out.println("--this is after All method");
    }
    @AfterEach
    void afterEach(){
        System.out.println("--this is after Each method");
    }

    @Test
    void firstMethod(){
        System.out.println("This is the first test method");
    }
    @Test
    @DisplayName("US1234 - TC12 - this method is the second one")
    void secondMethod(){
        System.out.println("This is the second test method");
    }
}
