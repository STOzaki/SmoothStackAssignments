SELECT branchName, noOfCopies FROM tbl_book AS b
	JOIN tbl_book_copies AS bc ON b.bookId = bc.bookId
	JOIN tbl_library_branch AS l ON bc.branchId = l.branchId
    WHERE b.title = 'The Thirteenth Child';