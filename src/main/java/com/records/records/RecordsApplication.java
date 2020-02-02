package com.records.records;

import com.records.records.entities.RecordEntity;
import com.records.records.entities.XmlConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.List;

@SpringBootApplication
public class RecordsApplication {



	public static void main(String[] args) {
		SpringApplication.run(RecordsApplication.class, args);
		XmlConverter xmlConverter = new XmlConverter();

		File file = new File(RecordsApplication.class.getClassLoader().getResource("records.xml").getFile());
		List<RecordEntity> records = xmlConverter.xmlToObjects(file);
		for(RecordEntity country: records){
			folderFactory(country.getCountry());
		}
	}

	public static void folderFactory(String country){
		File file = new File("C:\\"+ country);
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("Directory is created!");
			} else {
				System.out.println("Failed to create directory!");
			}
		}
	}

}
