
package com.fleet.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class VehicleHistory {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String vehicleId;
 private Double soc;
 private Double kwhDeliveredDc;
 private Double batteryTemp;
 private LocalDateTime timestamp;
}
