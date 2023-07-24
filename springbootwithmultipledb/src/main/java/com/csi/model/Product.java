package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.regex.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Product {

    @Id
    @GeneratedValue
    private int prodId;

    private String prodName;

    private double prodPrice;

    @JsonFormat(pattern="dd-MM-yyyy")
    private Date prodLaunchDate;
}
