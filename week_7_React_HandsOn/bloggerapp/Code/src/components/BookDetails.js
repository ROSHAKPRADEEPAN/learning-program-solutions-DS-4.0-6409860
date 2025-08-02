import React from 'react';

const BookDetails = ({ books }) => {
  if (!books || books.length === 0) {
    return <p>No books available.</p>;
  }

  return (
    <div className="st2">
      <h1>Book Details</h1>
      <ul>
        {books.map((book) => {
          return (
            <div key={book.id}>
              <h3>{book.bname}</h3>
              <h4>{book.price}</h4>
            </div>
          );
        })}
      </ul>
    </div>
  );
};

export default BookDetails;
