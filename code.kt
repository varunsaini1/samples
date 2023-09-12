//Defining Variables
var a : Int = 5
print ("Value of variable a : $a")

var b = " value of a :"
print("$b $a")

var c : Int = 10
print ("Value of variable c : $c")


// Increment Function
fun valueinc( x : Int) : Int{
    return x+=1
}

// using tthe functio
a=valueinc(a)
print("$b $a")

//Print product of Two Numbers
fun printProd(x: Int, y: Int) : Unit{
    if(x != null && y != null){
        print("Product of $x and $y : ${x * y}")
    }
    else{
        print("Not Number value assigned.")
    }
}

//Multiplying a and c
printProd(a,c)
