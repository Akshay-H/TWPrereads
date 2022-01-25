let num = [1,2,3,4,5]
console.log(num)

function sum(total,number){
    return total+number    
}

function reduce(array,operation,initialvalue){
    let res = initialvalue
    for(let i=0; i<array.length; i++){
        res = operation(res, array[i])
    }
    return res
}

let answer = reduce(num,sum,0)
console.log(answer)
