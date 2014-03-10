package echoclient;

import java.io.*;


public class EchoClient{
    public static void main(String[] args) throws IOException{
        Client c=new Client();
        c.connetti();
        boolean fine=false;
        BufferedReader std_in=new BufferedReader(new InputStreamReader(System.in));
        while(fine==false)
        {
            String s1=std_in.readLine();
            if(s1.equals("fine"))
            {
                fine=true;
            }
            c.invio(s1);
            if(!s1.equals("fine")&&!s1.equals("maiuscole:on")&&!s1.equals("maiuscole:off"))
            {
                    System.out.println(c.ricevi());
            }
        }
    }
}
     