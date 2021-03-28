class Counter {

    int current;

//    public static void main(String[] args) {
//        Counter c = new Counter();
//      //  c.current = 3;
//        System.out.println(c.inc());
//        System.out.println(c.getCurrent());
//    }

    public int inc() {
        this.current = current + 1;
        return this.current;
    }

    public int getCurrent() {
        return this.current;
    }
}
