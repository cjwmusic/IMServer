package cn.wkmusic;

import java.io.IOException;

/**
 * Created by caijunwei on 9/15/16.
 */
public class ClientMain {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        WKClient client = new WKClient();
        client.start();
    }
}
