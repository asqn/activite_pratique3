package ma.emsi.patientmvc;

import ma.emsi.patientmvc.entities.Patient;
import ma.emsi.patientmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientMvcApplication {

    public static void main(String[] args) {

        SpringApplication.run(PatientMvcApplication.class, args);
    }
   // @Bean
CommandLineRunner commandLineRunner(PatientRepository patientRepository){
   return args -> {
       patientRepository.save(new Patient(null,"Hassan",new Date(),false,112));
       patientRepository.save(new Patient(null,"Yasmine",new Date(),true,312));
       patientRepository.save(new Patient(null,"Kawtar",new Date(),true,178));
       patientRepository.save(new Patient(null,"Hanae",new Date(),false,192));
   patientRepository.findAll().forEach(p->{
       System.out.println(p.getName());
   });
   };
}
}
