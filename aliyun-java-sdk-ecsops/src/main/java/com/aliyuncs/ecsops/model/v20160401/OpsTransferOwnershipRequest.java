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
public class OpsTransferOwnershipRequest extends RpcAcsRequest<OpsTransferOwnershipResponse> {
	   

	private String sourceOwnerBid;

	private String clientToken;

	private String targetSecurityGroupId;

	private String operator;

	private String sourceOwnerId;

	private Long targetVSwitchAliUid;

	private Boolean dryRun;

	private List<String> privateIpss;

	private Boolean keepPublicIp;

	private String targetVSwitchId;

	private String workOrderId;

	private List<String> instanceIds;

	private String targetAliUid;

	private String auditParamStr;
	public OpsTransferOwnershipRequest() {
		super("Ecsops", "2016-04-01", "OpsTransferOwnership", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceOwnerBid() {
		return this.sourceOwnerBid;
	}

	public void setSourceOwnerBid(String sourceOwnerBid) {
		this.sourceOwnerBid = sourceOwnerBid;
		if(sourceOwnerBid != null){
			putQueryParameter("SourceOwnerBid", sourceOwnerBid);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getTargetSecurityGroupId() {
		return this.targetSecurityGroupId;
	}

	public void setTargetSecurityGroupId(String targetSecurityGroupId) {
		this.targetSecurityGroupId = targetSecurityGroupId;
		if(targetSecurityGroupId != null){
			putQueryParameter("TargetSecurityGroupId", targetSecurityGroupId);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getSourceOwnerId() {
		return this.sourceOwnerId;
	}

	public void setSourceOwnerId(String sourceOwnerId) {
		this.sourceOwnerId = sourceOwnerId;
		if(sourceOwnerId != null){
			putQueryParameter("SourceOwnerId", sourceOwnerId);
		}
	}

	public Long getTargetVSwitchAliUid() {
		return this.targetVSwitchAliUid;
	}

	public void setTargetVSwitchAliUid(Long targetVSwitchAliUid) {
		this.targetVSwitchAliUid = targetVSwitchAliUid;
		if(targetVSwitchAliUid != null){
			putQueryParameter("TargetVSwitchAliUid", targetVSwitchAliUid.toString());
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

	public List<String> getPrivateIpss() {
		return this.privateIpss;
	}

	public void setPrivateIpss(List<String> privateIpss) {
		this.privateIpss = privateIpss;	
		if (privateIpss != null) {
			for (int i = 0; i < privateIpss.size(); i++) {
				putQueryParameter("PrivateIps." + (i + 1) , privateIpss.get(i));
			}
		}	
	}

	public Boolean getKeepPublicIp() {
		return this.keepPublicIp;
	}

	public void setKeepPublicIp(Boolean keepPublicIp) {
		this.keepPublicIp = keepPublicIp;
		if(keepPublicIp != null){
			putQueryParameter("KeepPublicIp", keepPublicIp.toString());
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

	public String getWorkOrderId() {
		return this.workOrderId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
		if(workOrderId != null){
			putQueryParameter("WorkOrderId", workOrderId);
		}
	}

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			for (int i = 0; i < instanceIds.size(); i++) {
				putQueryParameter("InstanceId." + (i + 1) , instanceIds.get(i));
			}
		}	
	}

	public String getTargetAliUid() {
		return this.targetAliUid;
	}

	public void setTargetAliUid(String targetAliUid) {
		this.targetAliUid = targetAliUid;
		if(targetAliUid != null){
			putQueryParameter("TargetAliUid", targetAliUid);
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

	@Override
	public Class<OpsTransferOwnershipResponse> getResponseClass() {
		return OpsTransferOwnershipResponse.class;
	}

}
