package CaseMethod2;

public class DoubleLinkedListPembeli06 {
    NodePembeli06 head;
    NodePembeli06 tail;

    int nomor = 1;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(Pembeli06 pembeli) {
        NodePembeli06 nodeBaru = new NodePembeli06(nomor, pembeli);

        if (isEmpty()) {
            head = tail = nodeBaru;
        } else {
            tail.next = nodeBaru;
            nodeBaru.prev = tail;
            tail = nodeBaru;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + nomor);
        nomor++;
    }

    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        NodePembeli06 current = head;

        System.out.println("====================================");
        System.out.println("DAFTAR ANTRIAN PEMBELI");
        System.out.println("====================================");
        System.out.printf("%-10s %-20s %-15s\n", "No", "Nama", "No HP");

        while (current != null) {
            System.out.printf("%-10d %-20s %-15s\n",
                current.nomorAntrian,
                current.data.namaPembeli,
                current.data.noHp);

            current = current.next;
        }
    }

    public NodePembeli06 hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }

        NodePembeli06 hapus = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return hapus;
    }
}