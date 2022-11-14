package TLHTTPProtocol;
import java.util.HashMap;
public class GETRequestHttp{
  String GETRequest="";
  HashMap<String,String> elementOfRequest = new HashMap<String, String>();
  public GETRequestHttp(){
      elementOfRequest.put("method", "GET");
      elementOfRequest.put("sp", " ");
      elementOfRequest.put("URL", "/wireshark-labs/HTTP-wireshark-file1.html");
      elementOfRequest.put("Version", "HTTP/1.1");
      elementOfRequest.put("Carriage-Return", "\r");
      elementOfRequest.put("Line-Feed", "\n");
      elementOfRequest.put("Host:", "gaia.cs.umass.edu");
      elementOfRequest.put("Connection:", "keep-alive");
      elementOfRequest.put("Upgrade-Insecure-Requests:", "1");
      elementOfRequest.put("User-Agent:", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36");
      elementOfRequest.put("Accept:", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
      elementOfRequest.put("Accept-Encoding:", "gzip, deflate");
      elementOfRequest.put("Accept-Language:", "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7");
      elementOfRequest.put("If-None-Match:", "\"80-5ed2c6cb20bad\"");
      elementOfRequest.put("If-Modified-Since:", "Fri, 11 Nov 2022 06:59:01 GMT");
      elementOfRequest.put("Content-Length:", "19");
      elementOfRequest.put("body", "[HTTP request 1/1]");
  }
  public void buildGETRequestHttp(){
      GETRequest="";
      GETRequest=GETRequest.concat(elementOfRequest.get("method"));
      GETRequest=GETRequest.concat(elementOfRequest.get("sp"));
      GETRequest=GETRequest.concat(elementOfRequest.get("URL"));
      GETRequest=GETRequest.concat(elementOfRequest.get("sp"));
      GETRequest=GETRequest.concat(elementOfRequest.get("Version"));
      GETRequest=GETRequest.concat(elementOfRequest.get("Carriage-Return"));
      GETRequest=GETRequest.concat(elementOfRequest.get("Line-Feed"));
      GETRequest=GETRequest.concat("Host:");
      GETRequest=GETRequest.concat(elementOfRequest.get("sp"));
      GETRequest=GETRequest.concat(elementOfRequest.get("Host:"));
      GETRequest=GETRequest.concat(elementOfRequest.get("Carriage-Return"));
      GETRequest=GETRequest.concat(elementOfRequest.get("Line-Feed"));
      GETRequest=GETRequest.concat("Connection:");
      GETRequest=GETRequest.concat(elementOfRequest.get("sp"));
      GETRequest=GETRequest.concat(elementOfRequest.get("Connection:"));
      GETRequest=GETRequest.concat(elementOfRequest.get("Carriage-Return"));
      GETRequest=GETRequest.concat(elementOfRequest.get("Line-Feed"));
      GETRequest=GETRequest.concat("User-Agent:");
      GETRequest=GETRequest.concat(elementOfRequest.get("sp"));
      GETRequest=GETRequest.concat(elementOfRequest.get("User-Agent:"));
      GETRequest=GETRequest.concat(elementOfRequest.get("Carriage-Return"));
      GETRequest=GETRequest.concat(elementOfRequest.get("Line-Feed"));
      GETRequest=GETRequest.concat("Content-Length:");
      GETRequest=GETRequest.concat(elementOfRequest.get("sp"));
      GETRequest=GETRequest.concat(elementOfRequest.get("Content-Length:"));
      GETRequest=GETRequest.concat(elementOfRequest.get("Carriage-Return"));
      GETRequest=GETRequest.concat(elementOfRequest.get("Line-Feed"));
      GETRequest=GETRequest.concat(elementOfRequest.get("Carriage-Return"));
      GETRequest=GETRequest.concat(elementOfRequest.get("Line-Feed"));
      GETRequest=GETRequest.concat(elementOfRequest.get("body"));
  }
  public void setElementOfRequest(String new_key, String new_value){
      elementOfRequest.put(new_key, new_value );
  }
  public void setExitGETRequest(){
      GETRequest="exit";
  }
}
