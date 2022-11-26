/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Databases;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author user
 */
public class KonfFont {
    private final Font fAwesome;
    private final Font fBaxoe;
    private final Font fOmegle;
    
    public KonfFont() throws IOException, FontFormatException {
        this.fAwesome = Font.createFont(Font.TRUETYPE_FONT, new File("src/main/java/Databases/Fonts/Font Awesome 5 Free-Solid-900.ttf"));
        this.fBaxoe = Font.createFont(Font.TRUETYPE_FONT, new File("src/main/java/Databases/Fonts/Baxoe.ttf"));
        this.fOmegle = Font.createFont(Font.TRUETYPE_FONT, new File("src/main/java/Databases/Fonts/OMEGLE.ttf"));
    }
    
    public Font getAwesome(float size) {
        return fAwesome.deriveFont(size);
    }
    
    public Font getBaxoe(float size) {
        return fBaxoe.deriveFont(size);
    }
    
    public Font getOmegle(float size) {
        return fOmegle.deriveFont(size);
    }
}
