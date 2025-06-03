public class SingleLinkedList {
  NodeMhs12 head;
  NodeMhs12 tail;
  int size;

  public SingleLinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  // method isEmpty
  public boolean isEmpty() {
    return head == null;
  }

  public int getSize() {
    return size;
  }

  // method print
  public void print() {
    if (!isEmpty()) {
      System.out.println("\nDaftar Mahasiswa:");
      System.out.println("================");
      System.out.println("Jumlah Data: " + size);
      System.out.println("================");
      NodeMhs12 tmp = head;
      int index = 0;
      while (tmp != null) {
        System.out.println("\nMahasiswa ke-" + (index + 1) + ":");
        tmp.data.tampilMhs();
        tmp = tmp.next;
        index++;
      }
      System.out.println("================");
    } else {
      System.out.println("Linked List Kosong!");
    }
  }

  // method addFirst
  public void addFirst(mhs12 input) {
    NodeMhs12 ndInput = new NodeMhs12(input, null);
    if (isEmpty()) {
      head = ndInput;
      tail = ndInput;
    } else {
      ndInput.next = head;
      head = ndInput;
    }
    size++;
  }

  // method addLast
  public void addLast(mhs12 input) {
    NodeMhs12 ndInput = new NodeMhs12(input, null);
    if (isEmpty()) {
      head = ndInput;
      tail = ndInput;
    } else {
      tail.next = ndInput;
      tail = ndInput;
    }
    size++;
  }

  // method insertAfter
  public void insertAfter(String key, mhs12 input) {
    NodeMhs12 ndInput = new NodeMhs12(input, null);
    NodeMhs12 temp = head;
    boolean found = false;
    
    while (temp != null) {
      if (temp.data.nama.equals(key)) {
        ndInput.next = temp.next;
        temp.next = ndInput;
        if (ndInput.next == null) {
          tail = ndInput;
        }
        size++;
        found = true;
        break;
      }
      temp = temp.next;
    }
    
    if (!found) {
      System.out.println("Data " + key + " tidak ditemukan!");
    }
  }

  // method insertAt
  public void insertAt(int index, mhs12 input) {
    if (index < 0 || index > size) {
      System.out.println("Indeks tidak valid!");
      return;
    }

    if (index == 0) {
      addFirst(input);
      return;
    }

    if (index == size) {
      addLast(input);
      return;
    }

    NodeMhs12 temp = head;
    for (int i = 0; i < index - 1; i++) {
      temp = temp.next;
    }

    NodeMhs12 ndInput = new NodeMhs12(input, temp.next);
    temp.next = ndInput;
    size++;
  }

  // method getdata
  public void getData(int index) {
    if (isEmpty()) {
      System.out.println("Linked List Kosong!");
      return;
    }

    if (index < 0 || index >= size) {
      System.out.println("Indeks tidak valid!");
      return;
    }

    NodeMhs12 temp = head;
    for (int i = 0; i < index; i++) {
      temp = temp.next;
    }
    
    System.out.println("Data pada indeks ke-" + index + ":");
    temp.data.tampilMhs();
  }

  // method indexOf
  public int indexOf(String key) {
    NodeMhs12 temp = head;
    int index = 0;
    while (temp != null && !temp.data.nama.equals(key)) {
      temp = temp.next;
      index++;
    }
    return (temp == null) ? -1 : index;
  }

  // method removeFirst
  public void removeFirst() {
    if (isEmpty()) {
      System.out.println("Linked List Kosong!");
      return;
    }
    if (head == tail) {
      head = tail = null;
    } else {
      head = head.next;
    }
    size--;
  }

  // method removeLast
  public void removeLast() {
    if (isEmpty()) {
      System.out.println("Linked List Kosong!");
      return;
    }
    if (head == tail) {
      head = tail = null;
    } else {
      NodeMhs12 temp = head;
      while (temp.next != tail) {
        temp = temp.next;
      }
      temp.next = null;
      tail = temp;
    }
    size--;
  }

  // method remove
  public void remove(String key) {
    if (isEmpty()) {
      System.out.println("Linked List Kosong!");
      return;
    }

    if (head.data.nama.equals(key)) {
      removeFirst();
      return;
    }

    NodeMhs12 temp = head;
    NodeMhs12 prev = null;
    boolean found = false;

    while (temp != null) {
      if (temp.data.nama.equals(key)) {
        prev.next = temp.next;
        if (temp == tail) {
          tail = prev;
        }
        size--;
        found = true;
        break;
      }
      prev = temp;
      temp = temp.next;
    }

    if (!found) {
      System.out.println("Data " + key + " tidak ditemukan!");
    }
  }

  // method removeAt
  public void removeAt(int index) {
    if (isEmpty()) {
      System.out.println("Linked List Kosong!");
      return;
    }

    if (index < 0 || index >= size) {
      System.out.println("Indeks tidak valid!");
      return;
    }

    if (index == 0) {
      removeFirst();
      return;
    }

    NodeMhs12 temp = head;
    NodeMhs12 prev = null;
    for (int i = 0; i < index; i++) {
      prev = temp;
      temp = temp.next;
    }

    prev.next = temp.next;
    if (temp == tail) {
      tail = prev;
    }
    size--;
  }  
}
