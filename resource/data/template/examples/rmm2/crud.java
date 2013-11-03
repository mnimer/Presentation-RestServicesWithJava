
@Controller
@RequestMapping("/")
public class UserController
{
    // Create a new User
    @RequestMapping(value="/user", method=RequestMethod.POST)
    public ResponseEntity<Void> getUser(String name, String email)
    {
        User user = someDataObject.createUser(name, email);

        // cool trick
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation( linkTo(UserController.class).slash(user.getId()).toUri() );

        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    // Get a single user
    @RequestMapping(value="/user/{id}", method=RequestMethod.GET)
    public ResponseEntity<User> getUser( @PathVariable("id") String id)
    {
        User user = someDataObject.getUser(id);

        return new ResponseEntity<User>(user, HttpStatus.OK);
    }


    // delete a single user
    @RequestMapping(value="/user/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Void> getUser( @PathVariable("id") String id)
    {
        someDataObject.deleteUser(id);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}