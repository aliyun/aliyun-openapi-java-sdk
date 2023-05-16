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
	   

	private Commodity commodity;

	private String contactGroup;

	private String clientToken;

	private String specificationCode;

	private String resourceGroupId;

	private Boolean enableInstanceOps;

	private String templateName;

	private List<Tag> tags;

	private Boolean dryRun;

	private Boolean enableUserPrometheus;

	private String specificationName;

	private String trialType;

	private String name;

	private String serviceVersion;

	private String serviceId;

	private String parameters;

	private Long payType;

	private OperationMetadata operationMetadata;
	public CreateServiceInstanceRequest() {
		super("ComputeNest", "2021-06-01", "CreateServiceInstance", "computenest");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Commodity getCommodity() {
		return this.commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;	
		if (commodity != null) {
			
				putQueryParameter("Commodity.PayPeriod" , commodity.getPayPeriod());
				putQueryParameter("Commodity.PayPeriodUnit" , commodity.getPayPeriodUnit());
		}	
	}

	public String getContactGroup() {
		return this.contactGroup;
	}

	public void setContactGroup(String contactGroup) {
		this.contactGroup = contactGroup;
		if(contactGroup != null){
			putQueryParameter("ContactGroup", contactGroup);
		}
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

	public String getSpecificationCode() {
		return this.specificationCode;
	}

	public void setSpecificationCode(String specificationCode) {
		this.specificationCode = specificationCode;
		if(specificationCode != null){
			putQueryParameter("SpecificationCode", specificationCode);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public Boolean getEnableUserPrometheus() {
		return this.enableUserPrometheus;
	}

	public void setEnableUserPrometheus(Boolean enableUserPrometheus) {
		this.enableUserPrometheus = enableUserPrometheus;
		if(enableUserPrometheus != null){
			putQueryParameter("EnableUserPrometheus", enableUserPrometheus.toString());
		}
	}

	public String getSpecificationName() {
		return this.specificationName;
	}

	public void setSpecificationName(String specificationName) {
		this.specificationName = specificationName;
		if(specificationName != null){
			putQueryParameter("SpecificationName", specificationName);
		}
	}

	public String getTrialType() {
		return this.trialType;
	}

	public void setTrialType(String trialType) {
		this.trialType = trialType;
		if(trialType != null){
			putQueryParameter("TrialType", trialType);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public Long getPayType() {
		return this.payType;
	}

	public void setPayType(Long payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType.toString());
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
				putQueryParameter("OperationMetadata.ExtraInfo" , operationMetadata.getExtraInfo());
				putQueryParameter("OperationMetadata.ServiceInstanceId" , operationMetadata.getServiceInstanceId());
		}	
	}

	public static class Commodity {

		private Long payPeriod;

		private String payPeriodUnit;

		public Long getPayPeriod() {
			return this.payPeriod;
		}

		public void setPayPeriod(Long payPeriod) {
			this.payPeriod = payPeriod;
		}

		public String getPayPeriodUnit() {
			return this.payPeriodUnit;
		}

		public void setPayPeriodUnit(String payPeriodUnit) {
			this.payPeriodUnit = payPeriodUnit;
		}
	}

	public static class Tag {

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

		private String extraInfo;

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

		public String getExtraInfo() {
			return this.extraInfo;
		}

		public void setExtraInfo(String extraInfo) {
			this.extraInfo = extraInfo;
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
