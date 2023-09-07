package org.example.Lesson6.Task1;

public class BookGenere implements Genre {

    private String genreOfBook;

    public BookGenere(String genreOfBook) {
        this.genreOfBook = genreOfBook;
    }

    /**
     * @return
     */
    @Override
    public String takeGenre() {
        return genreOfBook;
    }

    @Override
    public String toString() {
        return "BookGenere {" +
                "genreOfBook =' " + genreOfBook + '\'' +
                '}';
    }
}
