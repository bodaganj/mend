package com.mend.task.command;

import com.mend.task.connection.Connection;
import com.mend.task.engine.Engine;

public class StopCommand extends Command {

   public StopCommand(Connection connection, Engine engine) {
      super(connection, engine);
   }

   @Override
   public void getCommandDefinition() {
      System.out.print("Stop command which is constructed base on:\n");
      connection.applyConnection();
      engine.applyEngine();
   }
}
