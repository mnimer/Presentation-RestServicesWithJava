
@Controller
@RequestMapping("/")
public class StatusCodes
{

    @RequestMapping(value="/user/{id}", method=GET)
    public ResponseEntity<User> getUser(String id)
    {
        /// return 200
        User user = someDataObject.createUser(id);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }


    @RequestMapping(value="/user", method=POST)
    public ResponseEntity<User> createUser1(String name, String email)
    {
        /// return 201
        User user = someDataObject.createUser(id);
        return new ResponseEntity<User>(user, HttpStatus.CREATED);
    }


    @RequestMapping(value="/user", method=POST)
    public ResponseEntity<Void> createUser2(String name, String email)
    {
        /// return 409
        User user = someDataObject.createUser(id);
        return new ResponseEntity<Void>(HttpStatus.CONFLICT);
    }


    @RequestMapping(value="/user", method=POST)
    public ResponseEntity<Map> createUser3(String id, String name, String email)
    {
        // DO some work to check the database with the version you have
        // maybe using a modified date

        /// return 409 with before & after
        Map result = new HashMap();
        result.put("currentUser", currentUser);
        result.put("updatedUser", updatedUser);

        return new ResponseEntity<Map>(result, HttpStatus.CONFLICT);
    }

}

