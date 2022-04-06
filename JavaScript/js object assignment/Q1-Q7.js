//Q1
class Rectangle {
    constructor(width, height) {
        this.width = width;
        this.height = height;
    }
    //Q2 
    getArea = () => { return this.width * this.height; };
    getPerimeter = () => { return 2 * (this.width + this.height); };
  }
  r = new Rectangle(2, 3);
  document.write(`Rectangle r width is ${r.width}, length is ${r.height} `);
  document.write(`rectangle r of length ${r.height} & width  ${r.width} has area ${r.getArea()} and perimeter ${r.getPerimeter()}`);
  
  //Q3 
  s = new Rectangle(4,10);
  document.write(`New rectangle s of length ${s.height} & width  ${s.width} has area ${s.getArea()} and perimeter ${s.getPerimeter()}`);
  s.width = 5;
  document.write(`rectangle s of length ${s.height} & Changed width  ${s.width} has area ${s.getArea()} and perimeter ${s.getPerimeter()}`);
  
  //Q4 
  var myObject = {firstname: "Parvathi",lastname: "Rajesh",age: "21",city: "Chennai",state: "TamilNadu",country: "India"};
  document.write(`First-name is ${myObject.firstname} , lastname  is ${myObject.lastname} , age is ${myObject.age} , city is ${myObject.city} , state is ${myObject.state} , country is ${myObject.country}`);
  myObject.lastname = "Adithya";
  document.write(`Changed Lastname ${myObject.lastname}`);
  //Q5 
  document.write(`since there is no middle name defined The middle name is : ${myObject.MiddleName}`);
  myObject.MiddleName = "Vasundhara";
  document.write(`After defining The middle name is : ${myObject.MiddleName}`);
  
  //Q6 
  var string = "{firstName:'shreya', age:21, city:'chennai', state:'tamilnadu', country:'India'}";
  eval('var obj='+string);
  document.write(obj);
  myObject.MiddleName = "Adithya";
  document.write(` The middle name is : ${myObject.MiddleName}`);
  
  //Q7 
  var obj = '{ "firstName":"Parvathi", "lastName":"Rajesh" }';
  obj = JSON.parse(obj); //converts to a regular object
  document.write(obj); //John