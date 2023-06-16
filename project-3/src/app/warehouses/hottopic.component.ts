import { Component, OnInit } from '@angular/core';
import { WarehouseService } from '../warehouse.service';

export class WarehouseComponent implements OnInit {

  constructor(public warehouseService: WarehouseService) {}

  hotTopicList: any;
  ngOnInit(): void {
  this.warehouseService.getAllHotTopicItems().subscribe((data: any) => {
  this.hotTopicList = data;
  });
}
}