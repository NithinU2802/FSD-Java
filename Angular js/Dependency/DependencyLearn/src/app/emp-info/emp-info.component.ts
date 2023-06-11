import { Component, OnInit } from '@angular/core';
import { RecordsService } from '../records.service';

@Component({
  selector: 'app-emp-info',
  templateUrl: './emp-info.component.html',
  styleUrls: ['./emp-info.component.css'],
  providers: [RecordsService]
})
export class EmpInfoComponent implements OnInit{

  info1: String[]=[];
  info2: String[]=[];
  info3: String[]=[];

  getInfoFromServiceMethod1(){
    this.info1=this.rservice.getinfo1();
  }

  getInfoFromServiceMethod2(){
    this.info2=this.rservice.getinfo2();
  }

  getInfoFromServiceMethod3(){
    this.info3=this.rservice.getinfo3();
  }

  constructor(private rservice: RecordsService){

  }

  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
}
