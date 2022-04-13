package per.study.juc.thread.chapter6;

public class ThreadCloseForce {

    public static void main(String[] args) {
        ThreadService service = new ThreadService();
        long start = System.currentTimeMillis();
        service.execute(() -> {
            // load  a very heavy resource.
            while (true) {

            }
            /*try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        });
        service.shutdown(10000);
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "s");
    }

}
