
public class Worker implements OnTaskDoneListener {
    private OnTaskDoneListener callback;
    


    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                System.out.println("ERROR");
            } else {
            callback.onDone("Task " + i + " is done");

            }
        }
    }

    @Override
    public void onDone(String result) {

    }
}

