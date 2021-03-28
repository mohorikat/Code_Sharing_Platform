class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        int hour;
        int min;
        hour = this.hours;
        min = this.minutes;
        if (min == 59) {
            if (hour == 12) {
                this.hours = 1;
            }else {
                this.hours = hour + 1;
            }

            this.minutes = 00;
        } else {
            this.minutes = min + 1;
        }
    }
//        public static void main(String[] args) {
//            Clock clock = new Clock();
//            clock.hours = 11;
//            clock.minutes = 59;
//            clock.next();
//        System.out.println(clock.hours + ":" + clock.minutes);
//        }
}
