public class Main {
	public static void main(String[] args) {
		
		OnTaskDoneListener listener = System.out::println;
		OnTaskErrorListener<Integer> errorListener = () -> 1 / 0;
		
		Worker worker = new Worker(listener, errorListener);
		
		worker.start();
	}
}
