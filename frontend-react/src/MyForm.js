 import React, { Component } from 'react';
 import axios from 'axios';
 import './App.css';

    export default class MyForm extends Component {
      constructor() {
        super();
        this.state = {
          id: '',
          name: '',
          salary: '',
          role: ''
        };
      }

      onChange = (e) => {
        /*
          Because we named the inputs to match their
          corresponding values in state, it's
          super easy to update the state
        */
        this.setState({ [e.target.name]: e.target.value });
      }

      onSubmit = (e) => {
        e.preventDefault();
        // get our form data out of state
        console.log("Submit button successfully pressed and sent data");
        document.write("New/Updated Employee Completed Successfully! PLEASE REFRESH PAGE TO SEE UPDATED TABLE");
        const { id, name, salary, role } = this.state;
        axios.post('http://localhost:9876/newEntry', { id, name, salary, role })
          .then((result) => {
            //access the results here....
          });
      }

      render() {
        const { id, name, salary, role } = this.state;
        return (
        <div className="App">
          <form onSubmit={this.onSubmit}>
          <label>
            Id:
            <input
              type="text"
              name="id"
              value={id}
              onChange={this.onChange}
            />
             </label>
             <label>
             Name:
            <input
              type="text"
              name="Name"
              value={name}
              onChange={this.onChange}
            />
            </label>
            <label>
            Salary:
            <input
              type="text"
              name="Salary"
              value={salary}
              onChange={this.onChange}
            />
            </label>
            <label>
            Role:
            <input
              name="Role"
              type="text"
              value={role}
              onChange={this.onChange}
            />
            </label>
            <button type="submit">Submit For Approval</button>
          </form>
          </div>
        );
      }
    }