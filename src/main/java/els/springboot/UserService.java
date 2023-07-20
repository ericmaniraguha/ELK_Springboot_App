package els.springboot;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserService {

    private final Logger logger = LoggerFactory.getLogger(UserService.class);

    public User getUserById(int id) {
        List<User> users = getUsers();
        User user = users.stream()
                .filter(u -> u.getId() == id)
                .findAny()
                .orElse(null);

        if (user != null) {
            logger.info("User found: {}", user);
            return user;
        } else {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("User not found with ID: {}", id);
            }
            return new User();
        }
    }

    private List<User> getUsers() {
        return Stream.of(
                new User(1, "peter"),
                new User(2, "kaka"),
                new User(3, "ndayi"),
                new User(4, "mark"))
                .collect(Collectors.toList());
    }
}
