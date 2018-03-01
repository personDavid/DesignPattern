package Command;

public class Content {
    public static void main(String[] args) {


        NEWWorker newWorker = new NEWWorker();
        NEWCommand newCommand = new NEWCommand(newWorker);
        Boss boss = new Boss(newCommand);
        boss.command();;

    }
}
