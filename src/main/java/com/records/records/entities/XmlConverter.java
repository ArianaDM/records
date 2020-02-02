package com.records.records.entities;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class XmlConverter {

    public List<RecordEntity> xmlToObjects(File file) {
        try {

            //File file = new File(XmlToObjects.class.getClassLoader().getResource("records.xml").getFile());
            JAXBContext jaxbContext = JAXBContext.newInstance(Records.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Records que = (Records) jaxbUnmarshaller.unmarshal(file);
            return que.getRecords();

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;

    }

}
