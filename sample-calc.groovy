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
