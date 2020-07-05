package COM.CBA.API;

import com.jayway.jsonpath.JsonPath;

public class TstJsonPath1 {
    static String json = "{\n" +
            "    \"pageInfo\": {\n" +
            "            \"pageName\": \"Homepage\",\n" +
            "            \"logo\": \"https://www.example.com/logo.jpg\"\n" +
            "    },\n" +
            "    \"posts\": [\n" +
            "            {\n" +
            "                \"post_id\": \"0123456789\",\n" +
            "                \"actor_id\": \"1001\",\n" +
            "                \"author_name\": \"Jane Doe\",\n" +
            "                \"post_title\": \"How to parse JSON in Java\",\n" +
            "                \"comments\": [],\n" +
            "                \"time_of_post\": \"1234567890\"\n" +
            "            }\n" +
            "            {\n" +
            "                \"post_id\": \"987987\",\n" +
            "                \"actor_id\": \"1002\",\n" +
            "                \"author_name\": \"donald\",\n" +
            "                \"post_title\": \"How to parse JSON in Java\",\n" +
            "                \"comments\": [],\n" +
            "                \"time_of_post\": \"9934567890\"\n" +
            "            }\n" +
            "    ]\n" +
            "}";
    public static void ParseJson(String iJson) {
        System.out.println(json);
        String pageName = JsonPath.read(json, "$.pageInfo.pageName");
        System.out.println("pageName="+pageName);

        Integer posts = JsonPath.read(json, "$.posts.length()");

        for(int i=0; i < posts; i++) {
            String post_id = JsonPath.read(json, "$.posts[" + i + "].post_id");
            System.out.println(post_id);
        }
    }


    public static void ParseJson2(String iJson) {
        System.out.println(json);

        try {
            JSONObject jsonObject = new JSONObject(json);
        }catch (JSONException err){
            Log.d("Error", err.toString());
        }

        System.out.println(jsonObject.);

        Integer posts = JsonPath.read(json, "$.posts.length()");

        for(int i=0; i < posts; i++) {
            String post_id = JsonPath.read(json, "$.posts[" + i + "].post_id");
            System.out.println(post_id);
        }
    }
}
