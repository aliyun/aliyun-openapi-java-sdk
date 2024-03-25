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
import com.aliyuncs.oceanbasepro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyTenantPrimaryZoneRequest extends RpcAcsRequest<ModifyTenantPrimaryZoneResponse> {
	   

	private String tenantEndpointDirectId;

	private String userVSwitchId;

	private String masterIntranetAddressZone;

	private String tenantId;

	private String tenantEndpointId;

	private String instanceId;

	private String primaryZone;

	private String vpcId;

	private String userDirectVSwitchId;
	public ModifyTenantPrimaryZoneRequest() {
		super("OceanBasePro", "2019-09-01", "ModifyTenantPrimaryZone", "oceanbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTenantEndpointDirectId() {
		return this.tenantEndpointDirectId;
	}

	public void setTenantEndpointDirectId(String tenantEndpointDirectId) {
		this.tenantEndpointDirectId = tenantEndpointDirectId;
		if(tenantEndpointDirectId != null){
			putBodyParameter("TenantEndpointDirectId", tenantEndpointDirectId);
		}
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

	public String getTenantEndpointId() {
		return this.tenantEndpointId;
	}

	public void setTenantEndpointId(String tenantEndpointId) {
		this.tenantEndpointId = tenantEndpointId;
		if(tenantEndpointId != null){
			putBodyParameter("TenantEndpointId", tenantEndpointId);
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

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putBodyParameter("VpcId", vpcId);
		}
	}

	public String getUserDirectVSwitchId() {
		return this.userDirectVSwitchId;
	}

	public void setUserDirectVSwitchId(String userDirectVSwitchId) {
		this.userDirectVSwitchId = userDirectVSwitchId;
		if(userDirectVSwitchId != null){
			putBodyParameter("UserDirectVSwitchId", userDirectVSwitchId);
		}
	}

	@Override
	public Class<ModifyTenantPrimaryZoneResponse> getResponseClass() {
		return ModifyTenantPrimaryZoneResponse.class;
	}

}
