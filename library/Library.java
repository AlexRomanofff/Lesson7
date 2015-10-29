package library;



public class Library {
	
	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	private Books [][] bookByAuthor;
	private Books [][] bookByTitle;
	private Books [][] bookByGenre;
	private int countOfCallByGenre [] = new int [6];
	
	public Library() {	
	
	bookByAuthor = new Books [26][];
    fillDictionary(bookByAuthor);
    
	bookByTitle = new Books [26][];
	fillDictionary(bookByTitle);
	
	bookByGenre = new Books [6][];
	fillDictionary(bookByGenre);
	
	createBook();
	
	}
	public void createBook() {
		
		Books b = new Books();
		
		b.setAuthor("Kristin Burnett");
		b.setTitle("The spark");
		b.setGenre(Genre.FANTASY);
		addToLibrary(b);
	
		
		b=new Books();
		b.setAuthor("Elizabeth Smart");
		b.setTitle("My story");
		b.setGenre(Genre.FANTASY);
		addToLibrary(b);
		
		b=new Books();
		b.setAuthor("Edgar Alan Poe");
		b.setTitle("The murders in the Rui morgue");
		b.setGenre(Genre.DETECTIVE);
		addToLibrary(b);
		
		b=new Books();
		b.setAuthor("Isaak Asimov");
		b.setTitle("Rest of the robots");
		b.setGenre(Genre.FANTASY);
		addToLibrary(b);
		
		b=new Books();
		b.setAuthor("Isaak Asimov");
		b.setTitle("Foundation and Empire");
		b.setGenre(Genre.FANTASY);
		addToLibrary(b);
		
		b=new Books();
		b.setAuthor("George Martin");
		b.setTitle("The ice dragon");
		b.setGenre(Genre.FANTASY);
		addToLibrary(b);
		
		b=new Books();
		b.setAuthor("Joan Rouling");
		b.setTitle("Harry Potter");
		b.setGenre(Genre.FANTASY);
		addToLibrary(b);

		b=new Books();
		b.setAuthor("Arthur Conan Doyle");
		b.setTitle("Story of Sherlock Holmes");
		b.setGenre(Genre.DETECTIVE);
		addToLibrary(b);

		b=new Books();
		b.setAuthor("Arthur Conan Doyle");
		b.setTitle("The Great shadow and other Napaleonic Tales");
		b.setGenre(Genre.DETECTIVE);
		addToLibrary(b);


					
	}
	
	public void addToLibrary (Books book) {
				
		int position = alphabet.indexOf(book.getAuthor().charAt(0));
		 
		for (int i = 0; i<bookByAuthor[position].length; i++) {
			if (bookByAuthor[position][i] == null){
				bookByAuthor [position][i] = book;
				break;
				}
			}
		position = alphabet.indexOf(book.getTitle().charAt(0));
		for (int i = 0; i<bookByTitle[position].length; i++) {
			if (bookByTitle[position][i] == null){
				bookByTitle [position][i] = book;

				break;
				}
			}
		position = book.getGenre().getID();
		for (int i = 0; i<bookByGenre[position].length; i++) {
			if (bookByGenre[position][i] == null){
				bookByGenre [position][i] = book;
				break;
				}
			}
	}
	
    private Books[]  findArrayByAuthor (String author) {		
		int position = alphabet.indexOf(author.charAt(0));
		return bookByAuthor[position];
		
	}
	
    public void findByAuthor (String author) {
    	
    	Books []booksByLetter = findArrayByAuthor(author);
    	int countOfBooks = 0;
    	
    	for (int i=0; i<booksByLetter.length; i++) {
    		Books b = booksByLetter[i];
    		if (b !=null) {
    			if (b.getAuthor().equals(author)) {
    				System.out.println(b.getAuthor()+" \""+b.getTitle()+"\"");
					countOfBooks++;
    			}
    		}
    	}
    	if (countOfBooks == 0) {
			System.out.println("The book of this author didn't find.");
		}
    }
    
    private Books[]  findArrayByTitle (String title) {		
		int position = alphabet.indexOf(title.charAt(0));
		return bookByTitle[position];
		
	}
	
    public void findByTitle (String title) {
    	
    	Books []booksByLetter = findArrayByTitle(title);
    	int countOfBooks = 0;
    	
		for (int i = 0; i < booksByLetter.length; i++) {
			Books b = booksByLetter[i];
			if (b != null) {
				if (b.getTitle().equals(title)) {
					System.out.println(b.getAuthor() + " \"" + b.getTitle()
							+ "\"");
					countOfBooks++;
				}
			}
		}
		if (countOfBooks == 0) {
			System.out.println("This book didn't find.");
		}
	}

    
	private void fillDictionary(Books[][] books) {
		for (int i = 0; i < books.length; i++) {
			books[i] = new Books[100];
		}
	}
	
	private Books[] chooseBooksByGenre(Books [] book, int count) {
		Books[] b = new Books[5];		
		for (int i = count*5, k = 0; i < book.length && k<5; i++, k++) {
			if (book[i] != null) {
				b[k] = book[i];
			}
		}
		return b;
	}
	
	public void findByGenre(Genre genre) {

		Books[] b = bookByGenre[genre.getID()];
		Books[] b1 = chooseBooksByGenre(b, countOfCallByGenre[genre.getID()]);

		for (Books book : b1) {
			if (book != null) {
				System.out.println(book.getAuthor() + " \"" + book.getTitle()
						+ "\"");
			}
		}
		countOfCallByGenre[genre.getID()]++;
	}
	


}
