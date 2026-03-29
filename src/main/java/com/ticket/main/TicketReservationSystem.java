/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ticket.main;
import com.ticket.model.*;

/**
 *
 * @author vikas
 */
public class TicketReservationSystem {

    public static void main(String[] args) {
        Passenger p = new Passenger("Vikas", 22, "Chennai");

        p.searchTrains();
        p.viewSchedule();
        p.reserveSeat();
        p.purchaseTicket();
        p.makePayment();

        Ticket t = new Ticket(101, "Chennai", "Delhi", 1);
        System.out.println("Payment: " + t.paymentAmount());

        TicketClerk clerk = new TicketClerk("Raj", "Station A");
        clerk.reserveTicket();
        clerk.receivePayment();

        RailwayDatabase db = new RailwayDatabase();
        System.out.println(db.response());
    }
}
