package spittr;

import java.util.Date;

/**
 * @author yp
 * @description
 * @date 2017/12/16 19:25
 */
public class Spittle {
    private final Long id;
    private final String message;
    private final Date time;
    private Double latitude;
    private  Double longitude;

    public Spittle(String message,Date time){
        this(message,time,null,null);
    }

    public Spittle(String message,Date time,Double longitude,Double latitude){
        this.id=null;
        this.message=message;
        this.time=time;
        this.longitude= longitude;
        this.latitude=latitude;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Spittle spittle = (Spittle) o;

        if (id != null ? !id.equals(spittle.id) : spittle.id != null) return false;
        return time != null ? time.equals(spittle.time) : spittle.time == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
