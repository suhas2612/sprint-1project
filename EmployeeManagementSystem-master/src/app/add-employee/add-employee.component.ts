import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from 'model/employee';
import { EmployeeService } from 'service/employee.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent {

 
  employee: Employee;
 
  constructor(private router:Router,private route:ActivatedRoute,private employeeService:EmployeeService)
  {
    this.employee=new Employee();
  }
  onSubmit()
  {
    this.employeeService['save'](this.employee).subscribe((result: any)=>this.employee=result);
  }

 /* gotoListEmployee()
  {
    this.router.navigate(['/employees']);

  }*/

  


}
