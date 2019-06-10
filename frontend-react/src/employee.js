import React from 'react';

import axios from 'axios';

export default class EmployeeList extends React.Component {
 state = {
   employees: []
 }

   componentDidMount() {
      axios.get(`http://localhost:9876/skysthelimit`)
        .then(res => {
          const employees = res.data;
           console.log(employees);
          this.setState({ employees });
        })
    }

    render() {
        return (
          <table id="customers">
              <thead>
                <tr>
                  <th>Name</th>
                  <th>Salary</th>
                  <th>Id</th>
                  <th>Role</th>
                </tr>
              </thead>
              <tbody>{ this.state.employees.map(employee => <tr><td>{employee.name}</td><td>{employee.salary}</td><td>{employee.role}</td><td>{employee.id}</td></tr>)}</tbody>
            </table>
        )
      }
}
