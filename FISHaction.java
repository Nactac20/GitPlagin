import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import java.awt.Desktop;
import java.net.URI;

public class FISHaction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e) {
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(new URI("https://youtu.be/gnzYZ_6RmgA?si=bIdke7JsvbE2ei1o"));
            }
        } catch (Exception ex) {
            Messages.showMessageDialog("Error opening link", "Error", Messages.getErrorIcon());
        }
    }
}
