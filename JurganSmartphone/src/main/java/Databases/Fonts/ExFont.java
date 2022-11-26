package Databases.Fonts;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

public class ExFont {
    private final Font fOmegle;
    private final Font fBaxoe;
    private final Font Icons;
    
    public ExFont() throws IOException, FontFormatException {
        this.fOmegle = Font.createFont(Font.TRUETYPE_FONT, new File("src/main/java/Databases/Fonts/OMEGLE.ttf"));
        this.fBaxoe = Font.createFont(Font.TRUETYPE_FONT, new File("src/main/java/Databases/Fonts/Baxoe.ttf"));
        this.Icons = Font.createFont(Font.TRUETYPE_FONT, new File("src/main/java/Databases/Fonts/Icons.ttf"));
    
    }
    
    public Font getOmegle(float size) {
        return fOmegle.deriveFont(size);
    }
    
    public Font getBaxoe(float size) {
        return fBaxoe.deriveFont(size);
    }
    
    public Font getIcons(float size) {
        return Icons.deriveFont(size);
    }
    
}
