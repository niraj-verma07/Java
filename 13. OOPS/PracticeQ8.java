//What will be the output of this code?

class Book {
    int price;
    static int count;

    public Book(int price) {
        this.price = price;
        count++;
    }
}

public class PracticeQ8 {
    public static void main(String[] args) {
        System.out.println(Book.count);
        Book b1 = new Book(150);
        Book b2 = new Book(250);
        System.out.println(Book.count);
    }
}

// option:
// a. Error
// b. 0 2
// c. 1 2
// d. 2 2

// Ans :
// b. 0 2

// count = 0 1 2