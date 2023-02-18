import { Component, OnInit } from '@angular/core';
import { Employee } from 'model/employee';
import { EmployeeService } from 'service/employee.service';

@Component({
  selector: 'app-list-employee',
  templateUrl: './list-employee.component.html',
  styleUrls: ['./list-employee.component.css']
})
export class ListEmployeeComponent implements OnInit{
  employees:any;

  constructor(private employeeService: EmployeeService) {
  }

  ngOnInit() {
    this. employeeService.findAll().subscribe(data => {
      this.employees = data;
    });
  }

}
