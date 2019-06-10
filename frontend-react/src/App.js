import React from 'react';
import logo from './logo.svg';
import './App.css';
import Employees from './employee.js';
function App() {
  return (
  <div className="bg">
    <div className="App">
      <header className="App-header">
       <font color="red"><h1>Employee List</h1></font>
        <Employees />

        <h2>Add New Employee</h2>
                <form>
                  <label>
                    Name:
                    <input type="text" name="name" />
                  </label>
                  <input type="submit" value="Submit" />
                </form>
                <h5>Note that the default width of a text field is 20 characters.</h5>

      </header>
    </div>
    </div>
  );
}

export default App;
