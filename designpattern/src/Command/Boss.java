package Command;

public class Boss {
    //发出命令者
    private ICommand command;

    Boss(ICommand command) {
        this.command = command;
    }
   void command(){
       System.out.println("boss 下命令");
        command.execute();
    }
}
