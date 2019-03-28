SELECT COUNT(bookId) AS num_books_loaned, branchName FROM tbl_library_branch AS lb
	JOIN tbl_book_loans AS bl ON lb.branchId = bl.branchId
    GROUP BY branchName;