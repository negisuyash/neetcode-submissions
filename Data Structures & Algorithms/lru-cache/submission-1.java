class Node{
    int key;
    int val;
    Node prev;
    Node next;

    public Node(){}

    public Node(int key, int val){
        this.key = key;
        this.val = val;
    }
}

class LRUCache {

    int cap;
    Map<Integer, Node> map;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        head = new Node();
        tail = new Node();
        map = new HashMap<>();
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            removeNode(node);
            addFront(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.val = value;
            removeNode(node);
            addFront(node);
            return;
        }
        if(cap == map.size()){
            Node node = tail.prev;
            removeNode(node);
            map.remove(node.key);
        }
        Node newNode = new Node(key, value);
        addFront(newNode);
        map.put(key, newNode);
    }

    public void removeNode(Node node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    public void addFront(Node node){
        Node next = head.next;
        head.next = node;
        node.prev = head;
        node.next = next;
        next.prev = node;
    }
}
