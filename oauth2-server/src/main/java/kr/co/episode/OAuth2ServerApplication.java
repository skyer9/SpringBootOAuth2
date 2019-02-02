package kr.co.episode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableAuthorizationServer
@SpringBootApplication
public class OAuth2ServerApplication {
    public static void main(String[] args) {
        // keytool -genkeypair -alias auth -keyalg RSA -dname "CN=Web Server,OU=Unit,O=Organization,L=City,S=State,C=US" -keypass passone -keystore server.jks -storepass passtwo
        // keytool -export -keystore server.jks -alias auth -file server.cer
        // curl -u client1:1234 http://localhost:8080/oauth/token -d  "grant_type=password&username=user1&password=1234"
        SpringApplication.run(OAuth2ServerApplication.class, args);
    }
}
