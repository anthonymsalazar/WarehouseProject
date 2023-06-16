import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OldnavyComponent } from './oldnavy.component';

describe('OldnavyComponent', () => {
  let component: OldnavyComponent;
  let fixture: ComponentFixture<OldnavyComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [OldnavyComponent]
    });
    fixture = TestBed.createComponent(OldnavyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
