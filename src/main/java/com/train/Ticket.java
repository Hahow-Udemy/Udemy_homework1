package com.train;

public class Ticket {
    int totalTicket, roundTripTicket, total;

    public Ticket(int totalTicket, int roundTripTicket) {
        this.totalTicket = totalTicket;
        this.roundTripTicket = roundTripTicket;

    }
    public int totalMoney(){
      total = (totalTicket - roundTripTicket) * 1000 + roundTripTicket *1800;
      return total;
    };
    public void print(){
        System.out.println("Total tickets:" + totalTicket +
                "Round-trip tickets:" + roundTripTicket +
                "Total:" + totalMoney());
    }
}
