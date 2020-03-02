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

package com.aliyuncs.alikafka.model.v20190916;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alikafka.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StartInstanceRequest extends RpcAcsRequest<StartInstanceResponse> {
	   

	private Boolean isEipInner;

	private String deployModule;

	private Boolean isSetUserAndPassword;

	private String password;

	private String vSwitchId;

	private String instanceId;

	private String vpcId;

	private String name;

	private String zoneId;

	private String username;
	public StartInstanceRequest() {
		super("alikafka", "2019-09-16", "StartInstance", "alikafka");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIsEipInner() {
		return this.isEipInner;
	}

	public void setIsEipInner(Boolean isEipInner) {
		this.isEipInner = isEipInner;
		if(isEipInner != null){
			putQueryParameter("IsEipInner", isEipInner.toString());
		}
	}

	public String getDeployModule() {
		return this.deployModule;
	}

	public void setDeployModule(String deployModule) {
		this.deployModule = deployModule;
		if(deployModule != null){
			putQueryParameter("DeployModule", deployModule);
		}
	}

	public Boolean getIsSetUserAndPassword() {
		return this.isSetUserAndPassword;
	}

	public void setIsSetUserAndPassword(Boolean isSetUserAndPassword) {
		this.isSetUserAndPassword = isSetUserAndPassword;
		if(isSetUserAndPassword != null){
			putQueryParameter("IsSetUserAndPassword", isSetUserAndPassword.toString());
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
		if(username != null){
			putQueryParameter("Username", username);
		}
	}

	@Override
	public Class<StartInstanceResponse> getResponseClass() {
		return StartInstanceResponse.class;
	}

}
