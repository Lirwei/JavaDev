package per.study.thread.design.chapter18;

public class MakeClientThread extends Thread {

    private final ActiveObject activeObject;

    private final char fillChar;

    public MakeClientThread(String name, ActiveObject activeObject) {
        super(name);
        this.activeObject = activeObject;
        this.fillChar = name.charAt(0);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; true; i++) {
                Result result = activeObject.makeString(i + 1, fillChar);
                Thread.sleep(20);
                String resultValue = (String) result.getResultValue();
                System.out.println(Thread.currentThread().getName() + ": value -> " + resultValue);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
