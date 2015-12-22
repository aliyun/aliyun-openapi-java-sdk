package com.aliyuncs.batchcompute.pojo.v20151111;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by guangchun.luo on 15/12/7.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarkableResult<T> {

    @JsonProperty("NextMarker")
    private String nextMarker;

    @JsonProperty("Items")
    private List<T> items;


    @JsonIgnore
    public String getNextMarker() {
        return nextMarker;
    }

    @JsonIgnore
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    @JsonIgnore
    public List<T> getItems() {
        return items;
    }

    @JsonIgnore
    public void setItems(List<T> items) {
        this.items = items;
    }


}
