package Jobsheet9;

public class StackSurat06 {
    Surat06[] stack;
    int top;
    int size;

    public StackSurat06(int size) {
        this.size = size;
        stack = new Surat06[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat06 s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat06 pop() {
        if (!isEmpty()) {
            Surat06 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat06 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Surat izin dengan nama " + nama + " DITEMUKAN");
        } else {
            System.out.println("Surat izin dengan nama " + nama + " TIDAK DITEMUKAN");
        }
    }
}