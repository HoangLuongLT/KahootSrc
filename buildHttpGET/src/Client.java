import TLHTTPProtocol.httpClient;
class Client{
    public static void main(String[] args) {
        httpClient client = new httpClient();
        client.buildGETRequestHttp();
        client.sendRequest();

        client.setElementOfRequest("Version", "NEW VERSION");
        client.buildGETRequestHttp();
        client.sendRequest();

        client.setElementOfRequest("Version", "NEW VERSION PRO MAX");
        client.buildGETRequestHttp();
        client.sendRequest();
        
        client.setExitGETRequest();
        client.sendRequest();
    }
  }
