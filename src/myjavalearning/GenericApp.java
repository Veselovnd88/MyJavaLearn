package myjavalearning;

public class GenericApp {
	private interface Stack<E>{
		void push(E element);
		E pop();
	}
	private static class StackArray<E> implements Stack<E>{
		int tos; //текущий размер
		E[] stack; //сам стек
		
		public StackArray() {
			this(10);
		}
		@SuppressWarnings("unchecked")
		public StackArray(int max) {
			tos = 0;
			stack = ((E[]) new Object[max]); //стек это массив от объекта размером макс - приведение к E
		}
		@Override
		public void push(E elem) {
			stack[tos++]=elem;// добавляется на позицию tosа потом приьавляется +1
			
		}
		public E pop() {
			return tos>0 ? stack[--tos]:null;
		}
	}
	
	public static void main(String[] args) {
		Stack<Integer> st = new StackArray<>();//создали объект стак эррэй типа стек (интерфейс)
		Stack <String> str = new StackArray<>(5);
		
		if (st.getClass()==str.getClass()) {
			System.out.printf("Classes are both %s%n", st.getClass());
		}
		
		
	}
	
}
