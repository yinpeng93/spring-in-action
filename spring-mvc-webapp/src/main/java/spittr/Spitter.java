package spittr;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author yp
 * @description
 * @date 2017/12/21 22:04
 */
@Component
public class Spitter {

    private Long id;
    @NotNull //所注解的元素不能为空
    @Size(min = 5,max = 16) //非空，5到16个字符
    private String username;
    @NotNull
    @Size(min = 5,max = 25)
    private String password;

    @NotNull
    @Size(min = 2,max = 30)
    private String firstName;

    @NotNull
    @Size(min = 2,max = 30)
    private String lastName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Spitter{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
