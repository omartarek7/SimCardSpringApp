package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
public interface SimCardRepository extends JpaRepository<SimCard,Long> {
    @Query(value = "SELECT * FROM SIM_CARD s WHERE DEVICE_STATUS = :status", nativeQuery = true)
    List<SimCard> findByStatus(String status);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE SIM_CARD s SET s.DEVICE_STATUS = :status where s.SIM_ID = :SimId",
            nativeQuery = true)
    void updateSimCard(String status, Long SimId);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE SIM_CARD s SET s.DEVICE_STATUS = null where s.SIM_ID = :SimId",
            nativeQuery = true)
    void updateSimCardStatusToNull(Long SimId);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "DELETE FROM SIM_CARD s WHERE s.DEVICE_STATUS = :status AND s.SIM_ID = :SimId",
            nativeQuery = true)
    void deleteSimCard(String status, Long SimId);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "select * from SIM_CARD s Order by s.SIM_ID", nativeQuery = true)
    List<SimCard> sortById();



}
