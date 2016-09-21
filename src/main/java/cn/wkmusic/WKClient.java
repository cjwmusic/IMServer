package cn.wkmusic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by caijunwei on 9/15/16.
 */

public class WKClient {

    public void start() {
        String serverAddress = "localhost";
        try {
            Socket s = new Socket(serverAddress, 9080);
            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String answer = input.readLine();
            System.out.println("收到服务端的应答:" + answer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
