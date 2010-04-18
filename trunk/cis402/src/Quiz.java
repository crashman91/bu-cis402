import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Andrei Tolnai
 * @date 18 April 2010
 * @assignment 5.2
 * @description Write an application that creates a quiz, which contains at
 *              least 5 questions about a hobby, popular music, astronomy, or
 *              any other personal interest. Each question should be a multiple
 *              choice question with at least 4 options. When the user answers
 *              the question correctly, display a congratulatory message. If the
 *              user responds to a question incorrectly, display an appropriate
 *              message as well as the correct answer. At the end of the quiz,
 *              display the number of correct and incorrect answers, and the
 *              percentage of correct answers. Save your file as Quiz.java.
 *              (Deliverable 1)
 * @company Bellevue University
 * @fileName Quiz.java
 * 
 */
public class Quiz {

	public static void main(String[] args) {

		System.out.println("Photography quiz.\n");

		int correctAnswersNumber = 0;
		int incorrectAnswersNumber = 0;

		// Initialize the questions; each question will contain the answer list
		Question questions[] = initializeQuestions();

		Scanner userInput;
		int option;

		for (int i = 0; i < questions.length; i++) {

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

			// display the appropriate message if the answer is correct or not.
			if (option == questions[i].getCorrectAnswer()) {
				System.out.println("Congratulations! That was the correct answer. \n");
				correctAnswersNumber++;
			} else {
				System.out.println("Wrong answer. The correct one is: " + questions[i].getCorrectAnswer() + "\n");
				incorrectAnswersNumber++;
			}
		}

		System.out.println("Number of correct answers: " + correctAnswersNumber);
		System.out.println("Number of incorrect answers: " + incorrectAnswersNumber);
		System.out.println("Percentage of correct answers: " + ((100 * correctAnswersNumber) / (correctAnswersNumber + incorrectAnswersNumber)) + "%");

	}

	/**
	 * Creates questions and adds to each question the list with answer.
	 * 
	 * @return array of <code>Question</code> type.
	 */
	private static Question[] initializeQuestions() {
		Question questions[] = new Question[6];

		questions[0] = new Question("In photography, filters are used to:");
		questions[0].addAnswer(new Answer("keep dirt and grime away from the film surface "));
		questions[0].addAnswer(new Answer("modify light.", true));
		questions[0].addAnswer(new Answer("keep used photons from collecting inside the camera."));
		questions[0].addAnswer(new Answer("clean the air entering the camera through the PC terminal."));

		questions[1] = new Question("Depth of  field refers to:");
		questions[1].addAnswer(new Answer("the thickness of the film."));
		questions[1].addAnswer(new Answer("the distance from the rear nodal point of the lens and the film plane."));
		questions[1].addAnswer(new Answer("landscape photographs made with a wide angle lens."));
		questions[1].addAnswer(new Answer("the areas behind and in front of the point of focus that are also acceptably sharp.", true));

		questions[2] = new Question("An over-exposed slide will:");
		questions[2].addAnswer(new Answer("be too light.", true));
		questions[2].addAnswer(new Answer("be too dark."));
		questions[2].addAnswer(new Answer("be orange colored."));
		questions[2].addAnswer(new Answer("have a pronounced blue cast."));

		questions[3] = new Question("A zoom lens:");
		questions[3].addAnswer(new Answer("is faster than a regular lens."));
		questions[3].addAnswer(new Answer("is usually sharper than a non-zoom lens."));
		questions[3].addAnswer(new Answer("has a variable focal length.", true));
		questions[3].addAnswer(new Answer("should never be used with a filter."));

		questions[4] = new Question("Compared to a film with an ISO of 400, a film with an ISO of 100:");
		questions[4].addAnswer(new Answer("requires less exposure."));
		questions[4].addAnswer(new Answer("is better for action subjects."));
		questions[4].addAnswer(new Answer("will produce grainer prints."));
		questions[4].addAnswer(new Answer("requires more exposure.", true));

		questions[5] = new Question("Which of the following are especially suitable for use in low-light photography?");
		questions[5].addAnswer(new Answer("slow film (low ISO rating)"));
		questions[5].addAnswer(new Answer("fast shutter speed."));
		questions[5].addAnswer(new Answer("wide aperture.", true));
		questions[5].addAnswer(new Answer("polarizing filter."));
		questions[5].addAnswer(new Answer("zoom lens."));

		return questions;
	}

}

/**
 * A question contains the question text and an array of answers.
 */
class Question {

	// the question text
	private String questionText;

	// the answers
	private Answer[] answers = null;

	/**
	 * Constructs a question with the question text.
	 * 
	 * @param questionText
	 */
	public Question(String questionText) {
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
	public void addAnswer(Answer answer) {
		if (answers == null) {
			answers = new Answer[1];
			answers[0] = answer;
		} else {
			Answer[] temp = answers;
			answers = new Answer[temp.length + 1];
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
class Answer {

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
	public Answer(String answerText) {
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
	public Answer(String answerText, boolean correctAnswer) {
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