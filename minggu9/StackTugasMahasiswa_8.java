package minggu9;

public class StackTugasMahasiswa_8 {
    Mahasiswa_8[] stack;
    int size,top;

    public StackTugasMahasiswa_8(int size){
        this.size=size;
        stack = new Mahasiswa_8[size];
        top = -1;
    }

    public boolean isFull(){
        if (top == size -1){
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
    
    public void push (Mahasiswa_8 mhs){
        if (!isFull()){
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa_8 pop(){
        if (!isEmpty()){
            Mahasiswa_8 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai");
            return null;
        }
    }

    public Mahasiswa_8 peek(){
        if(!isEmpty()){
            return stack[top];
        }else{
            System.out.println("Stack kosong! tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public Mahasiswa_8 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public int hitungJml(){
        return top +1;
    }

    void print(){
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}
