package com.mend.task.connection;

public class TCPConnection implements Connection {

   @Override
   public void applyConnection() {
      System.out.println("TCP connection");
   }
}
