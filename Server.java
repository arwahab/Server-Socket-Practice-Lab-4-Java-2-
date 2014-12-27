package laab.pkg4;

import java.net.*;
import java.io.*;

// Lab 4 //
// Abdul Wahab //

class Server {

    public static void main(String[] args) throws Exception {

        Server serve = new Server();
        serve.run();

    }

    void run() throws Exception {

        try {

            ServerSocket svs = new ServerSocket(13000);
            Socket socks = svs.accept();
            InputStreamReader isr = new InputStreamReader(socks.getInputStream());
            BufferedReader br = new BufferedReader(isr);

            String theMessage = br.readLine();

            if (theMessage != null) {

                PrintStream ps = new PrintStream(socks.getOutputStream());
                ps.println("Message RECEIVED. Hello CLIENT. This is SERVER.");
            }
        } catch (IOException e) {

        }
    }

}
