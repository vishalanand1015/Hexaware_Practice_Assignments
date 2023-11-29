import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { decrement, increment, reset } from '../actions/counter.actions';
import { Store } from '@ngrx/store';

@Component({
  selector: 'app-my-counter',
  templateUrl: './my-counter.component.html',
  styleUrls: ['./my-counter.component.css']
})
export class MyCounterComponent {
  count$ :Observable<number>=new Observable();

  constructor(private store: Store<{ count: number }>) {
    this.count$ = store.select('count');
  }
  increment(){

    console.log('increment() called');
    this.store.dispatch(increment());
  }
  decrement(){

    console.log('decrement() called');
    this.store.dispatch(decrement());
  }
    reset(){

      console.log('reset() called');
      this.store.dispatch(reset());
    }
  }

