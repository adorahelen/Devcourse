package self.studyJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreadQuiz {
    private static final int TIME_LIMIT = 10;
    private static final String CORRECT_ANSWER = "Object";

    public static void main(String[] args) {
        JFrame frame = new JFrame("Thread Quiz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        JLabel questionLabel = new JLabel("자바의 최상위 클래스의 이름은? (제한 시간: " + TIME_LIMIT + "초)");
        JTextField answerField = new JTextField(20);
        JButton submitButton = new JButton("확인");
        JButton cancelButton = new JButton("취소");

        frame.add(questionLabel);
        frame.add(answerField);
        frame.add(submitButton);
        frame.add(cancelButton);

        TimerThread timerThread = new TimerThread(questionLabel, frame);
        timerThread.start();

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == submitButton) {
                    String userAnswer = answerField.getText();
                    timerThread.interrupt();
                    showResult(userAnswer, frame);
                } else if (e.getSource() == cancelButton) {
                    timerThread.interrupt();
                    JOptionPane.showMessageDialog(frame, "실행이 취소되었습니다.", "메시지", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
            }
        };

        submitButton.addActionListener(actionListener);
        cancelButton.addActionListener(actionListener);

        frame.setVisible(true);
    }

    private static void showResult(String userAnswer, JFrame frame) {
        String message;
        if (CORRECT_ANSWER.equalsIgnoreCase(userAnswer)) {
            message = "정답입니다!\n입력: " + userAnswer + "\n정답: " + CORRECT_ANSWER;
        } else {
            message = "오답입니다!\n입력: " + userAnswer + "\n정답: " + CORRECT_ANSWER;
        }
        JOptionPane.showMessageDialog(frame, message, "메시지", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    static class TimerThread extends Thread {
        private JLabel label;
        private JFrame frame;

        TimerThread(JLabel label, JFrame frame) {
            this.label = label;
            this.frame = frame;
        }

        @Override
        public void run() {
            try {
                for (int i = TIME_LIMIT; i >= 0; i--) {
                    label.setText("자바의 최상위 클래스의 이름은? (남은 시간: " + i + "초)");
                    Thread.sleep(1000);
                }
                JOptionPane.showMessageDialog(frame, "- 제한 시간 종료 -\n정답: 자바의 최상위 클래스는 Object", "메시지", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } catch (InterruptedException e) {
                // 스레드가 인터럽트된 경우 아무 작업도 하지 않음
            }
        }
    }
}