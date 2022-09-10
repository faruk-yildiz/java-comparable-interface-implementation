import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books=new TreeSet<>();
        books.add(new Book("A",195,"Faruk","1995"));
        books.add(new Book("B",350,"Ömer","2013"));
        books.add(new Book("C",286,"Yıldız","2005"));
        books.add(new Book("D",500,"Patika","2018"));


        for (Book book:books){
            System.out.println(book.getName()+" "+book.getPage()+" "+book.getAuthor()+" "+book.getReleaseDate());
        }

        TreeSet<Book> newBooks=new TreeSet<>(new Comparator<Book>(){

            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPage()-o2.getPage();
            }
        });
        System.out.println("########################################################");
        newBooks.add(new Book("A",195,"Faruk","1995"));
        newBooks.add(new Book("B",350,"Ömer","2013"));
        newBooks.add(new Book("C",286,"Yıldız","2005"));
        newBooks.add(new Book("D",500,"Patika","2018"));

        for (Book book:newBooks){
            System.out.println(book.getName()+" "+book.getPage()+" "+book.getAuthor()+" "+book.getReleaseDate());
        }

    }
}
