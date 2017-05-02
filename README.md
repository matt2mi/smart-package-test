# Smart package example
## Structure
The structure of this application is like the following :

### Smart-package-test-back 
A backed application that seve a webservice, its a spring-boot application with mongodb

### smart-package-test-front
An angular 2 and typescript application generated with angular-cli

## Run the applications

### Compile the frontend :
While compiling the frontend, it will create a jar that can be used by the backend

```bash
$ cd smart-package-test-front
$ npm run mvn:install
```

### Run the backend
We have two options to run the back
* Run from intellij or other IDE : Only run the main class `com.bouhanef.smart_package.test`
* Run from the maven command plugin's :

```bash
$ cd smart-package-test-back
$ mvn spring-boot:run
```

Visit this link [https://localhost:8080](https://localhost:8080)