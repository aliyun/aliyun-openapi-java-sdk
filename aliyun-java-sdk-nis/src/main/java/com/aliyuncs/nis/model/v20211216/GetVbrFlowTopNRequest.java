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

package com.aliyuncs.nis.model.v20211216;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetVbrFlowTopNRequest extends RpcAcsRequest<GetVbrFlowTopNResponse> {
	   

	private String otherPort;

	private Integer topN;

	private String cloudPort;

	private String protocol;

	private String otherIp;

	private String orderBy;

	private String sort;

	private Boolean useMultiAccount;

	private String cloudIp;

	private String cenId;

	private String virtualBorderRouterId;

	private String direction;

	private Long endTime;

	private Long beginTime;

	private String groupBy;

	@SerializedName("accountIds")
	private List<Long> accountIds;

	private String attachmentId;
	public GetVbrFlowTopNRequest() {
		super("nis", "2021-12-16", "GetVbrFlowTopN", "networkana");
		setMethod(MethodType.POST);
	}

	public String getOtherPort() {
		return this.otherPort;
	}

	public void setOtherPort(String otherPort) {
		this.otherPort = otherPort;
		if(otherPort != null){
			putQueryParameter("OtherPort", otherPort);
		}
	}

	public Integer getTopN() {
		return this.topN;
	}

	public void setTopN(Integer topN) {
		this.topN = topN;
		if(topN != null){
			putQueryParameter("TopN", topN.toString());
		}
	}

	public String getCloudPort() {
		return this.cloudPort;
	}

	public void setCloudPort(String cloudPort) {
		this.cloudPort = cloudPort;
		if(cloudPort != null){
			putQueryParameter("CloudPort", cloudPort);
		}
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
		if(protocol != null){
			putQueryParameter("Protocol", protocol);
		}
	}

	public String getOtherIp() {
		return this.otherIp;
	}

	public void setOtherIp(String otherIp) {
		this.otherIp = otherIp;
		if(otherIp != null){
			putQueryParameter("OtherIp", otherIp);
		}
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putQueryParameter("OrderBy", orderBy);
		}
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
		if(sort != null){
			putQueryParameter("Sort", sort);
		}
	}

	public Boolean getUseMultiAccount() {
		return this.useMultiAccount;
	}

	public void setUseMultiAccount(Boolean useMultiAccount) {
		this.useMultiAccount = useMultiAccount;
		if(useMultiAccount != null){
			putQueryParameter("UseMultiAccount", useMultiAccount.toString());
		}
	}

	public String getCloudIp() {
		return this.cloudIp;
	}

	public void setCloudIp(String cloudIp) {
		this.cloudIp = cloudIp;
		if(cloudIp != null){
			putQueryParameter("CloudIp", cloudIp);
		}
	}

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
		if(cenId != null){
			putQueryParameter("CenId", cenId);
		}
	}

	public String getVirtualBorderRouterId() {
		return this.virtualBorderRouterId;
	}

	public void setVirtualBorderRouterId(String virtualBorderRouterId) {
		this.virtualBorderRouterId = virtualBorderRouterId;
		if(virtualBorderRouterId != null){
			putQueryParameter("VirtualBorderRouterId", virtualBorderRouterId);
		}
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		if(direction != null){
			putQueryParameter("Direction", direction);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putQueryParameter("BeginTime", beginTime.toString());
		}
	}

	public String getGroupBy() {
		return this.groupBy;
	}

	public void setGroupBy(String groupBy) {
		this.groupBy = groupBy;
		if(groupBy != null){
			putQueryParameter("GroupBy", groupBy);
		}
	}

	public List<Long> getAccountIds() {
		return this.accountIds;
	}

	public void setAccountIds(List<Long> accountIds) {
		this.accountIds = accountIds;	
		if (accountIds != null) {
			putQueryParameter("AccountIds" , new Gson().toJson(accountIds));
		}	
	}

	public String getAttachmentId() {
		return this.attachmentId;
	}

	public void setAttachmentId(String attachmentId) {
		this.attachmentId = attachmentId;
		if(attachmentId != null){
			putQueryParameter("AttachmentId", attachmentId);
		}
	}

	@Override
	public Class<GetVbrFlowTopNResponse> getResponseClass() {
		return GetVbrFlowTopNResponse.class;
	}

}
