SELECT b.title, bc.noOfCopies FROM tbl_book AS b
	JOIN tbl_author AS a ON b.authId = a.authorId
    JOIN tbl_book_copies AS bc ON bc.bookId = b.bookId
    JOIN tbl_library_branch AS lb ON lb.branchId = bc.branchId
    WHERE a.authorName = "Patricia Wrede" AND
    lb.branchName = "The Virtual Library of Virginia";
