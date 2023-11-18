package Aerolinea;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("Tripulante 1")
                .password("{noop}1234")
                .roles("TRIPULANTE","USER")
      .and()
                .withUser("Tripulante 2")
                .password("{noop}1234")
                .roles("TRIPULANTE","USER");
    }
    
    @Override
    protected void configure (HttpSecurity http) throws Exception {
        
        http.authorizeRequests()
                .antMatchers("boletos/clientes")
                .hasRole("TRIPULANTE")
                .antMatchers("boletos/paises")
                .hasRole("VENDEDOR2")
                .antMatchers("/")
                .hasAnyRole("TRIPULANTE","USER")
                .and()
                .formLogin()
                .loginPage("/login")
                .and()
                .exceptionHandling().accessDeniedPage("/errores/403");
        
    }

}
