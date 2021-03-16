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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeSecurityGroupsRequest extends RpcAcsRequest<OpsDescribeSecurityGroupsResponse> {
	   

	private Long resourceOwnerId;

	private String eniInstanceIds;

	private String securityGroupName;

	private String securityGroupIds;

	private Integer pageNumber;

	private String instanceId;

	private String vpcId;

	private Integer pageSize;

	private Boolean onlyQueryVpcSecurityGroup;

	private String auditParamStr;
	public OpsDescribeSecurityGroupsRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeSecurityGroups", "ecs");
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

	public String getEniInstanceIds() {
		return this.eniInstanceIds;
	}

	public void setEniInstanceIds(String eniInstanceIds) {
		this.eniInstanceIds = eniInstanceIds;
		if(eniInstanceIds != null){
			putQueryParameter("EniInstanceIds", eniInstanceIds);
		}
	}

	public String getSecurityGroupName() {
		return this.securityGroupName;
	}

	public void setSecurityGroupName(String securityGroupName) {
		this.securityGroupName = securityGroupName;
		if(securityGroupName != null){
			putQueryParameter("SecurityGroupName", securityGroupName);
		}
	}

	public String getSecurityGroupIds() {
		return this.securityGroupIds;
	}

	public void setSecurityGroupIds(String securityGroupIds) {
		this.securityGroupIds = securityGroupIds;
		if(securityGroupIds != null){
			putQueryParameter("SecurityGroupIds", securityGroupIds);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Boolean getOnlyQueryVpcSecurityGroup() {
		return this.onlyQueryVpcSecurityGroup;
	}

	public void setOnlyQueryVpcSecurityGroup(Boolean onlyQueryVpcSecurityGroup) {
		this.onlyQueryVpcSecurityGroup = onlyQueryVpcSecurityGroup;
		if(onlyQueryVpcSecurityGroup != null){
			putQueryParameter("OnlyQueryVpcSecurityGroup", onlyQueryVpcSecurityGroup.toString());
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
	public Class<OpsDescribeSecurityGroupsResponse> getResponseClass() {
		return OpsDescribeSecurityGroupsResponse.class;
	}

}
