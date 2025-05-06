import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import toast from 'react-hot-toast';

const NewTopic = () => {
  const [title, setTitle] = useState('');
  const [loading, setLoading] = useState(false);
  const navigate = useNavigate();

  const handleSubmit = async (e) => {
    e.preventDefault();
    setLoading(true);

    try {
      const response = await fetch('http://localhost:8080/addtopic', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify({ title }),
      });

      if (response.ok) {
        toast.success('Topic created successfully!');
        setTimeout(() => navigate('/'), 1500);
      } else {
        toast.error('Failed to create topic.');
      }
    } catch (err) {
      console.error('Error:', err);
      toast.error('Server error. Please try again.');
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="min-h-screen flex items-center justify-center bg-gray-100 px-4">
      <div className="bg-white shadow-lg rounded-2xl p-6 w-full max-w-md">
        <h1 className="text-2xl font-bold mb-4 text-center text-blue-600">Create a New Topic</h1>

        <form onSubmit={handleSubmit} className="flex flex-col gap-4">
          <input
            type="text"
            placeholder="Enter topic name"
            value={title}
            onChange={(e) => setTitle(e.target.value)}
            className="border border-gray-300 focus:border-blue-500 focus:ring-blue-200 focus:ring-2 transition outline-none rounded-md p-3 text-base"
            required
          />

          <button
            type="submit"
            disabled={loading}
            className={`bg-blue-500 text-white py-2 rounded-md font-semibold text-lg hover:bg-blue-600 transition ${
              loading ? 'opacity-50 cursor-not-allowed' : ''
            }`}
          >
            {loading ? 'Submitting...' : 'Submit'}
          </button>
        </form>
      </div>
    </div>
  );
};

export default NewTopic;
