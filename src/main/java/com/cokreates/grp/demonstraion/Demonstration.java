package com.cokreates.grp.demonstraion;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "bootcamp_demonstration", schema = "bootcamp")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@EntityListeners(AuditingEntityListener.class)
public class Demonstration {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "oid", nullable = false)
    private String oid;

    @Column(name = "session_name", nullable = false, updatable = false)
    @NotNull(message = "Session name cannot be null")
    @Size(min = 1, max = 200)
    private String sessionName;

    @Column(name = "number_of_students", columnDefinition = "NUMERIC(4,0)", nullable = false)
    @NotNull(message = "Number of Students cannot be null")
    private Integer numberOfStudents;

    @Column(name = "start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

}
