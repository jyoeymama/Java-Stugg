import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;

public class gui {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(null,
                "Welcome to CommandX!\nA simple tool to make your terminal better.\nWhat's your username?",
                "CommandX Setup",
                JOptionPane.QUESTION_MESSAGE);

        if (name != null && !name.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Hello, " + name + "! Let's make your terminal experience a bit better!",
                    "CommandX",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No name provided. Proceeding as guest.",
                    "CommandX",
                    JOptionPane.WARNING_MESSAGE);
        }

        File currentDir = new File(System.getProperty("user.dir"));

        while (true) {
            Object[] options = {"List files", "Show processes", "Change directory", "Ip Information", "Ping", "Exit"};
            int choice = JOptionPane.showOptionDialog(null,
                    "Current directory: " + currentDir.getAbsolutePath() + "\nChoose a command:",
                    "CommandX Commands",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]);

            try {
                ProcessBuilder pb = null;

                if (choice == 0) { // List files
                    pb = new ProcessBuilder("powershell.exe", "Get-ChildItem");
                    pb.directory(currentDir);
                } else if (choice == 1) { // Show processes
                    pb = new ProcessBuilder("powershell.exe", "Get-Process");
                } else if (choice == 2) { // Change directory
                    String newDir = JOptionPane.showInputDialog("Enter new directory path:");
                    if (newDir != null && !newDir.trim().isEmpty()) {
                        File dir = new File(newDir);
                        if (dir.exists() && dir.isDirectory()) {
                            currentDir = dir;
                            JOptionPane.showMessageDialog(null,
                                    "Directory changed to: " + currentDir.getAbsolutePath(),
                                    "CommandX",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Directory does not exist!",
                                    "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    continue; // Skip to next iteration for directory change
                } else if (choice == 3) { // IP Information
                    pb = new ProcessBuilder("cmd.exe", "/c", "ipconfig");
                } else if (choice == 4) { // Ping
                    String ip = JOptionPane.showInputDialog("Enter IP address or domain to ping:");
                    if (ip != null && !ip.trim().isEmpty()) {
                        pb = new ProcessBuilder("cmd.exe", "/c", "ping", ip);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "No IP address or domain provided!",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                        continue; // Skip to next iteration if no input
                    }
                } else { // Exit (choice == 5 or dialog closed)
                    JOptionPane.showMessageDialog(null,
                            "Exiting CommandX. Goodbye!",
                            "CommandX",
                            JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }

                // Execute the command if pb is not null
                if (pb != null) {
                    Process process = pb.start();
                    BufferedReader reader = new BufferedReader(
                            new InputStreamReader(process.getInputStream()));
                    StringBuilder output = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        output.append(line).append("\n");
                    }
                    process.waitFor();

                    // Display the output
                    JTextArea textArea = new JTextArea(output.toString());
                    textArea.setEditable(false);
                    JScrollPane scrollPane = new JScrollPane(textArea);
                    scrollPane.setPreferredSize(new java.awt.Dimension(600, 400));
                    JOptionPane.showMessageDialog(null, scrollPane, "Command Output",
                            JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,
                        "An error occurred: " + e.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
