package com.example.busbookingsystem.service;

import com.example.busbookingsystem.dto.PassengerDTO;
import com.example.busbookingsystem.dto.request.PassengerReserveTicketDTO;
import com.example.busbookingsystem.dto.response.PassengerAvailabilityDTO;
import com.example.busbookingsystem.dto.response.PassengerTicketDTO;

public interface PassengerService {


    PassengerAvailabilityDTO checkAvailability(String start, String end, int x);

    PassengerTicketDTO passengerReserveTicket(PassengerReserveTicketDTO passengerReserveTicketDTO);
}
