import {Component, OnInit} from '@angular/core';
import {Observable} from 'rxjs/Observable';
import {Http} from '@angular/http';
import 'rxjs/add/operator/map';
import 'rxjs/add/observable/from';
import {Product} from './product.model';

@Component({
  selector: 'app-root',
  template: `<h2>All products:</h2>
            <ul>
              <li *ngFor="let product of products">
                {{product.label}}
              </li>
            </ul>`
})
export class AppComponent implements OnInit {

  products: Array<Product> = Array(new Product(1, 'One product', 90.00));
  dataSource: Observable<string>;


  constructor(private http: Http) {
    this.dataSource = this.http.get('/api/products')
      .map(res => res.json())
  }

  ngOnInit() {
    this.dataSource.subscribe(
      data => {
        if (Array.isArray(data)) {
          this.products = data;
        } else {
          this.products.push(JSON.parse(data));
        }
      },
      err => {
        console.log('Can`t get products. Error status %s, url %s', err.status, err.url);
      },
      () => console.log('Products are retrieved')
    )
  };

}
