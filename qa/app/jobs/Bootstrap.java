package jobs;

import models.Answer;
import models.Post;
import models.Question;
import models.User;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;

@OnApplicationStart
public class Bootstrap extends Job {

	User hans;
	User admin;
	Question firstQuestion;
	Question secondQuestion;
	Post thirdQuestion;
	Post fourthQuestion;
	Answer firstAnswer;

	public void doJob() {
		
		// Check if the database is empty
        if(User.count() == 0) {
            Fixtures.load("initial-data.yml");
        }
    

		
		
		
		/**Fixtures.deleteAll();
		hans = new User("Muster Hans", "hans@gmail.com", "keyword").save();
		admin = new User("admin", "admin@gmail.com", "admin").save();
		admin.isAdmin = true;
		secondQuestion = new Question(hans,
				"Why this question hasn't been answered?").save();
		firstQuestion = new Question(hans, "What is hot and shines brightly?")
				.save();
		firstAnswer = new Answer(firstQuestion, hans, "It is the sun.").save();
		firstQuestion.answers.add(firstAnswer);
		secondQuestion.addAnswer(hans, "I don't know.");
		thirdQuestion = new Question(hans,
				"Why is programming so  frustrating?").save();
		fourthQuestion = new Question(admin, "Is this a question?").save();
	}**/
	}
}
