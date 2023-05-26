import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PostFrame {
    private JFrame frame;
    private JPanel panel;
    private JLabel titleLabel;
    private JTextField titleText;
    private JLabel contentLabel;
    private JTextArea contentArea;
    private JButton postBtn;
    private JButton homeBtn;
    private JButton clearBtn;
    private JScrollPane scrollPane;

    public PostFrame(){
        createFrame();
        createPanel();
        createTitle();
        createContent();
        createPost();
        createBack();
        createClear();

        panel.add(titleLabel);
        panel.add(titleText);
        panel.add(contentLabel);
        panel.add(contentArea);
        panel.add(postBtn);
        panel.add(homeBtn);
        panel.add(clearBtn);

        frame.add(panel);
    }

    public void createFrame(){
        frame = new JFrame();
        frame.setTitle("Post");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Post");
        frame.setLocationRelativeTo(null);
    }

    public void createPanel() {
        panel = new JPanel();
        panel.setLayout(null);
    }

    public void createTitle(){
        titleLabel = new JLabel();
        titleLabel.setText("Title");
        titleLabel.setBounds(100, 50, 115, 40);
        titleLabel.setForeground(Color.black);
        titleLabel.setFont(new Font("Noteworthy", Font.BOLD, 22));

        titleText = new JTextField();
        titleText.setBounds(230, 50, 230, 40);
        titleText.setBackground(new Color(254,254,247));
        titleText.setForeground(Color.BLACK);
        titleText.setCaretColor(Color.BLACK);
        titleText.setFont(new Font("STXingKai", Font.BOLD, 20));
        titleText.setBorder(BorderFactory.createLineBorder(new Color(40, 42, 50)));
    }

    public void createContent(){
        contentLabel = new JLabel();
        contentLabel.setText("Contnet");
        contentLabel.setBounds(100, 100, 115, 40);
        contentLabel.setForeground(Color.black);
        contentLabel.setFont(new Font("Noteworthy", Font.BOLD, 22));

        contentArea = new JTextArea();
        contentArea.setBounds(230, 100, 230, 350);
        contentArea.setBackground( new Color(254,254,247));
        contentArea.setForeground(Color.BLACK);
        contentArea.setCaretColor((Color.BLACK));
        contentArea.setFont(new Font("STXingKai", Font.BOLD, 20));
        contentArea.setBorder(BorderFactory.createLineBorder(new Color(40, 42, 50)));
        contentArea.setLineWrap(true);
        contentArea.setWrapStyleWord(true);
        scrollPane = new JScrollPane(contentArea);

    }

    public void createPost(){
        postBtn = new JButton();
        postBtn.setText("Post");
        postBtn.setBounds(100, 500, 50, 30);
        postBtn.setFont(new Font("Noteworthy", Font.BOLD, 15));
        postBtn.setBackground(Color.white);
        postBtn.setForeground(new Color(0, 0, 205));
        postBtn.setBorder(BorderFactory.createLineBorder(new Color(205, 205, 206)));
        postBtn.setFocusable(false);
        postBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Send title and content to DB and post to the HomeFrame
            
            }
        });
    }

    public void createBack(){
        homeBtn = new JButton();
        homeBtn.setText("Home");
        homeBtn.setBounds(230, 500, 50, 30);
        homeBtn.setFont(new Font("Noteworthy", Font.BOLD, 15));
        homeBtn.setBackground(Color.white);
        homeBtn.setForeground(new Color(0, 0, 205));
        homeBtn.setBorder(BorderFactory.createLineBorder(new Color(205, 205, 206)));
        homeBtn.setFocusable(false);
        homeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                // Back to HomeFrame
            }
        });
    }
    public void createClear(){
        clearBtn = new JButton();
        clearBtn.setText("Clear");
        clearBtn.setBounds(360, 500, 50, 30);
        clearBtn.setFont(new Font("Noteworthy", Font.BOLD, 15));
        clearBtn.setBackground(Color.white);
        clearBtn.setForeground(new Color(0, 0, 205));
        clearBtn.setBorder(BorderFactory.createLineBorder(new Color(205, 205, 206)));
        clearBtn.setFocusable(false);
        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                titleText.setText(null);
                contentArea.setText(null);
            }
        });
    }

}