public class SingleLinkedList12 {
  NodeMahasiswa12 head;
  NodeMahasiswa12 tail;

  // method isEmpty
  public boolean isEmpty() {
    return head == null;
  }

  // method print
  public void print() {
    if (!isEmpty()) {
      System.out.println("Linked List:");
      NodeMahasiswa12 tmp = head;
      while (tmp != null) {
        System.out.print(tmp.data.nama);
        if (tmp.next != null) {
          System.out.print(" -> ");
        }
        tmp = tmp.next;
      }
      System.out.println();
    } else {
      System.out.println("Linked list kosong");
    }
  }

  // method addFirst
  public void addFirst(Mahasiswa12 input) {
    NodeMahasiswa12 ndInput = new NodeMahasiswa12(input, null);
    if (isEmpty()) {
      head = ndInput;
      tail = ndInput;
    } else {
      ndInput.next = head;
      head = ndInput;
    }
  }

  // method addLast
  public void addLast(Mahasiswa12 input) {
    NodeMahasiswa12 ndInput = new NodeMahasiswa12(input, null);
    if (isEmpty()) {
      head = ndInput;
      tail = ndInput;
    } else {
      tail.next = ndInput;
      tail = ndInput;
    }
  }

  // method insertAfter
  public void insertAfter(String key, Mahasiswa12 input) {
    NodeMahasiswa12 ndInput = new NodeMahasiswa12(input, null);
    NodeMahasiswa12 temp = head;
    
    while (temp != null) {
      if (temp.data.nama.equals(key)) {
        ndInput.next = temp.next;
        temp.next = ndInput;
        if (ndInput.next == null) {
          tail = ndInput;
        }
        return;
      }
      temp = temp.next;
    }
    System.out.println("Data " + key + " tidak ditemukan!");
  }

  // method insertAt
  public void insertAt(int index, Mahasiswa12 input) {
    if (index < 0) {
      System.out.println("Indeks tidak valid!");
      return;
    }

    if (index == 0) {
      addFirst(input);
      return;
    }

    NodeMahasiswa12 temp = head;
    for (int i = 0; i < index - 1; i++) {
      if (temp == null) {
        System.out.println("Indeks melebihi panjang list!");
        return;
      }
      temp = temp.next;
    }

    if (temp == null) {
      System.out.println("Indeks melebihi panjang list!");
      return;
    }

    NodeMahasiswa12 ndInput = new NodeMahasiswa12(input, temp.next);
    temp.next = ndInput;
    if (ndInput.next == null) {
      tail = ndInput;
    }
  }

  // method getdata
  public void getdata(int index) {
    NodeMahasiswa12 temp = head;
    for (int i = 0; i < index; i++) {
      temp = temp.next;
    }
    temp.data.tampilInformasi();
  }

  // method indexOf
  public int indexOf(String key) {
    NodeMahasiswa12 temp = head;
    int index = 0;
    while (temp != null && !temp.data.nama.equalsIgnoreCase(key)) {
      temp = temp.next;
      index++;
    }
    if (temp == null) {
      return -1;
    } else {
      return index;
    }
  }

  // method removeFirst
  public void removeFirst() {
    if (isEmpty()) {
      System.out.println("Linked list kosong!");
      return;
    }
    if (head == tail) {
      head = tail = null;
    } else {
      head = head.next;
    }
  }

  // method removeLast
  public void removeLast() {
    if (isEmpty()) {
      System.out.println("Linked list kosong, tidak dapat dihapus!");
      return;
    } else if (head == tail) {
      head = tail = null;
    } else {
      NodeMahasiswa12 temp = head;
      while (temp.next != tail) {
        temp = temp.next;
      }
      tail.next = null;
      tail = temp;
    }
  }

  // method remove
  public void remove(String key) {
    if (isEmpty()) {
      System.out.println("Linked list kosong, tidak dapat dihapus!");
    } else {
      NodeMahasiswa12 temp = head;
      while (temp != null) {
        if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
          this.removeFirst();
          break;
        } else if (temp.data.nama.equalsIgnoreCase(key)) {
          temp.next = temp.next.next;
          if (temp.next == null) {
            tail = temp;
          }
          break;
        }
        temp = temp.next;
      }
    }
  }

  // method removeAt
  public void removeAt(int index) {
    if (index == 0) {
      removeFirst();
    }else {
      NodeMahasiswa12 temp = head;
      for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
      }
      temp.next = temp.next.next;
      if (temp.next == null) {
        tail = temp;
      }
    }
  }  
}
