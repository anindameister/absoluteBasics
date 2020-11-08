
function getA2ZArray () { 
    const result = [] 
    for (i = 65; i <= 90 ; i++){ 
        result.push(String.fromCharCode(i)) 
      } 
      return result 
 
    }

console.log(getA2ZArray ())