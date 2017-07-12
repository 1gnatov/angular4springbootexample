export class Product {
  id: number;
  label: string;
  cost: number;

  constructor(id: number, label: string, cost: number) {
    this.id = id;
    this.label = label;
    this.cost = cost;
  }
}
