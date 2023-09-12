var a : Int = 5
print ("Value of variable a : $a")

var b = " value of a :"
print("$b $a")

fun valueinc(x: Int) : Int{
    return x+=1
}

a=valueinc(a)
print("$b $a")
