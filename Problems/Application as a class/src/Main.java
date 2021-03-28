class Application {

    static String name;

    public static void run(String[] args) {
        System.out.println(name);
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}