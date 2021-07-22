package com.company;

public class Hash {
    private Circle arr[];
    private int size;

    public Hash(int size){
        arr= new Circle[size];
        this.size=size;
    }

    public int hashFuncMul(Circle circle){
        double key=circle.getLength();
        double A=0.618;
        int hash=(int)((key*A-(int)(key*A))*size);
        return hash;
    }

    public boolean collision(int index, Circle circle){
        int newId=index;
        for(int i=1;i<arr.length;i++){
            newId=(index+i^2)%size;
            if(arr[newId]==null){
                arr[newId]=circle;
                return true;
            }
            if(arr[newId].equals(circle)) return false;
        }
        return false;
    }

    public boolean insert(Circle circle){
        int index = hashFuncMul(circle);
        if(arr[index]==null){
            arr[index]=circle;
            return true;
        }else {
            System.out.println("Collision");
            return false;
        }
    }

    public boolean insert2(Circle circle){
        int index=hashFuncMul(circle);
        if(arr[index]==null){
            arr[index]=circle;
            return true;
        } else {
            if(!arr[index].equals(circle)){
                return collision(index,circle);
            }
        }
        return false;
    }

    public void print(){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                System.out.println(i+" "+arr[i].toString());
            }
        }
    }
}
