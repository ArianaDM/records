package com.records.records.services;

import com.records.records.entities.RecordEntity;
import com.records.records.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportService {

    private RecordRepository recordRepository;

    @Autowired
    public ReportService(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @Transactional
    public List<RecordEntity> saveRecords(List<RecordEntity> theList)
    {
        for (RecordEntity recordEntity: theList) {
            recordRepository.save(recordEntity);
        }
        return theList;
    }

}
