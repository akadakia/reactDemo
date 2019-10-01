import React from 'react';
import logo from './logo.svg';
import './App.css';
import Employees from './employee.js';
import Form from './MyForm.js';
function App() {
  return (
  <div className="bg">
    <div className="App">
      <header className="App-header">
       <font color="red"><h1>Employee List</h1></font>
        <Employees />
        <h2>--Add/Update Employee--</h2>
        <Form />
      </header>
    </div>
    </div>
  );
}
export default App;