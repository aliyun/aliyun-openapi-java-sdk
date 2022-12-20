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

package com.aliyuncs.privatelink.model.v20200415;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.privatelink.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateVpcEndpointServiceRequest extends RpcAcsRequest<CreateVpcEndpointServiceResponse> {
	   

	private Boolean autoAcceptEnabled;

	private String clientToken;

	private String payer;

	private String resourceGroupId;

	private Boolean zoneAffinityEnabled;

	private List<Tag> tags;

	private Boolean dryRun;

	private List<Resource> resources;

	private String serviceResourceType;

	private Boolean serviceSupportIPv6;

	private String serviceDescription;
	public CreateVpcEndpointServiceRequest() {
		super("Privatelink", "2020-04-15", "CreateVpcEndpointService", "privatelink");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAutoAcceptEnabled() {
		return this.autoAcceptEnabled;
	}

	public void setAutoAcceptEnabled(Boolean autoAcceptEnabled) {
		this.autoAcceptEnabled = autoAcceptEnabled;
		if(autoAcceptEnabled != null){
			putQueryParameter("AutoAcceptEnabled", autoAcceptEnabled.toString());
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

	public String getPayer() {
		return this.payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
		if(payer != null){
			putQueryParameter("Payer", payer);
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

	public Boolean getZoneAffinityEnabled() {
		return this.zoneAffinityEnabled;
	}

	public void setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
		this.zoneAffinityEnabled = zoneAffinityEnabled;
		if(zoneAffinityEnabled != null){
			putQueryParameter("ZoneAffinityEnabled", zoneAffinityEnabled.toString());
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
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

	public List<Resource> getResources() {
		return this.resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;	
		if (resources != null) {
			for (int depth1 = 0; depth1 < resources.size(); depth1++) {
				putQueryParameter("Resource." + (depth1 + 1) + ".ResourceType" , resources.get(depth1).getResourceType());
				putQueryParameter("Resource." + (depth1 + 1) + ".ResourceId" , resources.get(depth1).getResourceId());
				putQueryParameter("Resource." + (depth1 + 1) + ".ZoneId" , resources.get(depth1).getZoneId());
			}
		}	
	}

	public String getServiceResourceType() {
		return this.serviceResourceType;
	}

	public void setServiceResourceType(String serviceResourceType) {
		this.serviceResourceType = serviceResourceType;
		if(serviceResourceType != null){
			putQueryParameter("ServiceResourceType", serviceResourceType);
		}
	}

	public Boolean getServiceSupportIPv6() {
		return this.serviceSupportIPv6;
	}

	public void setServiceSupportIPv6(Boolean serviceSupportIPv6) {
		this.serviceSupportIPv6 = serviceSupportIPv6;
		if(serviceSupportIPv6 != null){
			putQueryParameter("ServiceSupportIPv6", serviceSupportIPv6.toString());
		}
	}

	public String getServiceDescription() {
		return this.serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
		if(serviceDescription != null){
			putQueryParameter("ServiceDescription", serviceDescription);
		}
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class Resource {

		private String resourceType;

		private String resourceId;

		private String zoneId;

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}
	}

	@Override
	public Class<CreateVpcEndpointServiceResponse> getResponseClass() {
		return CreateVpcEndpointServiceResponse.class;
	}

}
