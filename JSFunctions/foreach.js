let num = [1,2,3,4,5]
console.log(num)

function square(number){
    return number*number    
}

function foreach(array,operation){
    for(let i=0; i<array.length; i++){
        array[i] = operation(array[i])
    }
}

let answer = foreach(num,square)
console.log(num)