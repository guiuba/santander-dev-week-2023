package me.dio.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "tb_user")
public class User {
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Id
   private Long id;

   private String name;

   @OneToOne(cascade = CascadeType.ALL)
   private Account account;

   @OneToOne(cascade = CascadeType.ALL)
   private Card card;

   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   private List<Feature> features;

   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   private List<News> news;


}
