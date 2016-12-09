package com.aliyuncs.batchcompute.pojo.v20151111;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by guangchun.luo on 16/12/1.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Notification {

    @JsonIgnore
    public Topic getTopic() {
        return topic;
    }

    @JsonIgnore
    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    @JsonProperty("Topic")
    private Topic topic;
}
