package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.nt.repository.IDoctorRepo;
import com.nt.sbeans.Doctor;
import com.nt.service.IDoctorService;

@SpringBootApplication
public class BootDataJpaProj02DoctorApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootDataJpaProj02DoctorApplication.class, args);

		try {
			Doctor d = new Doctor(104, "tej", "helpeer", 20000.0);

			IDoctorService bean = ctx.getBean(IDoctorService.class);

			String str = bean.registerDoctor(d);

			System.out.println(str);

			System.out.println("hiiiiiii");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
