package com.ftn.sss.urbanhunt.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name="administrator")
public class Administrator extends User {

}
