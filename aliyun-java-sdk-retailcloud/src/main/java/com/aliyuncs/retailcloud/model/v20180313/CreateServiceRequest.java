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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.retailcloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateServiceRequest extends RpcAcsRequest<CreateServiceResponse> {
	   

	private Boolean headless;

	private String serviceType;

	private String k8sServiceId;

	private String name;

	private List<PortMappings> portMappingss;

	private Long envId;
	public CreateServiceRequest() {
		super("retailcloud", "2018-03-13", "CreateService", "retailcloud");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getHeadless() {
		return this.headless;
	}

	public void setHeadless(Boolean headless) {
		this.headless = headless;
		if(headless != null){
			putQueryParameter("Headless", headless.toString());
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

	public String getK8sServiceId() {
		return this.k8sServiceId;
	}

	public void setK8sServiceId(String k8sServiceId) {
		this.k8sServiceId = k8sServiceId;
		if(k8sServiceId != null){
			putQueryParameter("K8sServiceId", k8sServiceId);
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

	public List<PortMappings> getPortMappingss() {
		return this.portMappingss;
	}

	public void setPortMappingss(List<PortMappings> portMappingss) {
		this.portMappingss = portMappingss;	
		if (portMappingss != null) {
			for (int depth1 = 0; depth1 < portMappingss.size(); depth1++) {
				putBodyParameter("PortMappings." + (depth1 + 1) + ".Protocol" , portMappingss.get(depth1).getBizProtocol());
				putBodyParameter("PortMappings." + (depth1 + 1) + ".Port" , portMappingss.get(depth1).getPort());
				putBodyParameter("PortMappings." + (depth1 + 1) + ".Name" , portMappingss.get(depth1).getName());
				putBodyParameter("PortMappings." + (depth1 + 1) + ".NodePort" , portMappingss.get(depth1).getNodePort());
				putBodyParameter("PortMappings." + (depth1 + 1) + ".TargetPort" , portMappingss.get(depth1).getTargetPort());
			}
		}	
	}

	public Long getEnvId() {
		return this.envId;
	}

	public void setEnvId(Long envId) {
		this.envId = envId;
		if(envId != null){
			putQueryParameter("EnvId", envId.toString());
		}
	}

	public static class PortMappings {

		private String protocol;

		private Integer port;

		private String name;

		private Integer nodePort;

		private String targetPort;

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getNodePort() {
			return this.nodePort;
		}

		public void setNodePort(Integer nodePort) {
			this.nodePort = nodePort;
		}

		public String getTargetPort() {
			return this.targetPort;
		}

		public void setTargetPort(String targetPort) {
			this.targetPort = targetPort;
		}
	}

	@Override
	public Class<CreateServiceResponse> getResponseClass() {
		return CreateServiceResponse.class;
	}

}
