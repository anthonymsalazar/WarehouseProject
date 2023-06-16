import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HottopicComponent } from './hottopic.component';

describe('HottopicComponent', () => {
  let component: HottopicComponent;
  let fixture: ComponentFixture<HottopicComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [HottopicComponent]
    });
    fixture = TestBed.createComponent(HottopicComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
