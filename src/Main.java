public class Main {
    public static void main(String[] args) {

        Book book = new Book("Граф Монте-Кристо", "А.Дюма", 1844);
        System.out.println("book.getBookName = " + book.getBookName());
        System.out.println("book.getAuthorName = " + book.getAuthor());
        System.out.println("book.getPublicYear = " + book.getPublicYear());

        Book book1 = new Book("Ведьмак", "А. Сапковский", 1992);
        System.out.println("book1.bookName = " + book1.getBookName());
        System.out.println("book1.authorName = " + book1.getAuthor());
        System.out.println("book1.publicYear = " + book1.getPublicYear());

        Author author = new Author("Александр", "Дюма");
        System.out.println("author.firsName = " + author.firsName);
        System.out.println("author.lastName = " + author.lastName);

        Author author1 = new Author("Анджей", "Сапковский");
        System.out.println("author1.firsName = " + author1.firsName);
        System.out.println("author1.lastName = " + author1.lastName);


        book.setPublicYear(1846);
        System.out.println("book.getPublicYear() = " + book.getPublicYear());

    }
}