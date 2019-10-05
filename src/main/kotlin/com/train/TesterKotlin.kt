package com.train

import java.util.*

fun main(args: Array<String>) {
    var s = Scanner(System.`in`)
    print("Please enter number of tickets:")
    var toatalTickets : Int= s.nextInt()
    print("How many round-trip tickets:")
    var roundTripTickets : Int= s.nextInt()
    var t = TicketKotlin(toatalTickets, roundTripTickets )
    t.print()
}

class TicketKotlin(var totalTickets : Int, var roundTripTickets : Int){
    fun totalMoney() : Int{
        var total = (totalTickets - roundTripTickets) * 1000 + roundTripTickets * 1800
        return total
    }

    fun print(){
        println("Total tickets : $totalTickets" + "Round-Trip Tickets :$roundTripTickets" + "Total : ${totalMoney()}")
    }
}