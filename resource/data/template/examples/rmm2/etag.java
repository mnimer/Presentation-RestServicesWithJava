
@Controller
@RequestMapping("/")
public class Search
{

    @RequestMapping(value="/item/{id}", method=GET)
    public RequestEntity<User> getUser(WebRequest webRequest, @PathVariable("id") String id)
    {
        long lastModified = // 1. application-specific calculation

        if (request.checkNotModified(lastModified)) {
            // 2. shortcut exit - no further processing necessary
            return null;
        }

        // 3. or otherwise further request processing, actually preparing content
        User user = new User(); /
        return user;
    }

}
