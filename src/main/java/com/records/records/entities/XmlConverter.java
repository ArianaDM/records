package com.records.records.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

public class XmlConverter {
    @XmlRootElement(name = "records")
    public class Records {


        List<RecordEntity> records;

        public Records(List<RecordEntity> records) {
            this.records = records;
        }

        @XmlElement(name = "record")
        public List<RecordEntity> getRecords() {
            return records;
        }

        public void setRecords(List<RecordEntity> records) {
            this.records = records;
        }

        public Records() {
        }
    }


}
