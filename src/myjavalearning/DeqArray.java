package myjavalearning;


public class DeqArray<E> implements DequeArr<E> {
	private int tos;
	private E[] deque;
	
	public DeqArray(){
		this(5);
	}
	
	@SuppressWarnings("unchecked")
	public DeqArray (int size){
		deque = ((E[]) new Object[size]);
	}
	
	
	
	@Override
	public void pushBack(E elem) {
		deque[tos++] = elem;
	}

	@Override
	public E popBack() {
		return tos>0 ? deque[--tos]: null;
	}

	@Override
	public void pushFront(E elem) {
		for(int i=0; i<deque.length; i++) {
			
		}
		deque[0] = elem;
		
	}

	@Override
	public E popFront() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
