package com.mend.task;

import com.mend.task.connection.TCPConnection;
import com.mend.task.connection.USBConnection;
import com.mend.task.engine.AEngine;
import com.mend.task.engine.CEngine;

public class Demo {

   public static void main(String[] args) {
      Server firstServer = new Server(new USBConnection(), new AEngine());
      firstServer.stopCommand.getCommandDefinition();
      firstServer.abortCommand.getCommandDefinition();

      Server secondServer = new Server(new TCPConnection(), new CEngine());
      secondServer.abortCommand.getCommandDefinition();
      secondServer.moveCommand.getCommandDefinition();
   }
}
