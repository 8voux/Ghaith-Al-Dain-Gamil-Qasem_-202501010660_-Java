import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class QuizBattleGUI extends JFrame implements ActionListener {
    private final Questions question;
    private final JLabel lblQuestion;
    private final JLabel lblResult;
    private final JButton btn1;
    private final JButton btn2;

    public QuizBattleGUI() {
        question = new Questions();

        setTitle("Programming Quiz Battle");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        lblQuestion = new JLabel(question.getQuestion());
        lblQuestion.setFont(new Font("Arial", Font.BOLD, 16));
        lblQuestion.setBounds(50, 30, 400, 30);

        btn1 = new JButton(question.getOption1());
        btn1.setBounds(70, 100, 140, 45);
        btn1.addActionListener(this);

        btn2 = new JButton(question.getOption2());
        btn2.setBounds(270, 100, 140, 45);
        btn2.addActionListener(this);

        lblResult = new JLabel("Answer the question!");
        lblResult.setFont(new Font("Arial", Font.BOLD, 14));
        lblResult.setBounds(50, 180, 400, 30);

        add(lblQuestion);
        add(btn1);
        add(btn2);
        add(lblResult);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();

        if (question.isCorrect(button.getText())) {
            lblResult.setText("Correct! You defeated the Code Boss!");
        } else {
            lblResult.setText("Wrong! Try Again!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            QuizBattleGUI quiz = new QuizBattleGUI();
            quiz.setVisible(true);
        });
    }
}
