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

package com.aliyuncs.computenestsupplier.model.v20210521;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.computenestsupplier.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateServiceRequest extends RpcAcsRequest<CreateServiceResponse> {
	   

	private String clientToken;

	private String policyNames;

	private Long duration;

	private String supplierUrl;

	private String deployMetadata;

	private String supplierName;

	private String serviceType;

	private Boolean isSupportOperated;

	private List<RequestTags> requestTagss;

	private List<ServiceInfo> serviceInfos;

	private String serviceId;

	private String deployType;
	public CreateServiceRequest() {
		super("ComputeNestSupplier", "2021-05-21", "CreateService");
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

	public String getPolicyNames() {
		return this.policyNames;
	}

	public void setPolicyNames(String policyNames) {
		this.policyNames = policyNames;
		if(policyNames != null){
			putQueryParameter("PolicyNames", policyNames);
		}
	}

	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration.toString());
		}
	}

	public String getSupplierUrl() {
		return this.supplierUrl;
	}

	public void setSupplierUrl(String supplierUrl) {
		this.supplierUrl = supplierUrl;
		if(supplierUrl != null){
			putQueryParameter("SupplierUrl", supplierUrl);
		}
	}

	public String getDeployMetadata() {
		return this.deployMetadata;
	}

	public void setDeployMetadata(String deployMetadata) {
		this.deployMetadata = deployMetadata;
		if(deployMetadata != null){
			putQueryParameter("DeployMetadata", deployMetadata);
		}
	}

	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
		if(supplierName != null){
			putQueryParameter("SupplierName", supplierName);
		}
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
		if(serviceType != null){
			putQueryParameter("ServiceType", serviceType);
		}
	}

	public Boolean getIsSupportOperated() {
		return this.isSupportOperated;
	}

	public void setIsSupportOperated(Boolean isSupportOperated) {
		this.isSupportOperated = isSupportOperated;
		if(isSupportOperated != null){
			putQueryParameter("IsSupportOperated", isSupportOperated.toString());
		}
	}

	public List<RequestTags> getRequestTagss() {
		return this.requestTagss;
	}

	public void setRequestTagss(List<RequestTags> requestTagss) {
		this.requestTagss = requestTagss;	
		if (requestTagss != null) {
			for (int depth1 = 0; depth1 < requestTagss.size(); depth1++) {
				putQueryParameter("RequestTags." + (depth1 + 1) + ".Value" , requestTagss.get(depth1).getValue());
				putQueryParameter("RequestTags." + (depth1 + 1) + ".Key" , requestTagss.get(depth1).getKey());
			}
		}	
	}

	public List<ServiceInfo> getServiceInfos() {
		return this.serviceInfos;
	}

	public void setServiceInfos(List<ServiceInfo> serviceInfos) {
		this.serviceInfos = serviceInfos;	
		if (serviceInfos != null) {
			for (int depth1 = 0; depth1 < serviceInfos.size(); depth1++) {
				putQueryParameter("ServiceInfo." + (depth1 + 1) + ".ShortDescription" , serviceInfos.get(depth1).getShortDescription());
				putQueryParameter("ServiceInfo." + (depth1 + 1) + ".Image" , serviceInfos.get(depth1).getImage());
				putQueryParameter("ServiceInfo." + (depth1 + 1) + ".Name" , serviceInfos.get(depth1).getName());
				putQueryParameter("ServiceInfo." + (depth1 + 1) + ".Locale" , serviceInfos.get(depth1).getLocale());
			}
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

	public String getDeployType() {
		return this.deployType;
	}

	public void setDeployType(String deployType) {
		this.deployType = deployType;
		if(deployType != null){
			putQueryParameter("DeployType", deployType);
		}
	}

	public static class RequestTags {

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

	public static class ServiceInfo {

		private String shortDescription;

		private String image;

		private String name;

		private String locale;

		public String getShortDescription() {
			return this.shortDescription;
		}

		public void setShortDescription(String shortDescription) {
			this.shortDescription = shortDescription;
		}

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocale() {
			return this.locale;
		}

		public void setLocale(String locale) {
			this.locale = locale;
		}
	}

	@Override
	public Class<CreateServiceResponse> getResponseClass() {
		return CreateServiceResponse.class;
	}

}
