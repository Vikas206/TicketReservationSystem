/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticket.model;

/**
 *
 * @author vikas
 */
public class TicketClerk {
    private String name;
    private String location;

    public TicketClerk(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void reserveSeat() {
        System.out.println("Clerk reserved seat");
    }

    public void reserveTicket() {
        System.out.println("Clerk reserved ticket");
    }

    public void cancelTicket() {
        System.out.println("Clerk cancelled ticket");
    }

    public void receivePayment() {
        System.out.println("Payment received");
    }
}
