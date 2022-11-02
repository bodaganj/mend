package com.mend.task.command;

import com.mend.task.connection.Connection;
import com.mend.task.engine.Engine;

public class AbortCommand extends Command {

   public AbortCommand(Connection connection, Engine engine) {
      super(connection, engine);
   }

   @Override
   public void getCommandDefinition() {
      System.out.print("Abort command which is constructed base on:\n");
      connection.applyConnection();
      engine.applyEngine();
   }
}
