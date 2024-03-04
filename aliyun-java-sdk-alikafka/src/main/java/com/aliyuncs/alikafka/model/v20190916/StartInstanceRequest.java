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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alikafka.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StartInstanceRequest extends RpcAcsRequest<StartInstanceResponse> {
	   

	private List<String> vSwitchIdss;

	private String selectedZones;

	private Boolean isEipInner;

	private String securityGroup;

	private String deployModule;

	private Boolean isSetUserAndPassword;

	private String password;

	private String notifier;

	private Boolean isForceSelectedZones;

	private String vSwitchId;

	private String userPhoneNum;

	private String instanceId;

	private String vpcId;

	private Boolean crossZone;

	private String name;

	private String serviceVersion;

	private String zoneId;

	private String kMSKeyId;

	private String config;

	private String username;
	public StartInstanceRequest() {
		super("alikafka", "2019-09-16", "StartInstance", "alikafka");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getVSwitchIdss() {
		return this.vSwitchIdss;
	}

	public void setVSwitchIdss(List<String> vSwitchIdss) {
		this.vSwitchIdss = vSwitchIdss;	
		if (vSwitchIdss != null) {
			for (int i = 0; i < vSwitchIdss.size(); i++) {
				putQueryParameter("VSwitchIds." + (i + 1) , vSwitchIdss.get(i));
			}
		}	
	}

	public String getSelectedZones() {
		return this.selectedZones;
	}

	public void setSelectedZones(String selectedZones) {
		this.selectedZones = selectedZones;
		if(selectedZones != null){
			putQueryParameter("SelectedZones", selectedZones);
		}
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

	public String getSecurityGroup() {
		return this.securityGroup;
	}

	public void setSecurityGroup(String securityGroup) {
		this.securityGroup = securityGroup;
		if(securityGroup != null){
			putQueryParameter("SecurityGroup", securityGroup);
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

	public String getNotifier() {
		return this.notifier;
	}

	public void setNotifier(String notifier) {
		this.notifier = notifier;
		if(notifier != null){
			putQueryParameter("Notifier", notifier);
		}
	}

	public Boolean getIsForceSelectedZones() {
		return this.isForceSelectedZones;
	}

	public void setIsForceSelectedZones(Boolean isForceSelectedZones) {
		this.isForceSelectedZones = isForceSelectedZones;
		if(isForceSelectedZones != null){
			putQueryParameter("IsForceSelectedZones", isForceSelectedZones.toString());
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

	public String getUserPhoneNum() {
		return this.userPhoneNum;
	}

	public void setUserPhoneNum(String userPhoneNum) {
		this.userPhoneNum = userPhoneNum;
		if(userPhoneNum != null){
			putQueryParameter("UserPhoneNum", userPhoneNum);
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

	public Boolean getCrossZone() {
		return this.crossZone;
	}

	public void setCrossZone(Boolean crossZone) {
		this.crossZone = crossZone;
		if(crossZone != null){
			putQueryParameter("CrossZone", crossZone.toString());
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getKMSKeyId() {
		return this.kMSKeyId;
	}

	public void setKMSKeyId(String kMSKeyId) {
		this.kMSKeyId = kMSKeyId;
		if(kMSKeyId != null){
			putQueryParameter("KMSKeyId", kMSKeyId);
		}
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
		if(config != null){
			putQueryParameter("Config", config);
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
