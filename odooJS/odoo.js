function GuessANumber () { 
    let answer = Math.ceil(Math.random() * 1000000) 
    let count = 0; 
    let lower = 0; 
    let upper = 1000000; 
 
    while (true){ 
        if (count > 50) return console.log('Lose!, right number is ' + answer) 
         let guess = Math.floor((lower + upper) / 2) 
        const result = verify(guess) 
        if(result === 0){ 
            return console.log('Winner!, correct number is'  + answer ) 
          }else if (result === -1) { 
              upper = guess 
           }else if (result === 1){ 
              lower = guess 
            } 
          console.log(guess) 
        const counting=count++ 
        
        } 
 
  function verify (guess) { 
      if(guess === answer) return 0 
      if(answer < guess) return -1 
      if(answer > guess) return 1 
 
    } 
 
 
    }


console.log(GuessANumber ())