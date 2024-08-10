
// for (let i = 1; i <= 5; i++) {
//     let stars = "";
//     for (let j = 1; j <= i; j++) {
//       stars += "*";
//     }
//     console.log(stars);
//   }

// for (let x = 1; x <= 5; x++){
//     let stars = "";
//     for (let y=5; y>=x; y--){
//         stars +="*";
//     }
//     console.log(stars);

// }


// let n=4
// for(let i=0; i<n;i++){
//    for(let j=n-i-1;j>=0;j--){
//     console.log(" ");
//    }
//    for(let j=0;j<2*i+1;j++){
//     console.log("*")
//    }
//    for(let j=n-i-1;j>=0;j--){
//     console.log(" ");
//    }
//    console.log()

// }
//    //dowhile
//  letdv x=10
//  do{
//      console.log(x);
//      x=x-1
//   }while(x>0);
 
//  //while
//   let i=10
//   while(i>0){
//      console.log(i)
//       i=i-1
//   }
var s ="";
for (let i = 0; i < 4; i++) {
    let count = 1; // Initialize count outside of the inner loop
    for (let j = 0; j <= i; j++) {
        s+=count+" "
        console.log(s);
    }
     // Move to the next line after each row is complete
}
