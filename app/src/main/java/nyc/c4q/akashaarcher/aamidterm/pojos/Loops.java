package nyc.c4q.akashaarcher.aamidterm.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by akashaarcher on 12/10/16.
 */

public class Loops {


    @SerializedName("count")
    @Expose
    private Double count;
    @SerializedName("velocity")
    @Expose
    private Double velocity;
    @SerializedName("onFire")
    @Expose
    private Integer onFire;

    /**
     *
     * @return
     * The count
     */
    public Double getCount() {
        return count;
    }

    /**
     *
     * @param count
     * The count
     */
    public void setCount(Double count) {
        this.count = count;
    }

    /**
     *
     * @return
     * The velocity
     */
    public Double getVelocity() {
        return velocity;
    }

    /**
     *
     * @param velocity
     * The velocity
     */
    public void setVelocity(Double velocity) {
        this.velocity = velocity;
    }

    /**
     *
     * @return
     * The onFire
     */
    public Integer getOnFire() {
        return onFire;
    }

    /**
     *
     * @param onFire
     * The onFire
     */
    public void setOnFire(Integer onFire) {
        this.onFire = onFire;
    }




}
