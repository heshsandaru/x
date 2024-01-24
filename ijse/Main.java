class DB {
    int a;
    
    DB(int a) {
        this.a = a;
    }
    
    long[] data = new long[100000];
    
    @Override
    public void finalize() {
        System.out.println("deleted: " + a);
    }
}

class Main {
    public static void myMethod() {
        int x = 10;
        DB db1 = new DB(100);
    }
    
    public static void main(String[] args) {
        System.out.println("start main");
                
        myMethod();
        myMethod();
        myMethod();
        
        System.gc();
        
        try {Thread.sleep(2000);} catch (InterruptedException ex) {}
        
        System.out.println("end main");
    }
}

