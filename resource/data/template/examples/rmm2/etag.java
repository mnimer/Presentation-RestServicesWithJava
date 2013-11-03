
@Controller
@RequestMapping("/")
public class LastModifiedCheck
{

    @RequestMapping(value="/item/{id}", method=GET)
    public RequestEntity<User> getUser(WebRequest request, @PathVariable("id") String id)
    {
        long lastModified = // 1. application-specific calculation

        //Check whether the request qualifies as not modified given the supplied last-modified timestamp (as determined by the application).
        //This will also transparently set the appropriate response headers, for both the modified case and the not-modified case.
        if( request.checkNotModified(lastModified) )
        {
            return null;
        }


        // 3. or otherwise further request processing, actually preparing content
        User user = new User();
        return new RequestEntity(user, HttpStatus.OK);
    }

}
