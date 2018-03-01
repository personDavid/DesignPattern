package Command;

public class NEWWorker implements IWorker {
    @Override
    public Object work() {
        System.out.println("员工拼命工作，望山跑死马");
        return null;
    }
}
