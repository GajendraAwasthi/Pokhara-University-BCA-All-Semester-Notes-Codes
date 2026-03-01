class HashingWithQuadraticProbing {

    int[] hashtable;
    int tablesize;

    public HashingWithQuadraticProbing(int tablesize) {
        this.tablesize = tablesize;
        hashtable = new int[tablesize];
        for (int i = 0; i < tablesize; i++) {
            hashtable[i] = -1;
        }
    }

    int hash(int key) {
        return key % tablesize;
    }

    public void insert(int key) {
        int index = hash(key);

        if (hashtable[index] == -1) {
            hashtable[index] = key;
            return;
        }

        for (int i = 1; i < tablesize; i++) {
            int newIndex = (index + i * i) % tablesize;
            if (hashtable[newIndex] == -1) {
                hashtable[newIndex] = key;
                return;
            }
        }

        System.out.println("Hash hashtable is full. Cannot insert " + key);
    }

    public boolean search(int key) {
        int index = hash(key);

        if (hashtable[index] == key) {
            return true;
        }

        for (int i = 1; i < tablesize; i++) {
            int newIndex = (index + i * i) % tablesize;
            if (hashtable[newIndex] == -1) {
                return false;
            }
            if (hashtable[newIndex] == key) {
                return true;
            }
        }

        return false;
    }

    public void display() {
        for (int i = 0; i < tablesize; i++) {
            System.out.println(i + " : " + hashtable[i]);
        }
    }

    public static void main(String[] args) {
        HashingWithQuadraticProbing ht = new HashingWithQuadraticProbing(10);

        ht.insert(1);
        ht.insert(16);
        ht.insert(49);
        ht.insert(36);
        ht.insert(25);
        ht.insert(64);
        ht.insert(0);
        ht.insert(81);
        ht.insert(4);
        ht.insert(9);

        ht.display();

        System.out.println("Search 49: " + ht.search(49));
        System.out.println("Search 16: " + ht.search(16));
    }
}
//wap to insert data using hash fuction:h(k)%size, if empty insert otherwise print message collision occur
//wap to insert data using hash fuction:h(k)%size, if empty insert otherwise print message collision occur