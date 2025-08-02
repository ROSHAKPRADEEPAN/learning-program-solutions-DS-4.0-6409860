import React from 'react';
import './App.css';
import BookDetails from './components/BookDetails';
import CourseDetails from './components/CourseDetails';
import BlogDetails from './components/BlogDetails';

import { books } from './data/books';
import { courses } from './data/courses';

function App() {
  const blogs = [
    {
      title: 'React Learning',
      author: 'Stephen Biz',
      content: 'Welcome to learning React!',
    },
    {
      title: 'Installation',
      author: 'Schwezdenier',
      content: 'You can install React from npm.',
    },
  ];

  return (
    <div className="container">
      <CourseDetails courses={courses} />
      <BookDetails books={books} />
      <BlogDetails blogs={blogs} />
    </div>
  );
}

export default App;
