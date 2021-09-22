/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.computenest.model.v20210601;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.computenest.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateServiceInstanceRequest extends RpcAcsRequest<CreateServiceInstanceResponse> {
	   

	private String clientToken;

	private Boolean enableInstanceOps;

	private String templateName;

	private List<RequestTag> requestTags;

	private String serviceVersion;

	private Boolean enableAccountOps;

	private String serviceId;

	private String parameters;

	private OperationMetadata operationMetadata;
	public CreateServiceInstanceRequest() {
		super("ComputeNest", "2021-06-01", "CreateServiceInstance");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Boolean getEnableInstanceOps() {
		return this.enableInstanceOps;
	}

	public void setEnableInstanceOps(Boolean enableInstanceOps) {
		this.enableInstanceOps = enableInstanceOps;
		if(enableInstanceOps != null){
			putQueryParameter("EnableInstanceOps", enableInstanceOps.toString());
		}
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putQueryParameter("TemplateName", templateName);
		}
	}

	public List<RequestTag> getRequestTags() {
		return this.requestTags;
	}

	public void setRequestTags(List<RequestTag> requestTags) {
		this.requestTags = requestTags;	
		if (requestTags != null) {
			for (int depth1 = 0; depth1 < requestTags.size(); depth1++) {
				putQueryParameter("RequestTag." + (depth1 + 1) + ".Value" , requestTags.get(depth1).getValue());
				putQueryParameter("RequestTag." + (depth1 + 1) + ".Key" , requestTags.get(depth1).getKey());
			}
		}	
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
		if(serviceVersion != null){
			putQueryParameter("ServiceVersion", serviceVersion);
		}
	}

	public Boolean getEnableAccountOps() {
		return this.enableAccountOps;
	}

	public void setEnableAccountOps(Boolean enableAccountOps) {
		this.enableAccountOps = enableAccountOps;
		if(enableAccountOps != null){
			putQueryParameter("EnableAccountOps", enableAccountOps.toString());
		}
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putQueryParameter("ServiceId", serviceId);
		}
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
		if(parameters != null){
			putQueryParameter("Parameters", parameters);
		}
	}

	public OperationMetadata getOperationMetadata() {
		return this.operationMetadata;
	}

	public void setOperationMetadata(OperationMetadata operationMetadata) {
		this.operationMetadata = operationMetadata;	
		if (operationMetadata != null) {
			
				putQueryParameter("OperationMetadata.EndTime" , operationMetadata.getEndTime());
				putQueryParameter("OperationMetadata.Resources" , operationMetadata.getResources());
				putQueryParameter("OperationMetadata.StartTime" , operationMetadata.getStartTime());
				putQueryParameter("OperationMetadata.ServiceInstanceId" , operationMetadata.getServiceInstanceId());
		}	
	}

	public static class RequestTag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	public static class OperationMetadata {

		private String endTime;

		private String resources;

		private String startTime;

		private String serviceInstanceId;

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getResources() {
			return this.resources;
		}

		public void setResources(String resources) {
			this.resources = resources;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getServiceInstanceId() {
			return this.serviceInstanceId;
		}

		public void setServiceInstanceId(String serviceInstanceId) {
			this.serviceInstanceId = serviceInstanceId;
		}
	}

	@Override
	public Class<CreateServiceInstanceResponse> getResponseClass() {
		return CreateServiceInstanceResponse.class;
	}

}
