import { useEffect, useState } from 'react';
import { useNavigate } from 'react-router-dom';

const Home = () => {
  const [topics, setTopics] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    const fetchTopics = async () => {
      try {
        const response = await fetch('https:localhost:8080/topics');
        const data = await response.json();
        setTopics(data);
      } catch (error) {
        console.error('Error fetching topics:', error);
      }
    };

    fetchTopics();
  }, []);

  return (
    <div className="p-4 flex flex-col items-center">
    {/* Header with + Button */}
    <div className="flex items-center justify-between w-full max-w-sm mb-6">
      <h1 className="text-2xl font-bold">Topics</h1>
      <button
        onClick={() => navigate('/new-topic')}
         className="bg-green-500 text-white w-10 h-10 rounded-md text-2xl font-bold flex items-center justify-center hover:bg-green-600 transition"
      >
        +
      </button>
    </div>
         {/* Topics List */}
      <div className="flex flex-col gap-4 w-full max-w-sm">
        {topics.map((topic) => (
          <div
            key={topic.topicId}
            className="flex justify-between items-center bg-cyan-300 text-black px-4 py-2 rounded-lg"
          >
            <button
              onClick={() => navigate(`/topic/${topic.topicId}`)}
              className="text-left w-full hover:bg-sky-100 transition rounded-lg focus:outline-none"
            >
              {topic.topicTitle}
            </button>
            <div className="ml-4 text-sm text-white whitespace-nowrap pointer-events-none select-none">
              {topic.daysLeft} days left
            </div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default Home;
