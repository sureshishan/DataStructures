package com.suresh.string.custom.imutable;

public final class CustomImmutable
{
    final String name;
    final int regNo;
 
    public CustomImmutable(String name, int regNo)
    {
        this.name = name;
        this.regNo = regNo;
    }
    public String getName()
    {
        return name;
    }
    public int getRegNo()
    {
        return regNo;
    }
    
    public static void main(String args[]){
    	String name = "suresh";
    	int no = 677778;
    	CustomImmutable ci = new CustomImmutable(name, no);
    	System.out.println(ci.getName());
    	System.out.println(ci.getRegNo());
    	//ci.name = "ishan";
    	//name = "ishan";
    	System.out.println(ci.getName());
    }
}
