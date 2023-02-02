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
				errorCallback.onError("Task " + i + " is error");
			} else {
		       	callback.onDone("Task " + i + " is done");
			}
    	}
	}
}
