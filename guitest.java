import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class guitest {
    public static void main(String[] args) {
        JTextArea textArea = new JTextArea(20, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        StringBuilder output = new StringBuilder();

        output.append("Welcome to my simple gui made in java!").append("\n");
        textArea.setText(output.toString());
        
        JOptionPane.showMessageDialog(null, scrollPane, "Simple GUI In Java", JOptionPane.INFORMATION_MESSAGE);
    }
}