package cn.com.jd.test.volatiletest;  
      
    import java.util.concurrent.CountDownLatch;  
    import java.util.concurrent.ExecutorService;  
    import java.util.concurrent.Executors;  
      
     
    public class ThreadPoolExecute {  
      
        private static ExecutorService threadPool = Executors.newFixedThreadPool(5);  
      
        private static CountDownLatch counter = new CountDownLatch(1);  
      
        public static void main(String[] args) {  
      
            try {  
                Thread A = new Thread(new Runnable() {  
                    @Override  
                    public void run() {  
                        System.out.println("Âß¼­A");  
                        counter.countDown();  
                    }  
                });  
                A.start();  
      
                for (int i=0;i<5;i++){  
                    threadPool.execute(new Runner(12));  
                }  
            } finally {  
                threadPool.shutdown();  
            }  
      
        }  
      
      
        static class Runner implements Runnable{  
      
            private int param;  
      
            public Runner(int param) {  
                this.param = param;  
            }  
      
            @Override  
            public void run() {  
                try {  
                    counter.await();  
      
                    //ÅÜÄãµÄÏß³Ì³ØµÄÂß¼­  
                    System.out.println("Âß¼­B"+param);  
      
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
      
            }  
        }  
      
    }  