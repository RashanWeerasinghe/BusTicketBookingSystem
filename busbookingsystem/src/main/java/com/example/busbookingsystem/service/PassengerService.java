package com.example.busbookingsystem.service;

import com.example.busbookingsystem.dto.PassengerDTO;
import com.example.busbookingsystem.dto.request.PassengerReserveTicketDTO;
import com.example.busbookingsystem.dto.response.PassengerAvailabilityDTO;
import com.example.busbookingsystem.dto.response.PassengerTicketDTO;
import com.example.busbookingsystem.exception.NotFoundException;

public interface PassengerService {


    PassengerAvailabilityDTO checkAvailability(String start, String end, int x) throws NotFoundException;

    PassengerTicketDTO passengerReserveTicket(PassengerReserveTicketDTO passengerReserveTicketDTO) throws NotFoundException;
}
