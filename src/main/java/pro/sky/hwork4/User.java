package pro.sky.hwork4;

import java.util.Arrays;
import java.util.Objects;

public class User {
    private String login;
    private String email;

    public User() {
    }

    public User(String login, String email) throws IllegalArgumentException {
        if (login != null && !login.isEmpty()) {
            if (!login.equals(email)) {
                this.login = login;
            } else {
                throw new IllegalArgumentException("Логин и пароль не должны совпадать");
            }
        }
        if (email != null && !email.isEmpty()) {
            if (email.contains("@") && email.contains(".")) {
                this.email = email;
            } else {
                throw new IllegalArgumentException("Адрес должен содержать символы @ и .");
            }
        }
    }

    public String getLogin() {
        return login;
    }

    public String getEmail(String email) {
        return this.email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email);
    }
}
