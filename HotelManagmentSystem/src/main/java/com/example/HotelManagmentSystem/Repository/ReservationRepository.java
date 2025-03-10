package com.example.HotelManagmentSystem.Repository;

import com.example.HotelManagmentSystem.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByUser_Id(Long userId);
    List<Reservation> findByRoom_RoomId(Long roomId);
    List<Reservation> findByStatus(Reservation.Status status);
}
