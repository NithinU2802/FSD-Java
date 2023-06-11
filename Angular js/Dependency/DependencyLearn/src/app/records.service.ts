import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RecordsService {
  info1: string[]=["Nithin", "E234","krct@nithin.com"]
  info2: string[]=["Aslam", "E235","krct@aslam.com"]
  info3: string[]=["Jameer", "E236","krct@jameer.com"]

  getinfo1(): string[]{
    return this.info1;
  }

  getinfo2(): string[]{
    return this.info2;
  }

  getinfo3(): string[]{
    return this.info3;
  }

  constructor() { }
}
