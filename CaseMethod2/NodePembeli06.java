package CaseMethod2;

public class NodePembeli06 {
    int nomorAntrian;
    Pembeli06 data;
    NodePembeli06 prev;
    NodePembeli06 next;

    public NodePembeli06(int nomorAntrian, Pembeli06 data) {
        this.nomorAntrian = nomorAntrian;
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}