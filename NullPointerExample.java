class NullPointerExample{
public static void main(String args[]){
String name = null;
try{
System.out.println(name.length());
}
catch(NullPointerException e){
System.out.println("Error:You tried to access a null abject!");
}
finally{
System.out.println("Finally block is always executed.");
}
}
}
