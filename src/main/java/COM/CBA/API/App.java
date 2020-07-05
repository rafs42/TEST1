package COM.CBA.API;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );
        HttpClientExample1_1.GetRequest(1);
        HttpClientExample1_2.GetRequest("1");
        TstJsonPath1.ParseJson("1");
    }
}
