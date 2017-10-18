package cn.sheep3.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by sheep3 on 2017/10/19.
 */
@Data
@Entity
@Table(name = "t_topics")
@EntityListeners({AuditingEntityListener.class})
@NoArgsConstructor
public class Topic {
    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "c_name", unique = true, nullable = false)
    private String name;

    @Column(name = "c_desc", nullable = false)
    private String desc;

    @Column(name = "c_user_id", nullable = false)
    private Long user_id;

    @Column(name = "c_create_time")
    @CreatedDate
    private Date create_time;

    @Column(name = "c_update_time")
    @LastModifiedDate
    private Date update_time;
}
