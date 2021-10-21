package com.company;

public class AndroidOS {

    public void  modifiedBySamsung(String osv){
        //System.out.println("Modified By Samsung Version " + osv);
        print("Samsung", osv);
    }

    public void  modifiedByXiaomi(String osv){
        //System.out.println("Modified By Xiaomi Version " + osv);
        print("Xiaomi" , osv);
    }


    private void print(String brand , String version){
        System.out.println("Modified By " +brand +"Version "+version  );
    }

}
