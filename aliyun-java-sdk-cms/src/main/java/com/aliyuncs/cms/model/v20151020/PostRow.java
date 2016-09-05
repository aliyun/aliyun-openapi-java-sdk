package com.aliyuncs.cms.model.v20151020;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by fray.yangb-然诺 on 16/4/21.
 */
public class PostRow implements Serializable {

    private static final long serialVersionUID = -8953520797839908329L;
    private String project;
    private String metricName;
    private Long timestamp = System.currentTimeMillis();
    private Map<String, Number> metricValues = new HashMap<String, Number>();
    private Map<String, String> dimensions = new HashMap<String, String>();

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Map<String, Number> getMetricValues() {
        return metricValues;
    }

    public void setMetricValues(Map<String, Number> metricValues) {
        this.metricValues = metricValues;
    }
    public void putMetricValue(String metric, Number value){
        this.metricValues.put(metric, value);
    }

    public Map<String, String> getDimensions() {
        return dimensions;
    }

    public void setDimensions(Map<String, String> dimensions) {
        this.dimensions = dimensions;
    }
    public void putDimension(String key, String value){
        this.dimensions.put(key, value);
    }
}
