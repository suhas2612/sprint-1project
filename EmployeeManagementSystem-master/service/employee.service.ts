import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from 'model/employee';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private getUrl:string;
  private addUrl:string;

  constructor(private http:HttpClient) { 

    this.getUrl="http://localhost:8080/getemployees";
    this.addUrl="http://localhost:8080/addemployees";

  }
public findAll():Observable<Employee[]>
{
  return this.http.get<Employee[]>(this.getUrl);

}
public save(employee:Employee)
{
 return this.http.post<Employee>(this.addUrl,employee);
}

}
