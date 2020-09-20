package com.thoughtworks.rslist.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "trade")
public class TradeDto {
    @Id
    @GeneratedValue
    private int id;
    @JoinColumn(name = "user_id")
    private Integer userId;
    @JoinColumn(name = "event_id")
    private Integer eventId;
    int amount;
    int rank;
}
