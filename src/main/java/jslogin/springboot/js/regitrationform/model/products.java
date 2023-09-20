package jslogin.springboot.js.regitrationform.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class products {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) 
         private Long id;
         private String name;
         private String description;
         private LocalDate startDate;
         private LocalDate endDate;
         private String status;

public products(){
    
}
        public products(String name, String description, LocalDate startDate, LocalDate endDate, String status) {
            this.name = name;
            this.description = description;
            this.startDate = startDate;
            this.endDate = endDate;
            this.status = status;
        }
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public LocalDate getStartDate() {
            return startDate;
        }
        public void setStartDate(LocalDate startDate) {
            this.startDate = startDate;
        }
        public LocalDate getEndDate() {
            return endDate;
        }
        public void setEndDate(LocalDate endDate) {
            this.endDate = endDate;
        }
        public String getStatus() {
            return status;
        }
        public void setStatus(String status) {
            this.status = status;
        }



}
