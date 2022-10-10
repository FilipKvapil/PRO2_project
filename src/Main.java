import models.chatClients.ChatClient;
import models.chatClients.InMemoryChatClient;
import models.gui.MainFrame;

public class Main {
    public static void main(String[] args) {
        MainFrame windows = new MainFrame(800,600);
    }
    private static void test(){
        ChatClient client = new InMemoryChatClient();

        client.login("asdasd");
        client.sendMessage("1");
        client.sendMessage("2");

        client.logout();
    }
}
