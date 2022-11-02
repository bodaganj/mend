package com.mend.task;

import com.mend.task.command.AbortCommand;
import com.mend.task.command.Command;
import com.mend.task.command.MoveCommand;
import com.mend.task.command.StopCommand;
import com.mend.task.connection.Connection;
import com.mend.task.engine.Engine;

public class Server {

   public Command abortCommand;
   public Command moveCommand;
   public Command stopCommand;

   public Server(Connection connection, Engine engine) {
      this.abortCommand = new AbortCommand(connection, engine);
      this.moveCommand = new MoveCommand(connection, engine);
      this.stopCommand = new StopCommand(connection, engine);
   }
}
