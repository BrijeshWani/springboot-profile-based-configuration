# springboot-profile-based-configuration
Loading configuration classes based on profile.

Profile based configuration can be loaded using @Profile annotation.
Check below class,

```java
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import springboot.controller.TestController;

@Configuration
@Profile("dev")
public class DevProfileConfig {
	public DevProfileConfig() {
		System.out.println("##########################");
		System.out.println("In dev config");
		System.out.println("##########################");
	}
}
```

Here "dev" is profile name.

You can set profile manually using runtime arguments,

```
java -jar springboot-profile-based-configuration-0.0.1-SNAPSHOT.jar --spring.profiles.active=test
```

## Activate profiles based on switch
We can activate one or more profiles based on value of --spring.profiles.active=profile_value runtime argument.
Consider below properties,

```
spring.application.name: springboot-client
server.port: 8080
---
spring.profiles: common
spring.profiles.include:
  - dev
  - test
---
spring.profiles: devonly
spring.profiles.include:
  - dev
```

Above property file says that, if
1. Value of --spring.profiles.active argument is "common" then, "dev" and "test" both profiles will be activated including "common" profile.
2. Value of --spring.profiles.active argument is "devonly" then, only "dev" profile will be activated including "devonly" profile.