# SpringBootOAuth2

Spring Boot 2.1.2 버전으로 생성했으며, OAuth2 서버를 구성하고, API 서버에서 JWT 인증을 이용합니다.

`keytool` 는 JDK 밑에 bin 폴더에 있습니다.
`openssh` 는 별도로 설치해야 합니다.

```
keytool -genkeypair -alias auth -keyalg RSA -dname "CN=Web Server,OU=Unit,O=Organization,L=City,S=State,C=US" -keypass passone -keystore server.jks -storepass passtwo
keytool -export -keystore server.jks -alias auth -file server.cer
openssl x509 -inform der -in server.cer -pubkey -noout
```
