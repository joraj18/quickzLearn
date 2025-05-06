import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { Toaster } from 'react-hot-toast';
import Home from './pages/Home';
import TopicDetail from './pages/TopicDetail';
import NewTopic from './pages/NewTopic';
import './index.css';

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <BrowserRouter>
    <Toaster position="top-center" toastOptions={{ duration: 3000 }} />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/topic/:id" element={<TopicDetail />} />
        <Route path="/new-topic" element={<NewTopic />}/>
      </Routes>
    </BrowserRouter>
  </React.StrictMode>
);