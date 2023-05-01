import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class T2_Server {


  public static void main(String[] args) {
  

    int port = 1234;
    String message = "";
    
    try {

      ServerSocket server = new ServerSocket(port);
      

      System.out.println("Server is waiting for a connection on port " + port);
      
     
      Socket socket = server.accept();
      
     
      System.out.println("Connection established with " + socket.getInetAddress());
      
      
      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      
      
      PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
      
      
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
      
      
      while (!message.equals("bye")) {
      
        message = in.readLine();
        
      
        System.out.println("Client: " + message);
        
      
        if (message.equals("bye")) {
                break;
        }
        
        
        message = input.readLine();
        
        
        out.println(message);
      }
      
      
      socket.close();
      server.close();
      input.close();
    }
    catch (Exception e) {
      
      e.printStackTrace();
    }
  }
}