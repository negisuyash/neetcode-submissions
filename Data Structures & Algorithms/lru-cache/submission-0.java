class Node{
    int key;
    int val;
    Node next;
    Node prev;
    public Node(int key, int val){
        this.key = key;
        this.val = val;
    }

    public Node(){};
}

class LRUCache {
    Map<Integer, Node> map;
    Node head;
    Node tail;
    int cap;

    public LRUCache(int capacity) {
        this.cap = capacity;
        head = new Node();
        tail = new Node();
        map = new HashMap<>();

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        Node node = map.getOrDefault(key, null);
        if(node == null)    return -1;
        removeNode(node);
        addToFront(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.val = value;
            removeNode(node);
            addToFront(node);
            return;
        }

        if(map.size() == cap){
            map.remove(tail.prev.key);
            removeNode(tail.prev);
        }

        Node newNode = new Node(key, value);
        addToFront(newNode);
        map.put(key, newNode);
    }

    private void addToFront(Node node){
        Node next = head.next;
        head.next = node;
        node.prev = head;
        node.next = next;
        next.prev = node;
    }

    private void removeNode(Node node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
}
