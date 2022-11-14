package TLWebSocketProtocol;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
public class websocketClient {
  private String URL;
  public String generateWebsocketAccept(String WebSocketKey) throws NoSuchAlgorithmException {
    String magicString="258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    String merged=WebSocketKey.concat(magicString);
    //convert String to byte[]
    byte[] asByte = merged.getBytes();
    //SHA-1 hash
    MessageDigest md;
    md = MessageDigest.getInstance("SHA-1");
    md.update(asByte);
    byte[] SHA1 = md.digest();
    //base64 encode
    byte[] base64 = Base64.getEncoder().encode(SHA1);
    //get new accept key
    String newAccept = new String(base64);
    return newAccept;
  }
}
