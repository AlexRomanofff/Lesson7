package library;

public class LibLancher {

	public static void main(String[] args) {

		Library l = new Library();
//        l.findByAuthor("Isaak Asimov");
//        l.findByTitle("Harry Potter");
		l.findByGenre(Genre.FANTASY);
		l.findByGenre(Genre.FANTASY);
		l.findByGenre(Genre.DETECTIVE);

      }
}