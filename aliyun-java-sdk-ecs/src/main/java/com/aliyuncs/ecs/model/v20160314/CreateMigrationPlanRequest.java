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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateMigrationPlanRequest extends RpcAcsRequest<CreateMigrationPlanResponse> {
	   

	private Long resourceOwnerId;

	private List<String> targetSecurityGroupIdss;

	private List<CustomMigrationTimes> customMigrationTimess;

	private Boolean remainPrivateIp;

	private Boolean ensureNetworkConnectivity;

	private String type;

	private Boolean remainPublicMacAsPriority;

	private String targetVpcId;

	private String targetZoneId;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private String globalMigrationTime;

	private String targetVSwitchId;

	private Long ownerId;

	private List<String> instanceIdss;

	private String name;

	private Boolean enableAutoCreateVSwitch;
	public CreateMigrationPlanRequest() {
		super("Ecs", "2016-03-14", "CreateMigrationPlan", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<String> getTargetSecurityGroupIdss() {
		return this.targetSecurityGroupIdss;
	}

	public void setTargetSecurityGroupIdss(List<String> targetSecurityGroupIdss) {
		this.targetSecurityGroupIdss = targetSecurityGroupIdss;	
		if (targetSecurityGroupIdss != null) {
			for (int i = 0; i < targetSecurityGroupIdss.size(); i++) {
				putQueryParameter("TargetSecurityGroupIds." + (i + 1) , targetSecurityGroupIdss.get(i));
			}
		}	
	}

	public List<CustomMigrationTimes> getCustomMigrationTimess() {
		return this.customMigrationTimess;
	}

	public void setCustomMigrationTimess(List<CustomMigrationTimes> customMigrationTimess) {
		this.customMigrationTimess = customMigrationTimess;	
		if (customMigrationTimess != null) {
			for (int depth1 = 0; depth1 < customMigrationTimess.size(); depth1++) {
				putQueryParameter("CustomMigrationTimes." + (depth1 + 1) + ".MigrationTime" , customMigrationTimess.get(depth1).getMigrationTime());
				putQueryParameter("CustomMigrationTimes." + (depth1 + 1) + ".InstanceId" , customMigrationTimess.get(depth1).getInstanceId());
			}
		}	
	}

	public Boolean getRemainPrivateIp() {
		return this.remainPrivateIp;
	}

	public void setRemainPrivateIp(Boolean remainPrivateIp) {
		this.remainPrivateIp = remainPrivateIp;
		if(remainPrivateIp != null){
			putQueryParameter("RemainPrivateIp", remainPrivateIp.toString());
		}
	}

	public Boolean getEnsureNetworkConnectivity() {
		return this.ensureNetworkConnectivity;
	}

	public void setEnsureNetworkConnectivity(Boolean ensureNetworkConnectivity) {
		this.ensureNetworkConnectivity = ensureNetworkConnectivity;
		if(ensureNetworkConnectivity != null){
			putQueryParameter("EnsureNetworkConnectivity", ensureNetworkConnectivity.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public Boolean getRemainPublicMacAsPriority() {
		return this.remainPublicMacAsPriority;
	}

	public void setRemainPublicMacAsPriority(Boolean remainPublicMacAsPriority) {
		this.remainPublicMacAsPriority = remainPublicMacAsPriority;
		if(remainPublicMacAsPriority != null){
			putQueryParameter("RemainPublicMacAsPriority", remainPublicMacAsPriority.toString());
		}
	}

	public String getTargetVpcId() {
		return this.targetVpcId;
	}

	public void setTargetVpcId(String targetVpcId) {
		this.targetVpcId = targetVpcId;
		if(targetVpcId != null){
			putQueryParameter("TargetVpcId", targetVpcId);
		}
	}

	public String getTargetZoneId() {
		return this.targetZoneId;
	}

	public void setTargetZoneId(String targetZoneId) {
		this.targetZoneId = targetZoneId;
		if(targetZoneId != null){
			putQueryParameter("TargetZoneId", targetZoneId);
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getGlobalMigrationTime() {
		return this.globalMigrationTime;
	}

	public void setGlobalMigrationTime(String globalMigrationTime) {
		this.globalMigrationTime = globalMigrationTime;
		if(globalMigrationTime != null){
			putQueryParameter("GlobalMigrationTime", globalMigrationTime);
		}
	}

	public String getTargetVSwitchId() {
		return this.targetVSwitchId;
	}

	public void setTargetVSwitchId(String targetVSwitchId) {
		this.targetVSwitchId = targetVSwitchId;
		if(targetVSwitchId != null){
			putQueryParameter("TargetVSwitchId", targetVSwitchId);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<String> getInstanceIdss() {
		return this.instanceIdss;
	}

	public void setInstanceIdss(List<String> instanceIdss) {
		this.instanceIdss = instanceIdss;	
		if (instanceIdss != null) {
			for (int i = 0; i < instanceIdss.size(); i++) {
				putQueryParameter("InstanceIds." + (i + 1) , instanceIdss.get(i));
			}
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

	public Boolean getEnableAutoCreateVSwitch() {
		return this.enableAutoCreateVSwitch;
	}

	public void setEnableAutoCreateVSwitch(Boolean enableAutoCreateVSwitch) {
		this.enableAutoCreateVSwitch = enableAutoCreateVSwitch;
		if(enableAutoCreateVSwitch != null){
			putQueryParameter("EnableAutoCreateVSwitch", enableAutoCreateVSwitch.toString());
		}
	}

	public static class CustomMigrationTimes {

		private String migrationTime;

		private String instanceId;

		public String getMigrationTime() {
			return this.migrationTime;
		}

		public void setMigrationTime(String migrationTime) {
			this.migrationTime = migrationTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	@Override
	public Class<CreateMigrationPlanResponse> getResponseClass() {
		return CreateMigrationPlanResponse.class;
	}

}
