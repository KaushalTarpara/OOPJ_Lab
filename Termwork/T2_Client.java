import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class T2_Client{


  public static void main(String[] args) {
  

    String host = "localhost";
    int port = 1234;
    String message = "";
    
    try {

      Socket socket = new Socket(host, port);
      

      System.out.println("Connection established with " + socket.getInetAddress());
      

      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
      
      
      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      
      
      PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
      
      
      while (!message.equals("bye")) {
      
        message = input.readLine();
        
      
        out.println(message);
        
      
        String reply = in.readLine();
        
      
        System.out.println("Server: " + reply);
      }
      
      
      socket.close();
      input.close();
    }
    catch (Exception e) {
      
      e.printStackTrace();
    }
  }
}