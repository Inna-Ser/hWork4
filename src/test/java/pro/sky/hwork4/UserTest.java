package pro.sky.hwork4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    public String login = "User";
    public String email = "user@gmail.com";

    @Test
    public void testUserConstructor() {
        User out = new User(login, email);
        Assertions.assertNotNull(login);
        Assertions.assertNotNull(email);
    }

    @Test
    public void testUserConstructorNull() {
        Assertions.assertNull(null);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenEmailContainsIllegalCharacter() {
        String email = "user";
        Assertions.assertThrows(IllegalArgumentException.class, () -> new User(login, email));
    }

    @Test
    public void shouldTrowIllegalArgumentExceptionWhenLoginEqualEmail() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> new User("user", "user"));
    }
}