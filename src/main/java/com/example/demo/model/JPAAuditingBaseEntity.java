package com.example.demo.model;

import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@EntityListeners(AuditingEntityListener.class)

@MappedSuperclass // Only for Abstract class 
public abstract class JPAAuditingBaseEntity {
	@Column(name = "creation_time", nullable = false)
   // @Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentZonedDateTime")
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
     // stores time in miliseconds
    private Date recordCreationDate; // traditional approach to save date time/timestamp 
     private Calendar creatingDate; // @Temporal not needed
 // Gragorian calender;
    private ZonedDateTime creationTime;
 
    @Column(name = "modification_time")
   // @Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentZonedDateTime")
    @LastModifiedDate
    private ZonedDateTime modificationTime;
    
    @Version
    private Long version;
}
