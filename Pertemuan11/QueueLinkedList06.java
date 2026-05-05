package Pertemuan11;

public class QueueLinkedList06 {
    NodeMahasiswa06 front, rear;
    int size = 0;

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return false;
    }

    void enqueue(DataMahasiswa06 data) {
        NodeMahasiswa06 newNode = new NodeMahasiswa06(data, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa masuk antrian");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa dipanggil:");
            front.data.tampilInformasi();
            front = front.next;
            size--;
        }
    }

    void peekFront() {
        if (!isEmpty()) {
            front.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            rear.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            NodeMahasiswa06 temp = front;
            while (temp != null) {
                temp.data.tampilInformasi();
                temp = temp.next;
            }
        }
    }

    int getSize() {
        return size;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }
}