package Command;

public class NEWCommand implements ICommand {
    IWorker worker;
    NEWCommand(IWorker worker){
        this.worker=worker;
    }
    @Override
    public Object execute() {
        System.out.println("命令，晚上七点升级");
        worker.work();
        return null;
    }
}
