package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.Vector;

public class MainServ {
    private Vector<ClientHandler> clients;

    public MainServ() throws SQLException {
        clients = new Vector<>();
        ServerSocket server = null;
        Socket socket = null;

        try {
            AuthService.connect();
            server = new ServerSocket(8189);
            System.out.println("Сервер запущен!");

            while (true) {
                socket = server.accept();
                System.out.println("Клиент подключился!");
                new ClientHandler(this, socket);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        AuthService.disconnect();
    }

    public void broadcastMsg(String msg) {
        for (ClientHandler o: clients) {
            o.sendMsg(msg);
        }
    }

    public void whisperMsg(ClientHandler from, String nickTo, String wMsg) {
        for(ClientHandler o : clients) {
            if (o.getNick().equals(nickTo)) {
                o.sendMsg("От: " + from.getNick() + ": " + wMsg);
                from.sendMsg("Кому: " + nickTo + ": " + wMsg);
                return;
            }
        }
        from.sendMsg("Пользователь с ником " + nickTo + " не найден");
    }

    public boolean isNickBusy(String nick) {
        for (ClientHandler o : clients) {
            if(o.getNick().equals(nick)){
                return true;
            }
        }
        return false;
    }

    public void subscribe(ClientHandler client) {
        clients.add(client);
    }

    public void unsubscribe(ClientHandler client) {
        clients.remove(client);
    }
}
