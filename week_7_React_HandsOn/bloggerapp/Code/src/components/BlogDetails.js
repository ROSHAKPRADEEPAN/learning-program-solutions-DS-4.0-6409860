import React from 'react';

const BlogDetails = ({ blogs }) => {
  return (
    <div className="v1">
      <h1>Blog Details</h1>
      {blogs.length === 0 ? (
        <p>No blogs found.</p>
      ) : (
        blogs.map((blog, index) => (
          <div key={index}>
            <h2>{blog.title}</h2>
            <h4><strong>{blog.author}</strong></h4>
            <p>{blog.content}</p>
          </div>
        ))
      )}
    </div>
  );
};

export default BlogDetails;
