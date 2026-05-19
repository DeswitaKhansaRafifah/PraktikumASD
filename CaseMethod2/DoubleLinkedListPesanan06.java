package CaseMethod2;

public class DoubleLinkedListPesanan06 {
    NodePesanan06 head;
    NodePesanan06 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(Pesanan06 pesanan) {
        NodePesanan06 nodeBaru = new NodePesanan06(pesanan);

        if (isEmpty()) {
            head = tail = nodeBaru;
        } else {
            tail.next = nodeBaru;
            nodeBaru.prev = tail;
            tail = nodeBaru;
        }
    }

    public void sortPesanan() {
        if (isEmpty()) {
            return;
        }

        boolean tukar;

        do {
            tukar = false;
            NodePesanan06 current = head;
            while (current.next != null) {
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {

                    Pesanan06 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;

                    tukar = true;
                }
                current = current.next;
            }
        } while (tukar);
    }

    public void tampilPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }

        sortPesanan();

        NodePesanan06 current = head;

        System.out.println("========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("========================================");
        System.out.printf("%-10s %-20s %-10s\n",
            "Kode", "Nama Pesanan", "Harga");

        while (current != null) {
            System.out.printf("%-10d %-20s %-10d\n",
                current.data.kodePesanan,
                current.data.namaPesanan,
                current.data.harga);

            current = current.next;
        }
    }
}