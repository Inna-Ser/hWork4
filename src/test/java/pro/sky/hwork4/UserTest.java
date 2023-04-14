package pro.sky.hwork4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    public String login = "User";
    public String email = "User";
    private final User out = new User("User", "User");

    @Test
    public void testUserConstructor(String login, String email) {
        Assertions.assertNotNull(out);
    }

    @Test
    public void testUserConstructor() {
        Assertions.assertNull(out);
    }


    @Test
    public void shouldThrowIllegalArgumentExceptionWhenEmailContainsIllegalCharacter() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new User(login, email));
    }

    @Test
    public void shouldTrowIllegalArgumentExceptionWhenLoginEqualEmail() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> out.getLogin().equals(out.getEmail(email)));
    }

}