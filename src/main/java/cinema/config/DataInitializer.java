
package cinema.config;

import java.util.Set;
import javax.annotation.PostConstruct;
import mate.academy.spring.model.Role;
import mate.academy.spring.model.User;
import mate.academy.spring.service.RoleService;
import mate.academy.spring.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService service, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(String.valueOf(Role.RoleName.ADMIN));
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(String.valueOf(Role.RoleName.USER));
        roleService.add(userRole);
        User user = new User();
        user.setEmail("Vasyl@gmail.com");
        user.setPassword("admin123");
        user.setRoles(Set.of(adminRole));
        userService.add(user);
    }
}
