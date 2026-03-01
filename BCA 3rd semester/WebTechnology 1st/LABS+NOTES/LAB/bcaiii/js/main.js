// let val = prompt("Enter number");
// let mul = 1;
// for(let i = 1; i <=val; i++){

//     mul = mul*i;
// }
// document.write(i);
// var i = 1;
// while(i <= val){
//     mul = mul * i;
//     i++;
// }
// document.write(mul);
// var i = 1;
// do{
//     mul = mul * i;
//     i++;
// }while(i<=val);

// document.write(mul);
let sumPrice = 0;
const person = [{
        name: "product 1", 
        price: 340.5,
        store:"dhangadhi store"
    },
    {
        name: "product2 ", 
        price: 400,
        store:"tikapur"
    }
];
for(let key in person){
    sumPrice = sumPrice + person[key].price;
    document.write(person[key].email);
    document.write("<br>");
}
document.write(sumPrice);