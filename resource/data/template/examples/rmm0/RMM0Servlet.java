public class Rmm1Servlet extends HttpServlet
{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    {
        Boolean returnJson = ((String)request.getParameter("resultFormat")).equals("json")

        //DO A LOT OF WORK HERE


        //Create a map of data to return
        Map jsonObject = new HashMap();
        jsonObject.put("name", "mike");
        jsonObject.put("company", "Universal Mind");


        response.setContentType("application/json");
        // Get the printwriter object from response to write the required json object to the output stream
        PrintWriter out = response.getWriter();
        out.print(jsonObject);
        out.flush();
    }

}