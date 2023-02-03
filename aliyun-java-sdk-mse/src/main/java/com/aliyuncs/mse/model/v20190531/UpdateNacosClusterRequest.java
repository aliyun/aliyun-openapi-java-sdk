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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateNacosClusterRequest extends RpcAcsRequest<UpdateNacosClusterResponse> {
	   

	private String clusterName;

	private Integer checkPort;

	private String groupName;

	private String instanceId;

	private String namespaceId;

	private String healthChecker;

	private String acceptLanguage;

	private String serviceName;

	private Boolean useInstancePortForCheck;
	public UpdateNacosClusterRequest() {
		super("mse", "2019-05-31", "UpdateNacosCluster", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
		if(clusterName != null){
			putQueryParameter("ClusterName", clusterName);
		}
	}

	public Integer getCheckPort() {
		return this.checkPort;
	}

	public void setCheckPort(Integer checkPort) {
		this.checkPort = checkPort;
		if(checkPort != null){
			putQueryParameter("CheckPort", checkPort.toString());
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getNamespaceId() {
		return this.namespaceId;
	}

	public void setNamespaceId(String namespaceId) {
		this.namespaceId = namespaceId;
		if(namespaceId != null){
			putQueryParameter("NamespaceId", namespaceId);
		}
	}

	public String getHealthChecker() {
		return this.healthChecker;
	}

	public void setHealthChecker(String healthChecker) {
		this.healthChecker = healthChecker;
		if(healthChecker != null){
			putQueryParameter("HealthChecker", healthChecker);
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

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	public Boolean getUseInstancePortForCheck() {
		return this.useInstancePortForCheck;
	}

	public void setUseInstancePortForCheck(Boolean useInstancePortForCheck) {
		this.useInstancePortForCheck = useInstancePortForCheck;
		if(useInstancePortForCheck != null){
			putQueryParameter("UseInstancePortForCheck", useInstancePortForCheck.toString());
		}
	}

	@Override
	public Class<UpdateNacosClusterResponse> getResponseClass() {
		return UpdateNacosClusterResponse.class;
	}

}
