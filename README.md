## 📜 License

This project is under a **Custom License** that prohibits commercial use.

See the [LICENSE](./LICENSE) file for full terms.  
For commercial licensing, please contact: **dev.skyachieve91@gmail.com**

------------------------------------------------------------------------

# Join the membership
## Diagram 📝
<img src = "https://github.com/devKobe24/images2/blob/main/JoinTheMembership.png?raw=true">

## 기능
1️⃣ 회원가입</br>
2️⃣ 로그인/로그아웃</br>
3️⃣ h2</br>

### 1️⃣ 회원가입.

<img src = "https://github.com/devKobe24/images2/blob/main/signup.png?raw=true">

### 2️⃣ 로그인/로그아웃

<img src = "https://github.com/devKobe24/images2/blob/main/login.png?raw=true">
<img src = "https://github.com/devKobe24/images2/blob/main/loginSuccess.png?raw=true">

### 3️⃣ h2

<img src = "https://github.com/devKobe24/images2/blob/main/h2.png?raw=true">

## 활용 기술(Skills) 🛠️

1️⃣ 스프링 시큐리티</br>
2️⃣ UserDetails</br>
3️⃣ SecurityFilterChain</br>
4️⃣ H2</br>

## Join the membership 구조 🏗️
```
.
├── build
│   ├── classes
│   │   └── java
│   │       ├── main
│   │       │   └── com
│   │       │       └── kobe
│   │       │           └── jointhemembership
│   │       │               ├── config
│   │       │               │   └── WebSecurityConfig.class
│   │       │               ├── controller
│   │       │               │   ├── LoginViewController.class
│   │       │               │   ├── UserApiController.class
│   │       │               │   └── UserViewController.class
│   │       │               ├── domain
│   │       │               │   ├── User.class
│   │       │               │   └── User$UserBuilder.class
│   │       │               ├── dto
│   │       │               │   └── request
│   │       │               │       └── AddUserRequest.class
│   │       │               ├── JoinTheMembershipApplication.class
│   │       │               ├── repository
│   │       │               │   └── UserRepository.class
│   │       │               └── service
│   │       │                   ├── UserDetailService.class
│   │       │                   └── UserService.class
│   │       └── test
│   │           └── com
│   │               └── kobe
│   │                   └── jointhemembership
│   │                       └── JoinTheMembershipApplicationTests.class
│   ├── generated
│   │   └── sources
│   │       ├── annotationProcessor
│   │       │   └── java
│   │       │       ├── main
│   │       │       └── test
│   │       └── headers
│   │           └── java
│   │               ├── main
│   │               └── test
│   ├── libs
│   │   ├── JoinTheMembership-1.0-plain.jar
│   │   └── JoinTheMembership-1.0.jar
│   ├── reports
│   │   ├── problems
│   │   │   └── problems-report.html
│   │   └── tests
│   │       └── test
│   │           ├── classes
│   │           │   └── com.kobe.jointhemembership.JoinTheMembershipApplicationTests.html
│   │           ├── css
│   │           │   ├── base-style.css
│   │           │   └── style.css
│   │           ├── index.html
│   │           ├── js
│   │           │   └── report.js
│   │           └── packages
│   │               └── com.kobe.jointhemembership.html
│   ├── resolvedMainClassName
│   ├── resources
│   │   └── main
│   │       ├── application.yml
│   │       ├── static
│   │       │   └── js
│   │       └── templates
│   │           ├── login.html
│   │           ├── logout.html
│   │           └── signup.html
│   ├── test-results
│   │   └── test
│   │       ├── binary
│   │       │   ├── output.bin
│   │       │   ├── output.bin.idx
│   │       │   └── results.bin
│   │       └── TEST-com.kobe.jointhemembership.JoinTheMembershipApplicationTests.xml
│   └── tmp
│       ├── bootJar
│       │   └── MANIFEST.MF
│       ├── compileJava
│       │   ├── compileTransaction
│       │   │   ├── backup-dir
│       │   │   └── stash-dir
│       │   │       ├── LoginViewController.class.uniqueId1
│       │   │       └── WebSecurityConfig.class.uniqueId0
│       │   └── previous-compilation-data.bin
│       ├── compileTestJava
│       │   └── previous-compilation-data.bin
│       ├── jar
│       │   └── MANIFEST.MF
│       └── test
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── HELP.md
├── LICENSE
├── README.md
├── settings.gradle
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── kobe
    │   │           └── jointhemembership
    │   │               ├── config
    │   │               │   └── WebSecurityConfig.java
    │   │               ├── controller
    │   │               │   ├── LoginViewController.java
    │   │               │   ├── UserApiController.java
    │   │               │   └── UserViewController.java
    │   │               ├── domain
    │   │               │   └── User.java
    │   │               ├── dto
    │   │               │   ├── request
    │   │               │   │   └── AddUserRequest.java
    │   │               │   └── response
    │   │               ├── JoinTheMembershipApplication.java
    │   │               ├── repository
    │   │               │   └── UserRepository.java
    │   │               └── service
    │   │                   ├── UserDetailService.java
    │   │                   └── UserService.java
    │   └── resources
    │       ├── application.yml
    │       ├── static
    │       │   └── js
    │       └── templates
    │           ├── login.html
    │           ├── logout.html
    │           └── signup.html
    └── test
        └── java
            └── com
                └── kobe
                    └── jointhemembership
                        └── JoinTheMembershipApplicationTests.java
```
