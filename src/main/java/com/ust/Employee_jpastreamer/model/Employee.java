package com.ust.Employee_jpastreamer.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Employee")

    public class Employee {
        @Id
        private String id;
        private String education;
        private int joiningYear;
        private String city;
        private int paymentTier;
        private int age;
        private String gender;
        private String everBenched;
        private int experienceInCurrentDomain;
        private int leaveOrNot;

    }
