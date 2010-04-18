import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Andrei Tolnai
 * @date 18 April 2010
 * @assignment 5.2
 * @description Modify the application above so that the user is presented with
 *              each question continually until it is answered correctly. Remove
 *              the calculation for percentage of correct answers--all users
 *              will have 100% correct by the time they complete the
 *              application. Save your file as Quiz2.java. (Deliverable 2)
 * @company Bellevue University
 * @fileName Quiz2.java
 * 
 */
public class Quiz2 {

	public static void main(String[] args) {

		System.out.println("Photography quiz.\n");

		// Initialize the questions; each question will contain the answer list
		Question2 questions[] = initializeQuestions();

		Scanner userInput;
		int option;

		for (int i = 0; i < questions.length; i++) {

			boolean correctAnswer = false;
			do {

				// display the question text
				System.out.println(questions[i].getQuestionText());

				// display the available answers for the question
				questions[i].printAnswers();

				userInput = new Scanner(System.in);
				try {
					option = userInput.nextInt();
				} catch (InputMismatchException e) {
					// user did not enter an integer
					option = -99;
				}

				// display the appropriate message if the answer is correct or
				// not.
				if (option == questions[i].getCorrectAnswer()) {
					System.out.println("Congratulations! That was the correct answer. \n");
					correctAnswer = true;
				} else {
					System.out.println("Wrong answer. Try again.\n");
				}
			} while (!correctAnswer);
		}

	}

	/**
	 * Creates questions and adds to each question the list with answer.
	 * 
	 * @return array of <code>Question</code> type.
	 */
	private static Question2[] initializeQuestions() {
		Question2 questions[] = new Question2[6];

		questions[0] = new Question2("1. In photography, filters are used to:");
		questions[0].addAnswer(new Answer2("keep dirt and grime away from the film surface "));
		questions[0].addAnswer(new Answer2("modify light.", true));
		questions[0].addAnswer(new Answer2("keep used photons from collecting inside the camera."));
		questions[0].addAnswer(new Answer2("clean the air entering the camera through the PC terminal."));

		questions[1] = new Question2("2. Depth of  field refers to:");
		questions[1].addAnswer(new Answer2("the thickness of the film."));
		questions[1].addAnswer(new Answer2("the distance from the rear nodal point of the lens and the film plane."));
		questions[1].addAnswer(new Answer2("landscape photographs made with a wide angle lens."));
		questions[1].addAnswer(new Answer2("the areas behind and in front of the point of focus that are also acceptably sharp.", true));

		questions[2] = new Question2("3. An over-exposed slide will:");
		questions[2].addAnswer(new Answer2("be too light.", true));
		questions[2].addAnswer(new Answer2("be too dark."));
		questions[2].addAnswer(new Answer2("be orange colored."));
		questions[2].addAnswer(new Answer2("have a pronounced blue cast."));

		questions[3] = new Question2("4. A zoom lens:");
		questions[3].addAnswer(new Answer2("is faster than a regular lens."));
		questions[3].addAnswer(new Answer2("is usually sharper than a non-zoom lens."));
		questions[3].addAnswer(new Answer2("has a variable focal length.", true));
		questions[3].addAnswer(new Answer2("should never be used with a filter."));

		questions[4] = new Question2("5. Compared to a film with an ISO of 400, a film with an ISO of 100:");
		questions[4].addAnswer(new Answer2("requires less exposure."));
		questions[4].addAnswer(new Answer2("is better for action subjects."));
		questions[4].addAnswer(new Answer2("will produce grainer prints."));
		questions[4].addAnswer(new Answer2("requires more exposure.", true));

		questions[5] = new Question2("6. Which of the following are especially suitable for use in low-light photography?");
		questions[5].addAnswer(new Answer2("slow film (low ISO rating)"));
		questions[5].addAnswer(new Answer2("fast shutter speed."));
		questions[5].addAnswer(new Answer2("wide aperture.", true));
		questions[5].addAnswer(new Answer2("polarizing filter."));
		questions[5].addAnswer(new Answer2("zoom lens."));

		return questions;
	}

}

/**
 * A question contains the question text and an array of answers.
 */
class Question2 {

	// the question text
	private String questionText;

	// the answers
	private Answer2[] answers = null;

	/**
	 * Constructs a question with the question text.
	 * 
	 * @param questionText
	 */
	public Question2(String questionText) {
		this.questionText = questionText;
	}

	/**
	 * Prints on the console the answers available for the question.
	 */
	public void printAnswers() {
		if (answers != null && answers.length > 0) {
			for (int i = 0; i < answers.length; i++) {
				System.out.println("    [" + i + "] " + answers[i].getText());
			}
		}
	}

	/**
	 * Adds a new possible answer to the question.
	 * 
	 * @param answer
	 */
	public void addAnswer(Answer2 answer) {
		if (answers == null) {
			answers = new Answer2[1];
			answers[0] = answer;
		} else {
			Answer2[] temp = answers;
			answers = new Answer2[temp.length + 1];
			for (int i = 0; i < temp.length; i++) {
				answers[i] = temp[i];
			}
			answers[temp.length] = answer;
		}
	}

	/**
	 * Returns the order of the correct answer to the question.
	 * 
	 * @return correct answer position
	 */
	public int getCorrectAnswer() {
		for (int i = 0; i < answers.length; i++) {
			if (answers[i].isCorrectAnswer()) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Returns the text of the question.
	 * 
	 * @return
	 */
	public String getQuestionText() {
		return questionText;
	}
}

/**
 * An answer contains the text for the answer and and attribute to determine if
 * the answer is correct or not.
 */
class Answer2 {

	// the text of the answer
	private String text;

	// the attribute to determine if the answer is correct of not
	private boolean correctAnswer;

	/**
	 * Constructs an answer setting the attribute to determine the correct
	 * answer to false.
	 * 
	 * @param answerText
	 *            the text of the answer
	 */
	public Answer2(String answerText) {
		this.text = answerText;
		this.correctAnswer = false;
	}

	/**
	 * Constructs and answer setting the answer text as well as the attribute to
	 * determine correctness of the answer.
	 * 
	 * @param answerText
	 *            the text of the answer
	 * @param correctAnswer
	 *            the attribute to determine if the answer is correct or not
	 */
	public Answer2(String answerText, boolean correctAnswer) {
		this.text = answerText;
		this.correctAnswer = correctAnswer;
	}

	/**
	 * 
	 * @return the text of the answer
	 */
	public String getText() {
		return text;
	}

	/**
	 * 
	 * @return if the answer is correct or not
	 */
	public boolean isCorrectAnswer() {
		return correctAnswer;
	}

}