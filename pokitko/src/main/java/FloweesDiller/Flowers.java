package FloweesDiller;

/**
 * Basic
 */
public class Flowers {
    private String type;
    private String colour;
    private Double price;
    private Double length;
    private String season;
    private Integer buttonCount;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Integer getButtonCount() {
        return buttonCount;
    }

    public void setButtonCount(Integer buttonCount) {
        this.buttonCount = buttonCount;
    }
    public void resizeLength(Double newLength){
        length = newLength;
    }
}
