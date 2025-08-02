import React, { useState } from 'react';
import './App.css';

function LoginButton(props) {
  return (
    <button onClick={props.onClick}>
      Login
    </button>
  );
}

function LogoutButton(props) {
  return (
    <button onClick={props.onClick}>
      Logout
    </button>
  );
}

function UserGreeting() {
  return <h1>Welcome back</h1>;
}

function GuestGreeting() {
  return <h1>Please sign up.</h1>;
}

function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;
  return isLoggedIn ? <UserGreeting /> : <GuestGreeting />;
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => setIsLoggedIn(true);
  const handleLogoutClick = () => setIsLoggedIn(false);

  const button = isLoggedIn
    ? <LogoutButton onClick={handleLogoutClick} />
    : <LoginButton onClick={handleLoginClick} />;

  return (
    <div className="container">
      <Greeting isLoggedIn={isLoggedIn} />
      {button}
    </div>
  );
}

export default App;
