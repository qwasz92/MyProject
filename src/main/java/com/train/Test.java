package com.train;

public class Test {
    String name;
    int tickets;
    int RoundTrip;

    public Test(String name, int tickets,int roundTrip) {
        this.name=name;
        this.tickets = tickets;
        this.RoundTrip= roundTrip;
    }
    public void print(){
        System.out.println("Total tickets:"+tickets+"\t"+"\t"+"Round-trip:"+RoundTrip+"\t"+"Toatl:"+(getTickets()+getRoundTrip()));
    }
    public int getTickets(){ return (tickets)*1000;}
    public int getRoundTrip(){return (RoundTrip)*800;}
}
