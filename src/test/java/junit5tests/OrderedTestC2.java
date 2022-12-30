package junit5tests;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrderedTestC2 {

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
    @Order(2)
    void firstMethod(){
        System.out.println("This is the first test method");
    }
    @Test
    @DisplayName("US1234 - TC12 - this method is the second one")
    void secondMethod(){
        System.out.println("This is the second test method");
    }
    @Test
    @Order(1)
    void thirdTest(){
        System.out.println("this is the third method");
    }
}
