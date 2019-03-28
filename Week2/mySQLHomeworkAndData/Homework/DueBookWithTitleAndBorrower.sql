SELECT b.title, br.name, br.address from tbl_book_loans AS bl
	JOIN tbl_book AS b ON bl.bookId = b.bookId
	JOIN tbl_library_branch AS lb ON bl.branchId = lb.branchId
    JOIN tbl_borrower AS br ON br.cardNo = bl.cardNo
	WHERE lb.branchName = "Gates Public Library" AND
	dueDate = CURDATE();