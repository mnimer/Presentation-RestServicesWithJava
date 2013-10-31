
@Controller
@RequestMapping("/")
public class Search
{

    @RequestMapping(value="/item", method=GET)
    public RequestEntity<User> getUser(String id)
    {
        /// return 200
    }


    @RequestMapping(value="/item", method=POST)
    public RequestEntity<User> getUser(String id)
    {
        /// return 201
    }


    @RequestMapping("/simpleConflict")
    public RequestEntity<User> getUser(String id)
    {
        /// return 409
    }


    @RequestMapping("/conflictExample")
    public RequestEntity<User> getUser(String id)
    {
        /// return 409 with before & after
    }

}

