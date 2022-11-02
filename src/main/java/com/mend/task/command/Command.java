package com.mend.task.command;

import com.mend.task.connection.Connection;
import com.mend.task.engine.Engine;

public abstract class Command {

   protected Connection connection;
   protected Engine engine;

   public Command(Connection connection, Engine engine) {
      this.connection = connection;
      this.engine = engine;
   }

   abstract public void getCommandDefinition();
}
