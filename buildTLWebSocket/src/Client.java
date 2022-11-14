import TLWebSocketProtocol.websocketClient;
public class Client {
    public static void main(String[] args) throws Exception {
        String key="dGhlIHNhbXBsZSBub25jZQ==";
        websocketClient ws = new websocketClient();
        System.out.println(ws.generateWebsocketAccept(key));
    }
}
