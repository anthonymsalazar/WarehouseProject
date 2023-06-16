import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';

export class WarehouseService {

  constructor (private httpClient: HttpClient) {}

  getAllHotTopicItems() {
    return this.httpClient.get('http:localhost:8080/hottopic');
  }

}