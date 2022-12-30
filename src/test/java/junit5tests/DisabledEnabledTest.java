package junit5tests;

import listeners.Listener;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

@ExtendWith(Listener.class)
public class DisabledEnabledTest {

    @Test
    @Disabled(value = "Disabled for demo @Disabled")
    void firstMethod(){
        System.out.println("This is the first test method");
    }
    @Test
    @DisabledOnOs(value = OS.WINDOWS, disabledReason = "Disabled for " +
            "demo of @DisabledOnOs")
    void secondMethod(){
        System.out.println("This is the second test method");
    }
    @Test
    @DisabledIfSystemProperty(named = "env", matches = "staging", disabledReason = "demo " +
            "for env")
    void thirdMethod(){
        System.out.println("This is the third test method");
    }
    @Test
    @DisabledIf(value = "provider", disabledReason = "disabled for demo @DisabledIf")
    void fourthMethod(){
        System.out.println("This is the fourth test method");
    }
    @Test
    void fifthMethod(){
        System.out.println("This is the fifth test method");
    }

    boolean provider(){
        return LocalDateTime.now().getDayOfWeek().equals(DayOfWeek.THURSDAY);
    }
}
