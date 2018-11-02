package com.aliyuncs.batchcompute.pojo.v20151111;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by guangchun.luo on 16/3/2.
 */
@JsonIgnoreProperties(ignoreUnknown = true) @JsonInclude(JsonInclude.Include.NON_DEFAULT)
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
