import React, { useState } from "react";
import "./App.css";

function App() {
  const [count, setCount] = useState(0);
  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("");

  // Increment function with two actions
  const handleIncrement = () => {
    incrementCount();
    sayHello();
  };

  const incrementCount = () => {
    setCount(count + 1);
  };

  const decrementCount = () => {
    setCount(count - 1);
  };

  const sayHello = () => {
    alert("Hello! Member1");
  };

  const sayWelcome = (message) => {
    alert(message);
  };

  const handleClick = (e) => {
    alert("I was clicked");
  };

  const handleAmountChange = (e) => {
    setAmount(e.target.value);
  };

  const handleCurrencyChange = (e) => {
    setCurrency(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    let result = 0;

    if (currency.toLowerCase() === "euro") {
      result = parseFloat(amount) * 80;
      alert(`Converting to Euro Amount is ${result}`);
    } else {
      alert("Unsupported currency");
    }
  };

  return (
    <div className="App">
      <div className="button-stack">
          <h2>{count}</h2>
      <button onClick={handleIncrement}>Increment</button>
      <button onClick={decrementCount}>Decrement</button>
      <button onClick={() => sayWelcome("Welcome Member!")}>Say welcome</button>
      <button onClick={handleClick}>Click on me</button>
      </div>    

      <br />
      <br />      
      <h1 style={{ color: "green" }}>Currency Convertor!!!</h1>
      <form onSubmit={handleSubmit} name="currencyForm">
  <div className="form-row">
    <label htmlFor="amount">Amount:</label>
    <input
      type="text"
      id="amount"
      value={amount}
      onChange={handleAmountChange}
    />
  </div>

  <div className="form-row">
    <label htmlFor="currency">Currency:</label>
    <textarea
      id="currency"
      value={currency}
      onChange={handleCurrencyChange}
    />
  </div>

  <button type="submit">Submit</button>
</form>

     
      
    </div>
  );
}

export default App;
