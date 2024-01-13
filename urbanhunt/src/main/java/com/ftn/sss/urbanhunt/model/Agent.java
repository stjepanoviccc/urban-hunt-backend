package com.ftn.sss.urbanhunt.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="agent")
public class Agent extends  User{

    @OneToMany(mappedBy = "agent", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ArrayList<Tour> tours;

    @Column(name="average_rating", nullable = false)
    @JoinColumn(name = "average_rating")
    private float averageRating;

    @OneToMany(mappedBy = "agent", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ArrayList<RealEstate> realEstateList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="agency_id", nullable = false)
    private Agency agency;
}
