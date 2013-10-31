
@Controller
@RequestMapping("/")
public class Search
{

    @RequestMapping(value="/item", method=GET)
    public RequestEntity<User> getUser(String id)
    {
        /// return 200

        /**
         // CHECK CACHE
         if( cacheIdExists("user:#id#") )
         {
         var user = cacheGet("user:#id#");

         // RETURN CACHED ITEM
         var response = structNew();
         response.status = 200;
         response.content = user;
         restSetResponse( response );
         }
         else
         {
         //create user;
         var user = structNew();
         user.id = id;
         user.timestamp = now().getTime();

         //ADD TO CACHE
         cachePut("user:#id#" , user, createTimeSpan(0,1,0,0));

         var response = structNew();
         response.status = 200;
         response.content = user;
         restSetResponse( response );
         }
         */
    }

}
