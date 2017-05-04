package com.aliyuncs.batchcompute.pojo.v20151111;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by guangchun.luo on 16/3/2.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Networks {

    @JsonIgnore
    public ClassicNetWork getClassic() {
        return classic;
    }

    @JsonIgnore
    public void setClassic(ClassicNetWork classic) {
        this.classic = classic;
    }

    @JsonProperty("Classic")
    private ClassicNetWork classic;


    public VPC getVpc() {
        return vpc;
    }

    public void setVpc(VPC vpc) {
        this.vpc = vpc;
    }

    @JsonProperty("VPC")
    private VPC vpc;


}
