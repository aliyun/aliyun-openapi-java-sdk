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

package com.aliyuncs.ccs.model.v20171001;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryHotlineRecordRequest extends RpcAcsRequest<QueryHotlineRecordResponse> {
	
	public QueryHotlineRecordRequest() {
		super("Ccs", "2017-10-01", "QueryHotlineRecord", "ccs");
	}

	private String agentId;

	private Long maxTalkDuration;

	private String groupId;

	private String endTime;

	private String startTime;

	private Integer pageNum;

	private String satisfaction;

	private Long minTalkDuratoin;

	private String categoryIds;

	private String visitorProvince;

	private Integer pageSize;

	private String callType;

	private String ccsInstanceId;

	private String visitorPhone;

	private String visitorId;

	private String status;

	public String getAgentId() {
		return this.agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
		if(agentId != null){
			putQueryParameter("AgentId", agentId);
		}
	}

	public Long getMaxTalkDuration() {
		return this.maxTalkDuration;
	}

	public void setMaxTalkDuration(Long maxTalkDuration) {
		this.maxTalkDuration = maxTalkDuration;
		if(maxTalkDuration != null){
			putQueryParameter("MaxTalkDuration", maxTalkDuration.toString());
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

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public String getSatisfaction() {
		return this.satisfaction;
	}

	public void setSatisfaction(String satisfaction) {
		this.satisfaction = satisfaction;
		if(satisfaction != null){
			putQueryParameter("Satisfaction", satisfaction);
		}
	}

	public Long getMinTalkDuratoin() {
		return this.minTalkDuratoin;
	}

	public void setMinTalkDuratoin(Long minTalkDuratoin) {
		this.minTalkDuratoin = minTalkDuratoin;
		if(minTalkDuratoin != null){
			putQueryParameter("MinTalkDuratoin", minTalkDuratoin.toString());
		}
	}

	public String getCategoryIds() {
		return this.categoryIds;
	}

	public void setCategoryIds(String categoryIds) {
		this.categoryIds = categoryIds;
		if(categoryIds != null){
			putQueryParameter("CategoryIds", categoryIds);
		}
	}

	public String getVisitorProvince() {
		return this.visitorProvince;
	}

	public void setVisitorProvince(String visitorProvince) {
		this.visitorProvince = visitorProvince;
		if(visitorProvince != null){
			putQueryParameter("VisitorProvince", visitorProvince);
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

	public String getCallType() {
		return this.callType;
	}

	public void setCallType(String callType) {
		this.callType = callType;
		if(callType != null){
			putQueryParameter("CallType", callType);
		}
	}

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}

	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
		if(ccsInstanceId != null){
			putQueryParameter("CcsInstanceId", ccsInstanceId);
		}
	}

	public String getVisitorPhone() {
		return this.visitorPhone;
	}

	public void setVisitorPhone(String visitorPhone) {
		this.visitorPhone = visitorPhone;
		if(visitorPhone != null){
			putQueryParameter("VisitorPhone", visitorPhone);
		}
	}

	public String getVisitorId() {
		return this.visitorId;
	}

	public void setVisitorId(String visitorId) {
		this.visitorId = visitorId;
		if(visitorId != null){
			putQueryParameter("VisitorId", visitorId);
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
	public Class<QueryHotlineRecordResponse> getResponseClass() {
		return QueryHotlineRecordResponse.class;
	}

}
