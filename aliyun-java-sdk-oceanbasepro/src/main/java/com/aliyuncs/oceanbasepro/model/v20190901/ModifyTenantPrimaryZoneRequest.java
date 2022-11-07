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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyTenantPrimaryZoneRequest extends RpcAcsRequest<ModifyTenantPrimaryZoneResponse> {
	   

	private String userVSwitchId;

	private String masterIntranetAddressZone;

	private String tenantId;

	private String instanceId;

	private String primaryZone;

	private String modifyType;

	private String primaryZoneDeployType;
	public ModifyTenantPrimaryZoneRequest() {
		super("OceanBasePro", "2019-09-01", "ModifyTenantPrimaryZone");
		setMethod(MethodType.POST);
	}

	public String getUserVSwitchId() {
		return this.userVSwitchId;
	}

	public void setUserVSwitchId(String userVSwitchId) {
		this.userVSwitchId = userVSwitchId;
		if(userVSwitchId != null){
			putBodyParameter("UserVSwitchId", userVSwitchId);
		}
	}

	public String getMasterIntranetAddressZone() {
		return this.masterIntranetAddressZone;
	}

	public void setMasterIntranetAddressZone(String masterIntranetAddressZone) {
		this.masterIntranetAddressZone = masterIntranetAddressZone;
		if(masterIntranetAddressZone != null){
			putBodyParameter("MasterIntranetAddressZone", masterIntranetAddressZone);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getPrimaryZone() {
		return this.primaryZone;
	}

	public void setPrimaryZone(String primaryZone) {
		this.primaryZone = primaryZone;
		if(primaryZone != null){
			putBodyParameter("PrimaryZone", primaryZone);
		}
	}

	public String getModifyType() {
		return this.modifyType;
	}

	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
		if(modifyType != null){
			putBodyParameter("ModifyType", modifyType);
		}
	}

	public String getPrimaryZoneDeployType() {
		return this.primaryZoneDeployType;
	}

	public void setPrimaryZoneDeployType(String primaryZoneDeployType) {
		this.primaryZoneDeployType = primaryZoneDeployType;
		if(primaryZoneDeployType != null){
			putBodyParameter("PrimaryZoneDeployType", primaryZoneDeployType);
		}
	}

	@Override
	public Class<ModifyTenantPrimaryZoneResponse> getResponseClass() {
		return ModifyTenantPrimaryZoneResponse.class;
	}

}
