import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { FooBarQuixService } from '../foo-bar-quix.service';

@Component({
  selector: 'app-foo-bar-quix',
  templateUrl: './foo-bar-quix.component.html'
})
export class FooBarQuixComponent implements OnInit, OnDestroy {

  constructor(private fooBarQuixService: FooBarQuixService) { }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    this.fooBarQuixService.convertNumber(inputNumber)
    .subscribe(
      response => {
        const numberConverted: NumberConverted = {numberToConvert: inputNumber, result: response.result};
       console.log(numberConverted)
      },
      error => {
        console.log("error :", error);
      }
    );
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
