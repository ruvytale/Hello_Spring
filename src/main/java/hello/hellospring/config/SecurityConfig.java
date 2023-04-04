package hello.hellospring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;

import javax.sql.DataSource;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig extends SecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

//    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()
                .loginPage("/loginMain.html")
                .failureUrl("/login-error.html")
                .and()
                .logout()
                .logoutSuccessUrl("/templates/home.html");
    }
}
