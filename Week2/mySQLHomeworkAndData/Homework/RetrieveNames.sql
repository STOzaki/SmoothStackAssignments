SELECT name FROM tbl_borrower AS b
	LEFT JOIN tbl_book_loans AS bl ON b.cardNo = bl.cardNo
    WHERE bl.bookId IS NULL;