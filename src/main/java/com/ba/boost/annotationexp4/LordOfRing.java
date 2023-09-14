package com.ba.boost.annotationexp4;

@AuthorAnnotation(
        authorName = "J.R.R Tolkien",
        dateOfBirth = "03/01/1892"
)
public class LordOfRing {

    private String bookName;
    private int pageOfName;
    private String subjectOfTheBooks;

    public LordOfRing(String bookName, int pageOfName, String subjectOfTheBooks) {
        this.bookName = bookName;
        this.pageOfName = pageOfName;
        this.subjectOfTheBooks = subjectOfTheBooks;
    }

    public LordOfRing() {
    }
}
