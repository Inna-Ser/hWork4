package pro.sky.hwork4;

import java.util.Arrays;
import java.util.Objects;

public class User {
    private String login;
    private String email;

    public User() {
    }

    public User(String login, String email) throws IllegalArgumentException {
        if (login != null || !login.isEmpty())
            this.login = login;
        if (email != null || !email.isEmpty()) {
                char[] chars = email.toCharArray();
                if (Arrays.asList(chars).contains("@") && Arrays.asList(chars).contains(".")) {
                    this.email = email;
            } else {
                throw new IllegalArgumentException("");
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
