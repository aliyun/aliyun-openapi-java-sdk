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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ImportServicesRequest extends RpcAcsRequest<ImportServicesResponse> {
	   

	private String sourceId;

	private String gatewayUniqueId;

	@SerializedName("serviceList")
	private List<ServiceList> serviceList;

	private String acceptLanguage;

	private String sourceType;
	public ImportServicesRequest() {
		super("mse", "2019-05-31", "ImportServices", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
		if(sourceId != null){
			putQueryParameter("SourceId", sourceId);
		}
	}

	public String getGatewayUniqueId() {
		return this.gatewayUniqueId;
	}

	public void setGatewayUniqueId(String gatewayUniqueId) {
		this.gatewayUniqueId = gatewayUniqueId;
		if(gatewayUniqueId != null){
			putQueryParameter("GatewayUniqueId", gatewayUniqueId);
		}
	}

	public List<ServiceList> getServiceList() {
		return this.serviceList;
	}

	public void setServiceList(List<ServiceList> serviceList) {
		this.serviceList = serviceList;	
		if (serviceList != null) {
			putQueryParameter("ServiceList" , new Gson().toJson(serviceList));
		}	
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
		}
	}

	public static class ServiceList {

		@SerializedName("ServiceProtocol")
		private String serviceProtocol;

		@SerializedName("Name")
		private String name;

		@SerializedName("Namespace")
		private String namespace;

		@SerializedName("GroupName")
		private String groupName;

		@SerializedName("Ips")
		private List<String> ips;

		@SerializedName("ServicePort")
		private Long servicePort;

		public String getServiceProtocol() {
			return this.serviceProtocol;
		}

		public void setServiceProtocol(String serviceProtocol) {
			this.serviceProtocol = serviceProtocol;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public List<String> getIps() {
			return this.ips;
		}

		public void setIps(List<String> ips) {
			this.ips = ips;
		}

		public Long getServicePort() {
			return this.servicePort;
		}

		public void setServicePort(Long servicePort) {
			this.servicePort = servicePort;
		}
	}

	@Override
	public Class<ImportServicesResponse> getResponseClass() {
		return ImportServicesResponse.class;
	}

}
