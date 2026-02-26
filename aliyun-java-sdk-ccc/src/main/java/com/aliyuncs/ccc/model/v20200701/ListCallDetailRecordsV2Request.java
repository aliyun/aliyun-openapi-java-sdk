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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListCallDetailRecordsV2Request extends RpcAcsRequest<ListCallDetailRecordsV2Response> {
	   

	private String contactDispositionList;

	private String orderByField;

	private Long startTime;

	private Integer pageNumber;

	private String earlyMediaStateList;

	private String number;

	private String skillGroupIdList;

	private String calledNumber;

	private Integer pageSize;

	private String sortOrder;

	private String satisfactionDescriptionList;

	private String agentId;

	private String firstAgentId;

	private String contactTypeList;

	private String satisfactionSurveyChannel;

	private Long endTime;

	private String broker;

	private String contactIdList;

	private String accessChannelTypeList;

	private String searchPattern;

	private String callingNumber;

	private String instanceId;

	private String satisfactionRateList;

	private String mediaType;
	public ListCallDetailRecordsV2Request() {
		super("CCC", "2020-07-01", "ListCallDetailRecordsV2", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getContactDispositionList() {
		return this.contactDispositionList;
	}

	public void setContactDispositionList(String contactDispositionList) {
		this.contactDispositionList = contactDispositionList;
		if(contactDispositionList != null){
			putQueryParameter("ContactDispositionList", contactDispositionList);
		}
	}

	public String getOrderByField() {
		return this.orderByField;
	}

	public void setOrderByField(String orderByField) {
		this.orderByField = orderByField;
		if(orderByField != null){
			putQueryParameter("OrderByField", orderByField);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
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

	public String getEarlyMediaStateList() {
		return this.earlyMediaStateList;
	}

	public void setEarlyMediaStateList(String earlyMediaStateList) {
		this.earlyMediaStateList = earlyMediaStateList;
		if(earlyMediaStateList != null){
			putQueryParameter("EarlyMediaStateList", earlyMediaStateList);
		}
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
		if(number != null){
			putQueryParameter("Number", number);
		}
	}

	public String getSkillGroupIdList() {
		return this.skillGroupIdList;
	}

	public void setSkillGroupIdList(String skillGroupIdList) {
		this.skillGroupIdList = skillGroupIdList;
		if(skillGroupIdList != null){
			putQueryParameter("SkillGroupIdList", skillGroupIdList);
		}
	}

	public String getCalledNumber() {
		return this.calledNumber;
	}

	public void setCalledNumber(String calledNumber) {
		this.calledNumber = calledNumber;
		if(calledNumber != null){
			putQueryParameter("CalledNumber", calledNumber);
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

	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
		if(sortOrder != null){
			putQueryParameter("SortOrder", sortOrder);
		}
	}

	public String getSatisfactionDescriptionList() {
		return this.satisfactionDescriptionList;
	}

	public void setSatisfactionDescriptionList(String satisfactionDescriptionList) {
		this.satisfactionDescriptionList = satisfactionDescriptionList;
		if(satisfactionDescriptionList != null){
			putQueryParameter("SatisfactionDescriptionList", satisfactionDescriptionList);
		}
	}

	public String getAgentId() {
		return this.agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
		if(agentId != null){
			putQueryParameter("AgentId", agentId);
		}
	}

	public String getFirstAgentId() {
		return this.firstAgentId;
	}

	public void setFirstAgentId(String firstAgentId) {
		this.firstAgentId = firstAgentId;
		if(firstAgentId != null){
			putQueryParameter("FirstAgentId", firstAgentId);
		}
	}

	public String getContactTypeList() {
		return this.contactTypeList;
	}

	public void setContactTypeList(String contactTypeList) {
		this.contactTypeList = contactTypeList;
		if(contactTypeList != null){
			putQueryParameter("ContactTypeList", contactTypeList);
		}
	}

	public String getSatisfactionSurveyChannel() {
		return this.satisfactionSurveyChannel;
	}

	public void setSatisfactionSurveyChannel(String satisfactionSurveyChannel) {
		this.satisfactionSurveyChannel = satisfactionSurveyChannel;
		if(satisfactionSurveyChannel != null){
			putQueryParameter("SatisfactionSurveyChannel", satisfactionSurveyChannel);
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

	public String getBroker() {
		return this.broker;
	}

	public void setBroker(String broker) {
		this.broker = broker;
		if(broker != null){
			putQueryParameter("Broker", broker);
		}
	}

	public String getContactIdList() {
		return this.contactIdList;
	}

	public void setContactIdList(String contactIdList) {
		this.contactIdList = contactIdList;
		if(contactIdList != null){
			putQueryParameter("ContactIdList", contactIdList);
		}
	}

	public String getAccessChannelTypeList() {
		return this.accessChannelTypeList;
	}

	public void setAccessChannelTypeList(String accessChannelTypeList) {
		this.accessChannelTypeList = accessChannelTypeList;
		if(accessChannelTypeList != null){
			putQueryParameter("AccessChannelTypeList", accessChannelTypeList);
		}
	}

	public String getSearchPattern() {
		return this.searchPattern;
	}

	public void setSearchPattern(String searchPattern) {
		this.searchPattern = searchPattern;
		if(searchPattern != null){
			putQueryParameter("SearchPattern", searchPattern);
		}
	}

	public String getCallingNumber() {
		return this.callingNumber;
	}

	public void setCallingNumber(String callingNumber) {
		this.callingNumber = callingNumber;
		if(callingNumber != null){
			putQueryParameter("CallingNumber", callingNumber);
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

	public String getSatisfactionRateList() {
		return this.satisfactionRateList;
	}

	public void setSatisfactionRateList(String satisfactionRateList) {
		this.satisfactionRateList = satisfactionRateList;
		if(satisfactionRateList != null){
			putQueryParameter("SatisfactionRateList", satisfactionRateList);
		}
	}

	public String getMediaType() {
		return this.mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
		if(mediaType != null){
			putQueryParameter("MediaType", mediaType);
		}
	}

	@Override
	public Class<ListCallDetailRecordsV2Response> getResponseClass() {
		return ListCallDetailRecordsV2Response.class;
	}

}
