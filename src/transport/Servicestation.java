package transport;

import java.util.LinkedList;
import java.util.Queue;

public class Servicestation<T extends Transport> {




    private Queue<T> queue = new LinkedList<>();

    public void addTransport(T transport){
        queue.offer(transport);
    }

    public void Diagnosticks() {
        T transport = queue.poll();
        if(transport != null) {
            System.out.println("Механик провёл диагностику у " + transport );
        }
    }

    public int queueSize() {
        return queue.size();
    }

}
