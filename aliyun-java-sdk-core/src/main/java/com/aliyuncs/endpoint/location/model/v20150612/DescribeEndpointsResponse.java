package com.aliyuncs.endpoint.location.model.v20150612;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.endpoint.location.transform.v20150612.DescribeEndpointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

public class DescribeEndpointsResponse extends AcsResponse {

    private String requestId;

    private Boolean success;

    private List<Endpoint> endpoints;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<Endpoint> getEndpoints() {
        return this.endpoints;
    }

    public void setEndpoints(List<Endpoint> endpoints) {
        this.endpoints = endpoints;
    }

    public static class Endpoint {

        private String endpoint;

        private String id;

        private String namespace;

        private String serivceCode;

        private String type;

        private List<String> protocols;

        public String getEndpoint() {
            return this.endpoint;
        }

        public void setEndpoint(String endpoint) {
            this.endpoint = endpoint;
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNamespace() {
            return this.namespace;
        }

        public void setNamespace(String namespace) {
            this.namespace = namespace;
        }

        public String getSerivceCode() {
            return this.serivceCode;
        }

        public void setSerivceCode(String serivceCode) {
            this.serivceCode = serivceCode;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<String> getProtocols() {
            return this.protocols;
        }

        public void setProtocols(List<String> protocols) {
            this.protocols = protocols;
        }
    }

    @Override
    public DescribeEndpointsResponse getInstance(UnmarshallerContext context) {
        return DescribeEndpointsResponseUnmarshaller.unmarshall(this, context);
    }
}
