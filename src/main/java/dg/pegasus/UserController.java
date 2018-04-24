package dg.pegasus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main REST controller for processing all user administration requests.
 * @author gianninasd
 */
@RestController
@RequestMapping(path="/user")
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping("/getUser")
  public User getUser() {
    return userService.load("dd7262ad-f713-4d36-bcb3-fe9b5e75a74d");
  }

  @RequestMapping("/create")
  public @ResponseBody String create( @RequestBody User user ) {
    userService.create(user);
    return "Saved";
  }
}