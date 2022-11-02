package com.mend.task.connection;

public class USBConnection implements Connection {

   @Override
   public void applyConnection() {
      System.out.println("USB connection");
   }
}
