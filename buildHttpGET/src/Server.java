import TLHTTPProtocol.httpServer;
import java.io.IOException;
class Server {
    public static void main(String[] args) throws IOException, ClassCastException {
        httpServer server = new httpServer();
        server.receiveRequest();
    }
  }