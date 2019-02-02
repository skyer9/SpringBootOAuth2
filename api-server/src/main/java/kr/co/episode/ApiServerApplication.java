package kr.co.episode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class ApiServerApplication {
    // openssl x509 -inform der -in server.cer -pubkey -noout
    // curl -u client1:1234 http://localhost:8080/oauth/token -d  "grant_type=password&username=user1&password=1234"
    // curl -H "authorization: bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NDkxMzQzNjgsInVzZXJfbmFtZSI6InVzZXIxIiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9VU0VSIl0sImp0aSI6ImZhMjk1NGY4LTc5ODItNDE5Zi1iYjY0LWY4MDY3YjQ3NDA0MSIsImNsaWVudF9pZCI6ImNsaWVudDEiLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiXX0.XsSsuKUBzd9g9tK6M5UuLgEYe13_fUGXw8sM_pSbV-GWi3dPVefadMJiDbydf4HLEiPDnZIUIH3YP2vjuoroxvgGGB605IKyo7uCpTU4RkeOGuvUl0hzlwtV1qDbcdegcOrLDGhkk2Zcos9tfxuEalGU7YpD5oRUwSoqcH3StdF7_-f2wkA7w0lUX4iftZrRYEziExUA03rHIAJDMbxvt2BeFN7STJeQ7QCjLpV92tnwe_fr43xJY3ACC-EmBou2Y96JCLPDKGmdRVT1JBwbfsID44ql8x-4pa0FktMuFOiGZUragfuFOJYuRJ8pM_gkhp_zqajJpkL5D1kXO1_K6Q" http://localhost:8081/api/user
    public static void main(String[] args) {
        SpringApplication.run(ApiServerApplication.class, args);
    }
}
