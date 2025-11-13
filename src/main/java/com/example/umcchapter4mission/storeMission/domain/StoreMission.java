package com.example.umcchapter4mission.storeMission.domain;

import com.example.umcchapter4mission.memberMission.enums.Status;
import com.example.umcchapter4mission.mission.domain.Mission;
import com.example.umcchapter4mission.store.domain.Store;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access =  AccessLevel.PROTECTED)
@Table(name = "stores_missions")
@Builder
@Getter
public class StoreMission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id")
    private Mission mission;


}
