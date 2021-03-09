package com.example.demo.exh.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data @Lazy
public class ExhbnDTO {
	private long exhbnNum;
	private long hallNum;
    private String exhbnTitle;
    private String startDate;
    private String endDate;
    private String exhbnGenre;
    private String exhbnPrice;
    private String exhbnArtist;
    private String exhbnContent;
    private String exhbnImage;
}
/*
create table shows(
   show_num int primary key auto_increment,
   title varchar(30),
   period varchar(30),
   time varchar(20),
   venue varchar(20),
   admission varchar(20),
   price varchar(100),
   host varchar(20),
   management varchar(20),
   inquiry varchar(20)
   );
   poster_image varchar(100)*/