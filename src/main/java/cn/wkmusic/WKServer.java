package cn.wkmusic;

import com.alibaba.fastjson.JSONObject;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by caijunwei on 9/15/16.
 */
public class WKServer {

    public void start() throws IOException {
        ServerSocket listener = new ServerSocket(9080);
        try {
            while (true) {

                //接收客户端的链接
                Socket socket = listener.accept();
                try {

                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//                    out.println(new Date().toString());
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("name", "wukong");
                    jsonObject.put("age", "17");
                    jsonObject.put("gender", "M");
                    out.println(jsonObject.toString());
                } finally {
                    socket.close();
                }

            }
        } finally {
            listener.close();
        }

    }


}
