package the.kis.devs.api.util;

import com.kisman.cc.util.Colour;

import java.awt.*;

/**
 * Shadow class
 *
 * @author _kisman_
 * @since 23:54 of 15.06.2022
 */
@SuppressWarnings("unused")
public class ColourAPI extends Colour {
    public ColourAPI(float[] hsb) {super(hsb);}
    public ColourAPI() {}
    public ColourAPI(int r, int g, int b, int a) {super(r, g, b, a);}
    public ColourAPI(double r, double g, double b, double a) {super(r, g, b, a);}
    public ColourAPI(int r, int g, int b) {super(r, g, b);}
    public ColourAPI(Colour color, int a) {super(color, a);}
    public ColourAPI(Color color, float a) {super(color, a);}
    public ColourAPI(float r, float g, float b) {super(r, g, b);}
    public ColourAPI(float r, float g, float b, float a) {super(r, g, b, a);}
    public ColourAPI(int color) {super(color);}
    public ColourAPI(Color color) {super(color);}
}
