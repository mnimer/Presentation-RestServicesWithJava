
@Controller
@RequestMapping("/")
public class Search
{

    @Cacheable(value = "userCache", key = "#id")

    @RequestMapping(value="/user/{id}", method=GET)
    public RequestEntity<User> getUser(@PathVariable("id") String id)
    {
        User user = someDataObject.getUser(id);

        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

}
