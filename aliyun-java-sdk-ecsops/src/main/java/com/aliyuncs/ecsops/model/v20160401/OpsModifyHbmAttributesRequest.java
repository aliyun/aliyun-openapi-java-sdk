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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsModifyHbmAttributesRequest extends RpcAcsRequest<OpsModifyHbmAttributesResponse> {
	   

	private List<String> securityGroupIds;

	private String bootMode;

	private Long aliUid;

	private String vSwitchId;

	private String privateIpAddress;

	private String hbmInstanceName;

	private String vpcId;

	private String hbmInstanceId;

	private String auditParamStr;

	private String status;
	public OpsModifyHbmAttributesRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyHbmAttributes", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getSecurityGroupIds() {
		return this.securityGroupIds;
	}

	public void setSecurityGroupIds(List<String> securityGroupIds) {
		this.securityGroupIds = securityGroupIds;	
		if (securityGroupIds != null) {
			for (int i = 0; i < securityGroupIds.size(); i++) {
				putQueryParameter("SecurityGroupId." + (i + 1) , securityGroupIds.get(i));
			}
		}	
	}

	public String getBootMode() {
		return this.bootMode;
	}

	public void setBootMode(String bootMode) {
		this.bootMode = bootMode;
		if(bootMode != null){
			putQueryParameter("BootMode", bootMode);
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
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

	public String getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
		if(privateIpAddress != null){
			putQueryParameter("PrivateIpAddress", privateIpAddress);
		}
	}

	public String getHbmInstanceName() {
		return this.hbmInstanceName;
	}

	public void setHbmInstanceName(String hbmInstanceName) {
		this.hbmInstanceName = hbmInstanceName;
		if(hbmInstanceName != null){
			putQueryParameter("HbmInstanceName", hbmInstanceName);
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

	public String getHbmInstanceId() {
		return this.hbmInstanceId;
	}

	public void setHbmInstanceId(String hbmInstanceId) {
		this.hbmInstanceId = hbmInstanceId;
		if(hbmInstanceId != null){
			putQueryParameter("HbmInstanceId", hbmInstanceId);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<OpsModifyHbmAttributesResponse> getResponseClass() {
		return OpsModifyHbmAttributesResponse.class;
	}

}
