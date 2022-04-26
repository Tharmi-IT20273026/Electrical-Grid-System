import java.util.Date;


public class LocalSubstation {

    private Integer id;
    private String substaionCode;
    private String active;
    private String activeFrom;
    private String activeTo;

    public LocalSubstation(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubstaionCode() {
        return substaionCode;
    }

    public void setSubstaionCode(String substaionCode) {
        this.substaionCode = substaionCode;
    }


    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getActiveFrom() {
        return activeFrom;
    }

    public void setActiveFrom(String activeFrom) {
        this.activeFrom = activeFrom;
    }

    public String getActiveTo() {
        return activeTo;
    }

    public void setActiveTo(String activeTo) {
        this.activeTo = activeTo;
    }

    @Override
    public String toString() {
        return "LocalSubstation{" +
                "id=" + id +
                ", substaionCode='" + substaionCode + '\'' +
                ", active='" + active + '\'' +
                ", activeFrom='" + activeFrom + '\'' +
                ", activeTo='" + activeTo + '\'' +
                '}';
    }
}
