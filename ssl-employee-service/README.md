# SSL employee-service


# 1. Generate the JSK (following example used in STS terminal)

$ pwd
/c/Users/user

user@DASALOKE-17HPWIN10 MINGW64 ~
$ cd /c/Porjects/localRepo.vision.tech/spring2.7j18-ssl

user@DASALOKE-17HPWIN10 MINGW64 /c/Porjects/localRepo.vision.tech/spring2.7j18-ssl
$ keytool -genkey -alias vision_ssl_key -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore visiontech.jks
Enter keystore password:  
Re-enter new password: 
What is your first and last name?
  [Unknown]:  Aloke Das
What is the name of your organizational unit?
  [Unknown]:  DEV
What is the name of your organization?
  [Unknown]:  vision
What is the name of your City or Locality?
  [Unknown]:  Toronto
What is the name of your State or Province?
  [Unknown]:  Ontario
What is the two-letter country code for this unit?
  [Unknown]:  ca
Is CN=Aloke Das, OU=DEV, O=vision, L=Toronto, ST=Ontario, C=ca correct?
  [no]:  yes

Generating 2,048 bit RSA key pair and self-signed certificate (SHA256withRSA) with a validity of 90 days
        for: CN=Aloke Das, OU=DEV, O=vision, L=Toronto, ST=Ontario, C=ca

user@DASALOKE-17HPWIN10 MINGW64 /c/Porjects/localRepo.vision.tech/spring2.7j18-ssl

#2. Move to key in resource directory in the project

# 3. Test the application 
a). https://localhost:8081/api/hello
NOTE: It will show the security cert on the browser (as it was not siged it will show the not secure conditon).

b). http://localhost:8080/api/hello

NOTE: no cert info 


