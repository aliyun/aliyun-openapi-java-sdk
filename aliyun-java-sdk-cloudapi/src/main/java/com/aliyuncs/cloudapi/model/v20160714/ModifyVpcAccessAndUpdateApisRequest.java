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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyVpcAccessAndUpdateApisRequest extends RpcAcsRequest<ModifyVpcAccessAndUpdateApisResponse> {
	   

	private Boolean refresh;

	private String token;

	private String instanceId;

	private Boolean needBatchWork;

	private String vpcTargetHostName;

	private String securityToken;

	private Integer port;

	private String vpcId;

	private String name;
	public ModifyVpcAccessAndUpdateApisRequest() {
		super("CloudAPI", "2016-07-14", "ModifyVpcAccessAndUpdateApis", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getRefresh() {
		return this.refresh;
	}

	public void setRefresh(Boolean refresh) {
		this.refresh = refresh;
		if(refresh != null){
			putQueryParameter("Refresh", refresh.toString());
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
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

	public Boolean getNeedBatchWork() {
		return this.needBatchWork;
	}

	public void setNeedBatchWork(Boolean needBatchWork) {
		this.needBatchWork = needBatchWork;
		if(needBatchWork != null){
			putQueryParameter("NeedBatchWork", needBatchWork.toString());
		}
	}

	public String getVpcTargetHostName() {
		return this.vpcTargetHostName;
	}

	public void setVpcTargetHostName(String vpcTargetHostName) {
		this.vpcTargetHostName = vpcTargetHostName;
		if(vpcTargetHostName != null){
			putQueryParameter("VpcTargetHostName", vpcTargetHostName);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
		if(port != null){
			putQueryParameter("Port", port.toString());
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
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

	@Override
	public Class<ModifyVpcAccessAndUpdateApisResponse> getResponseClass() {
		return ModifyVpcAccessAndUpdateApisResponse.class;
	}

}
