SELECT name, address, COUNT(bookId) AS books_loaned FROM tbl_borrower AS b
	JOIN tbl_book_loans AS br ON b.cardNo = br.cardNo
    GROUP BY name, address
    HAVING books_loaned > 5;