
package com.fleet.dto;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class VehicleDTO {
 private String vehicleId;
 private Double soc;
 private Double kwhDeliveredDc;
 private Double batteryTemp;
 private LocalDateTime timestamp;
}
