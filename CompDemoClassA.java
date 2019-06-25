class CompDemoClassA{
private int varOfClassA;


private CompDemoClassB cdcb;
private CompDemoClassC cdcc;
CompDemoClassA()
{
   cdcb = new CompDemoClassB();
   cdcc = new CompDemoClassC();
   cdcb.setVar(21);
   cdcc.setName("Ram");
}

public int getVar(){
return cdcb.getVar();
}

public String getName(){
return cdcc.getName();
}

}