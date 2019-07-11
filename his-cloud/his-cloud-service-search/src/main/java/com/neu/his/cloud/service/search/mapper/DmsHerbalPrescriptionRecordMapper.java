package com.neu.his.cloud.service.search.mapper;

import com.neu.his.cloud.service.search.model.DmsHerbalPrescriptionRecord;
import com.neu.his.cloud.service.search.model.DmsHerbalPrescriptionRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsHerbalPrescriptionRecordMapper {
    int countByExample(DmsHerbalPrescriptionRecordExample example);

    int deleteByExample(DmsHerbalPrescriptionRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DmsHerbalPrescriptionRecord record);

    int insertSelective(DmsHerbalPrescriptionRecord record);

    List<DmsHerbalPrescriptionRecord> selectByExample(DmsHerbalPrescriptionRecordExample example);

    DmsHerbalPrescriptionRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DmsHerbalPrescriptionRecord record, @Param("example") DmsHerbalPrescriptionRecordExample example);

    int updateByExample(@Param("record") DmsHerbalPrescriptionRecord record, @Param("example") DmsHerbalPrescriptionRecordExample example);

    int updateByPrimaryKeySelective(DmsHerbalPrescriptionRecord record);

    int updateByPrimaryKey(DmsHerbalPrescriptionRecord record);
}