def reader = System.in.newReader()

int a = reader.readLine() as Integer;
int b = reader.readLine() as Integer;

boolean c = reader.readLine().toBoolean();

println "A + B : ${a+b}"
println "A - B : ${a-b}"
println "A * B : ${a*b}"
println "A / B : ${a/b}"
println "A % B : ${a%b}"
println "A ** B : ${a**b}"

println a.getClass()
println b.getClass()
println c.getClass()


def add = a+b

//if
if(add == 10){
  println "true"  
} 

def sub = a - b
//if-else
if(sub == 0) {
    println "true"
} else {
    println "false"
}

if(add == 10){
     println "true"
} else if(sub == 0){
    println "true"
} else {
    println "false"
}
