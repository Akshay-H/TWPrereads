let num = [1,2,3,4,5]
console.log(num)

function square(number){
    return number*number    
}

function map(array,operation){
    let res =[]
    for(let i=0; i<array.length; i++){
        res.push(operation(array[i]))
    }
    return res
}

let answer = map(num,square)
console.log(answer)