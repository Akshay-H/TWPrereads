let num = [1,2,3,4,5]
console.log(num)

function odd(number){
    return number%2    
}

function filter(array,operation){
    let res =[]
    for(let i=0; i<array.length; i++){
        if(operation(array[i])){
            res.push(array[i])
        }
    }
    return res
}

let answer = filter(num,odd)
console.log(answer)