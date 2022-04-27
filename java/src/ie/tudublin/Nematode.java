package ie.tudublin;

import processing.data.TableRow;
import processing.core.PApplet;

public class Nematode {
    private String name;
    private float size;
    private float limbs;
    private String gender;
    private boolean eyes;

    

    @Override
    public String toString() {
        return "Nematode [eyes=" + eyes + ", gender=" + gender + ", limbs=" + limbs + ", name=" + name + ", size="
                + size + "]";
    }

    public Nematode(TableRow r)
    {
        this(
            r.getString("name"),
            r.getFloat("length"),
            r.getFloat("limbs"),
            r.getString("gender"),
            r.getInt("eyes") == 1
        );
    }

    public Nematode(String name, float size, float limbs, String gender, boolean eyes) {
        this.name = name;
        this.size = size;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getSize() {
        return size;
    }
    public void setSize(float size) {
        this.size = size;
    }
    public float getLimbs() {
        return limbs;
    }
    public void setLimbs(float limbs) {
        this.limbs = limbs;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public boolean isEyes() {
        return eyes;
    }
    public void setEyes(boolean eyes) {
        this.eyes = eyes;
    }

    public void render(NematodeVisualiser pa)
    {
        float Size = 50;

        for(int i = 0; i > Size;i++)
        {
            pa.stroke(255);
            pa.noFill();
            pa.circle(Size, pa.height/2, pa.width/2);
        }
        
        // pa.fill(255);
        // pa.textSize(40);
        pa.text(name, 100, 100);

    }
}