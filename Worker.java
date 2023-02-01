public class Worker {
	private OnTaskDoneListener callback;
	private OnTaskErrorListener<Integer> errorCallback;


	public Worker(OnTaskDoneListener callback, OnTaskErrorListener<Integer> errorCallback) {
    	this.callback = callback;
		this.errorCallback = errorCallback;
	}
	
	public void start() {
		for (int i = 0; i < 100; i++) {
			if (i == 33 ) {
				try {
					errorCallback.onError();
				} catch (Exception e ) {
					System.out.println("Task returned Error: " + e);
				}
			} else {
		       	callback.onDone("Task " + i + " is done");
			}
    	}
	}
}
