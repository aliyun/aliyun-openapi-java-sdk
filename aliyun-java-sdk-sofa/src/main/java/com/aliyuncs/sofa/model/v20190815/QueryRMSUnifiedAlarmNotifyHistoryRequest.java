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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryRMSUnifiedAlarmNotifyHistoryRequest extends RpcAcsRequest<QueryRMSUnifiedAlarmNotifyHistoryResponse> {
	   

	private String eventId;

	private String alarmStackInfoJsonStr;

	private String channel;

	private String workspaceName;

	private Long startTime;

	private List<AlarmSubscribers> alarmSubscriberss;

	private Long pageSize;

	private String keyword;

	private Long alarmRuleId;

	private String subscriber;

	private Long endTime;

	private Long currentPage;

	private Long alarmStatus;

	private Long status;
	public QueryRMSUnifiedAlarmNotifyHistoryRequest() {
		super("SOFA", "2019-08-15", "QueryRMSUnifiedAlarmNotifyHistory");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEventId() {
		return this.eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
		if(eventId != null){
			putBodyParameter("EventId", eventId);
		}
	}

	public String getAlarmStackInfoJsonStr() {
		return this.alarmStackInfoJsonStr;
	}

	public void setAlarmStackInfoJsonStr(String alarmStackInfoJsonStr) {
		this.alarmStackInfoJsonStr = alarmStackInfoJsonStr;
		if(alarmStackInfoJsonStr != null){
			putBodyParameter("AlarmStackInfoJsonStr", alarmStackInfoJsonStr);
		}
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putBodyParameter("Channel", channel);
		}
	}

	public String getWorkspaceName() {
		return this.workspaceName;
	}

	public void setWorkspaceName(String workspaceName) {
		this.workspaceName = workspaceName;
		if(workspaceName != null){
			putBodyParameter("WorkspaceName", workspaceName);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime.toString());
		}
	}

	public List<AlarmSubscribers> getAlarmSubscriberss() {
		return this.alarmSubscriberss;
	}

	public void setAlarmSubscriberss(List<AlarmSubscribers> alarmSubscriberss) {
		this.alarmSubscriberss = alarmSubscriberss;	
		if (alarmSubscriberss != null) {
			for (int depth1 = 0; depth1 < alarmSubscriberss.size(); depth1++) {
				putBodyParameter("AlarmSubscribers." + (depth1 + 1) + ".SubscriberName" , alarmSubscriberss.get(depth1).getSubscriberName());
				putBodyParameter("AlarmSubscribers." + (depth1 + 1) + ".Subscriber" , alarmSubscriberss.get(depth1).getSubscriber());
				putBodyParameter("AlarmSubscribers." + (depth1 + 1) + ".SubscriberType" , alarmSubscriberss.get(depth1).getSubscriberType());
				putBodyParameter("AlarmSubscribers." + (depth1 + 1) + ".SubscriberSource" , alarmSubscriberss.get(depth1).getSubscriberSource());
			}
		}	
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putBodyParameter("Keyword", keyword);
		}
	}

	public Long getAlarmRuleId() {
		return this.alarmRuleId;
	}

	public void setAlarmRuleId(Long alarmRuleId) {
		this.alarmRuleId = alarmRuleId;
		if(alarmRuleId != null){
			putBodyParameter("AlarmRuleId", alarmRuleId.toString());
		}
	}

	public String getSubscriber() {
		return this.subscriber;
	}

	public void setSubscriber(String subscriber) {
		this.subscriber = subscriber;
		if(subscriber != null){
			putBodyParameter("Subscriber", subscriber);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime.toString());
		}
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	public Long getAlarmStatus() {
		return this.alarmStatus;
	}

	public void setAlarmStatus(Long alarmStatus) {
		this.alarmStatus = alarmStatus;
		if(alarmStatus != null){
			putBodyParameter("AlarmStatus", alarmStatus.toString());
		}
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status.toString());
		}
	}

	public static class AlarmSubscribers {

		private String subscriberName;

		private String subscriber;

		private String subscriberType;

		private String subscriberSource;

		public String getSubscriberName() {
			return this.subscriberName;
		}

		public void setSubscriberName(String subscriberName) {
			this.subscriberName = subscriberName;
		}

		public String getSubscriber() {
			return this.subscriber;
		}

		public void setSubscriber(String subscriber) {
			this.subscriber = subscriber;
		}

		public String getSubscriberType() {
			return this.subscriberType;
		}

		public void setSubscriberType(String subscriberType) {
			this.subscriberType = subscriberType;
		}

		public String getSubscriberSource() {
			return this.subscriberSource;
		}

		public void setSubscriberSource(String subscriberSource) {
			this.subscriberSource = subscriberSource;
		}
	}

	@Override
	public Class<QueryRMSUnifiedAlarmNotifyHistoryResponse> getResponseClass() {
		return QueryRMSUnifiedAlarmNotifyHistoryResponse.class;
	}

}
