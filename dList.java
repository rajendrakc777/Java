package hwN;

public class dList<T> {
	private Node head;
	private Node tail;
	private int size; 
	//default constructor
	public dList() {
		head = tail = null;
		size = 0;
	}
	//getsize();
	public int getSize() {
		return size;
	}
	public boolean isEmpty() {
		return (size == 0);
	}
	//design insert(T e) that will insert in the front
	public void insert(T e) {
		//create a new node 
		Node<T> temp = new Node<T> (e);
		if(isEmpty()) {
			head = tail = temp;
			size++;
			return;
		}
		temp.setNext(head);
		head.setPrevious(temp);
		head = temp;
		size++;
	}
	//insertBack(T e) that will insert in the tail
	public void insertBack(T e) {
		Node<T> temp = new Node<T> (e);
		if(isEmpty()) {
			head = tail = temp;
			size++;
			return;
		}
		temp.setPrevious(tail);
		tail.setNext(temp);
		tail = temp;
		size++;
	}
	// T remove()  that will remove the tail and return the data
	public T remove() {
		if (isEmpty()) {
			return null;
		}
		T reVal = (T)tail.Data();
		if(size == 1) {
			head = tail = null;
			size = 0;
			return reVal;
		}
		tail.Previous().setNext(null);
		tail = tail.Previous();
		size--;
		return reVal;

	}
	//T removeFront() that will remove the Node at the head and return the data 
	public T removeFront(){
		Node<T> temp= new Node<T>();
		if(isEmpty()){
			return null;
	}
	T reVal = (T)head.Data();
	if(size==1){
		head=tail=null;
		size=0;
		return reVal;
	}
	head=head.Next();
	size--;
	return reVal;
	}
	
	//T At(int index) returns the data at element at index i 0 is front size-1 is tail.
	public T At(int index){
		int var =0;
		Node<T> temp=head;
		T e;
		while(temp!=null){
			e=(T)temp.Data();
			if(var==index){
				return temp.Data();
				
			}
			e=(T)temp.Next().Data();
			var++;
		}
		return null;
	}
	public void print(){
		Node<T>temp=head;
		while(temp!=null){
			System.out.println(temp.toString());
			temp=temp.Next();
			
		}
		
	
	}
	
}
		
	
