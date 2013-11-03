
@Controller
@RequestMapping("/")
public class User
{
    // List all users  "/users"
    // OR Search for a list of users  "/users?q=boston"
    @RequestMapping(value="/users", method=RequestMethod.get)
    public ResponseEntity<User> getUser(@RequestParam(value = "q", required = false) String query)
    {
        if( query == null )
        {
            Collection<User> userList = someDataObject.getAllUsers();
        } else {
            Collection<User> userList = someDataObject.searchUsers(query);
        }

        return new ResponseEntity<User>(userList, HttpStatus.OK);
    }


    // Get a list of all managers
    @RequestMapping(value="/users/managers", method=RequestMethod.GET)
    public ResponseEntity<User> getUser( )
    {
        Collection<User> userList = someDataObject.getAllManagers();

        return new ResponseEntity<User>(userList, HttpStatus.OK);
    }


}