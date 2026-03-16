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

package com.aliyuncs.eds_user.model.v20210308;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eds_user.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupsRequest extends RpcAcsRequest<DescribeGroupsResponse> {
	   

	private String businessChannel;

	private Boolean transferFileNeedApproval;

	private String loginPolicyId;

	private Integer pageNumber;

	private Integer pageSize;

	private String solutionId;

	private String idpId;

	private String groupId;

	private String groupName;

	private Boolean excludeAttachedLoginPolicyGroups;

	private String bizType;
	public DescribeGroupsRequest() {
		super("eds-user", "2021-03-08", "DescribeGroups", "eds-user");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBusinessChannel() {
		return this.businessChannel;
	}

	public void setBusinessChannel(String businessChannel) {
		this.businessChannel = businessChannel;
		if(businessChannel != null){
			putQueryParameter("BusinessChannel", businessChannel);
		}
	}

	public Boolean getTransferFileNeedApproval() {
		return this.transferFileNeedApproval;
	}

	public void setTransferFileNeedApproval(Boolean transferFileNeedApproval) {
		this.transferFileNeedApproval = transferFileNeedApproval;
		if(transferFileNeedApproval != null){
			putQueryParameter("TransferFileNeedApproval", transferFileNeedApproval.toString());
		}
	}

	public String getLoginPolicyId() {
		return this.loginPolicyId;
	}

	public void setLoginPolicyId(String loginPolicyId) {
		this.loginPolicyId = loginPolicyId;
		if(loginPolicyId != null){
			putQueryParameter("LoginPolicyId", loginPolicyId);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getSolutionId() {
		return this.solutionId;
	}

	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
		if(solutionId != null){
			putQueryParameter("SolutionId", solutionId);
		}
	}

	public String getIdpId() {
		return this.idpId;
	}

	public void setIdpId(String idpId) {
		this.idpId = idpId;
		if(idpId != null){
			putQueryParameter("IdpId", idpId);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
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

	public Boolean getExcludeAttachedLoginPolicyGroups() {
		return this.excludeAttachedLoginPolicyGroups;
	}

	public void setExcludeAttachedLoginPolicyGroups(Boolean excludeAttachedLoginPolicyGroups) {
		this.excludeAttachedLoginPolicyGroups = excludeAttachedLoginPolicyGroups;
		if(excludeAttachedLoginPolicyGroups != null){
			putQueryParameter("ExcludeAttachedLoginPolicyGroups", excludeAttachedLoginPolicyGroups.toString());
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	@Override
	public Class<DescribeGroupsResponse> getResponseClass() {
		return DescribeGroupsResponse.class;
	}

}
