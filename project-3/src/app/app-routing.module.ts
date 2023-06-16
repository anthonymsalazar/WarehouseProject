import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { CompaniesComponent } from './companies/companies.component';
import { ContactComponent } from './contact/contact.component';
import { HottopicComponent } from './hottopic/hottopic.component';
import { NikeComponent } from './nike/nike.component';
import { OldnavyComponent } from './oldnavy/oldnavy.component';
import { PatagoniaComponent } from './patagonia/patagonia.component';

const routes: Routes = [

  {
    path: '',
    component: HomeComponent
  },

  {
    path: 'about',
    component:AboutUsComponent
  }, 

  {
    path: 'locations',
    component:CompaniesComponent
  },

  {
    path: 'contact',
    component:ContactComponent
  },

  { 
    path: 'hottopic', 
    component: HottopicComponent 
  },

  { 
    path: 'nike', 
    component: NikeComponent 
  },

  { 
    path: 'oldnavy', 
    component: OldnavyComponent 
  },

  { 
    path: 'patagonia', 
    component: PatagoniaComponent 
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
