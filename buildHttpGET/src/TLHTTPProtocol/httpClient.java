package TLHTTPProtocol;
import java.io.DataOutputStream;
import java.net.Socket;
public class httpClient extends GETRequestHttp{ 
      public void sendRequest(){
          String message=GETRequest;
          try{
              System.out.println("Message send= \n\r"+message);
              Socket clientSocket =  new Socket("localhost",2002);
              DataOutputStream dOut = new DataOutputStream(clientSocket.getOutputStream());
              dOut.writeUTF(message);
              dOut.flush();
              dOut.close();
              clientSocket.close();
          }catch(Exception e){System.out.println(e);}
      } 
  }
