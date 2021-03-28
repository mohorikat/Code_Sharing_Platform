public class Hotel {
    String name;
    String address;
    int rating;
public static void main(String[] args) {
    Hotel h1 = new Hotel();
    Hotel h2 = new Hotel();
    Hotel h3 = h2;

    h2.rating = 9;
    h3.rating = 8;
    h1.rating = 7;
    System.out.println(h2.rating);
}

}
