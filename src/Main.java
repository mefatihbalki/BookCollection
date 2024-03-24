import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //Alfabetik sıralama için oluştuırulan nesnelerimiz
        TreeSet<Book> books = new TreeSet<>();

        books.add(new Book("Harry Potter ve Felsefe Taşı",450,"J.K. Rowling",2001));
        books.add(new Book("Yüzüklerin Efendisi ve İki Kule",550,"J.R.R Tolkien",1994));

        //Üç cisim Proplemi Türkçe karakter durumu için Uç şeklinde yazılmıştır.
        books.add(new Book("Uç Cisim Problemi",880,"Liu Cixin",2008));
        books.add(new Book("Dune",667,"Frank Herbert",1965));
        books.add(new Book("Otomatik Piyano",376,"Kurt Vonnegut Jr.",1952));


        for (Book b : books){
            System.out.println(b.getBookName());
        }

        //Sayfa sayısına göre küçükten büyüğe sıralama komutu
        TreeSet<Book> booksByPageNumber = new TreeSet<>(new Comparator<Book>() {

            @Override //Metodu bu sefer main classına override ediyoyoruz
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }

        });
        //Kitapları tekrar ekliyoruz
        booksByPageNumber.addAll(books);

        System.out.println("******************************************");
        for (Book b : booksByPageNumber){
            System.out.println(b.getBookName() + " - " + b.getPageNumber() + " sayfa");        }
    }
}