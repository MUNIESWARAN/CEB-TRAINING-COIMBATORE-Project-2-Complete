import { Component, OnInit } from '@angular/core';
import {LogService} from '../log.service';
@Component({
  selector: 'app-log-comp',
  templateUrl: './log-comp.component.html',
  styleUrls: ['./log-comp.component.css']
})
export class LogCompComponent implements OnInit {

  constructor(public logService : LogService) { }

  ngOnInit() {
  }

}
