import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

class Car {

    int yearModel;
    String make;
    int speed;

    public void accelerate() {
        this.speed = this.speed + 5;
    }

    public void brake() {

        if (this.speed > 5) {
            this.speed = this.speed - 5;
        } else {
            this.speed = 0;
        }
    }



        public static void main(String[] args) {

            Car jetta;
            jetta = new Car();
            jetta.speed = 3;
        System.out.println(jetta.speed);
        //    jetta.accelerate();
        System.out.println(jetta.speed);
        jetta.brake();
        System.out.println(jetta.speed);
        }



    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    @interface FieldDescription {
        String text() default "";
    }

}