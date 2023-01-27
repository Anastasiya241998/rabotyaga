
public class Worker implements OnTaskDoneListener {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }


    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            callback.onDone("Task " + i + " is done");

        }
    }

    public void error() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                System.out.println("ERROR");
            } else {
                errorCallback.onError("Task " + i + " is done");
            }
        }

    }

    @Override
    public void onDone(String result) {

    }
}
