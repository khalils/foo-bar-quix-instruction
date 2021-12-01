import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html'
})
export class FooBarQuixFormComponent {


  @Output()
  submitNumberOutput = new EventEmitter<number>();
  convertForm = new FormGroup({
    inputNumber: new FormControl('', { validators: [
      Validators.required,
      Validators.pattern(/^[0-9]*$/)
      ]
    })
  });


  submitNumber(): void {
    this.submitNumberOutput.emit(this.convertForm.get('inputNumber').value);
  }
}
