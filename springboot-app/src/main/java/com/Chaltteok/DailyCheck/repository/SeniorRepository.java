package com.Chaltteok.DailyCheck.repository;

import com.Chaltteok.DailyCheck.entity.ScheduleEntity;
import com.Chaltteok.DailyCheck.entity.SeniorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeniorRepository extends JpaRepository<SeniorEntity, Long> {
    List<SeniorEntity> findByUser_Id(long id);
}
