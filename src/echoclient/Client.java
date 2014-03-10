
package echoclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;


public class Client
{
    private Socket s=null;
    private BufferedReader sock_in=null;
    private PrintWriter sock_out=null;
    
    public void connetti()throws IOException
    {
        s=new Socket("127.0.0.1",5555);
        sock_in=new BufferedReader(new InputStreamReader(s.getInputStream()));
        sock_out=new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
    }
    
    public void invio(String s)
    {
        sock_out.println(s);
    }
    public String ricevi()throws IOException
    {
        return sock_in.readLine();
    }
}
