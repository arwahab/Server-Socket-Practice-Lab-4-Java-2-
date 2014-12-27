package laab.pkg4;

import java.net.*;
import java.io.*;

// Lab 4 //
// Abdul Wahab //

class Client {

    public static void main(String[] arg) throws Exception {

        Client c = new Client();
        c.run();

    }

    void run() throws Exception {

        try {

            Socket sox = new Socket("localHost", 13000);
            PrintStream ps = new PrintStream(sox.getOutputStream());
            ps.println("Hello Server! I'm your Client."); //to initiate contact w/ server (awaiting contact.)

            InputStreamReader isr = new InputStreamReader(sox.getInputStream()); //receive input from server.
            BufferedReader br = new BufferedReader(isr); //read received input from server. 

            String ClientMessage = br.readLine();
            System.out.println(ClientMessage);
            System.out.println("Hello once again, SERVER. This is CLIENT.");

        } catch (IOException IO) {

        }

    }

}
