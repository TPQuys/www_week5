package vn.edu.iuh.fit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.backEnds.models.JobSkill;
import vn.edu.iuh.fit.backEnds.models.Skill;
import vn.edu.iuh.fit.backEnds.repositoties.JobSkillRepository;
import vn.edu.iuh.fit.backEnds.repositoties.SkillRepository;

@SpringBootApplication
public class Week5Application {
	private static final Logger log = LoggerFactory.getLogger(Week5Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Week5Application.class, args);
	}

//	@Bean
//	CommandLineRunner text(JobSkillRepository skillRepository){
//		return args -> {
////			skillRepository.save(new Skill("","it",2));
//			skillRepository.findJobSkillByJob_Id(1).forEach(JobSkilll ->{
//				log.info(JobSkilll.toString());
//			});
//		};
//	}
}
