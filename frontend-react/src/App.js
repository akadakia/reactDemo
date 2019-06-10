import React from 'react';
import logo from './logo.svg';
import './App.css';
import Employees from './employee.js';
function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1>Add New Employee</h1>
        <form>
          <label>
            Name:
            <input type="text" name="name" />
          </label>
          <input type="submit" value="Submit" />
        </form>
        <h4>Note that the default width of a text field is 20 characters.</h4>

       <h1>Employee List</h1>
        <Employees />
      </header>
    </div>
  );
}
export default App;
