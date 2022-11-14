package TLHTTPProtocol;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class httpServer {
  private static ServerSocket serverSocket;
  private static int port = 2002;

  public void receiveRequest() throws IOException, ClassCastException {
      serverSocket = new ServerSocket(port);
      while(true){
          System.out.println("Wating Client");
          Socket receiveSocket = serverSocket.accept();
          DataInputStream dIn = new DataInputStream(receiveSocket.getInputStream());
          String message=(String)dIn.readUTF();
          System.out.println(("Message receive: \n\r"+message));
          dIn.close();
          receiveSocket.close();
          if(message.equals("exit")) break;
      }
      serverSocket.close();
      System.out.println("Terminated Server");
  }
}
