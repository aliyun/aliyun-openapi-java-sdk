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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateUnionTaskRequest extends RpcAcsRequest<CreateUnionTaskResponse> {
	   

	private String taskType;

	private String taskBizType;

	private String clientToken;

	private Long brandUserId;

	private Long contentId;

	private String channel;

	private String endTime;

	private String brandUserNick;

	private String startTime;

	private Long proxyUserId;

	private String taskRuleType;

	private Long quota;

	private Integer industryLabelBagId;

	private String name;

	private Long quotaDay;

	private String channelId;
	public CreateUnionTaskRequest() {
		super("UniMkt", "2018-12-12", "CreateUnionTask");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putQueryParameter("TaskType", taskType);
		}
	}

	public String getTaskBizType() {
		return this.taskBizType;
	}

	public void setTaskBizType(String taskBizType) {
		this.taskBizType = taskBizType;
		if(taskBizType != null){
			putQueryParameter("TaskBizType", taskBizType);
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

	public Long getBrandUserId() {
		return this.brandUserId;
	}

	public void setBrandUserId(Long brandUserId) {
		this.brandUserId = brandUserId;
		if(brandUserId != null){
			putQueryParameter("BrandUserId", brandUserId.toString());
		}
	}

	public Long getContentId() {
		return this.contentId;
	}

	public void setContentId(Long contentId) {
		this.contentId = contentId;
		if(contentId != null){
			putQueryParameter("ContentId", contentId.toString());
		}
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("Channel", channel);
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

	public String getBrandUserNick() {
		return this.brandUserNick;
	}

	public void setBrandUserNick(String brandUserNick) {
		this.brandUserNick = brandUserNick;
		if(brandUserNick != null){
			putQueryParameter("BrandUserNick", brandUserNick);
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

	public Long getProxyUserId() {
		return this.proxyUserId;
	}

	public void setProxyUserId(Long proxyUserId) {
		this.proxyUserId = proxyUserId;
		if(proxyUserId != null){
			putQueryParameter("ProxyUserId", proxyUserId.toString());
		}
	}

	public String getTaskRuleType() {
		return this.taskRuleType;
	}

	public void setTaskRuleType(String taskRuleType) {
		this.taskRuleType = taskRuleType;
		if(taskRuleType != null){
			putQueryParameter("TaskRuleType", taskRuleType);
		}
	}

	public Long getQuota() {
		return this.quota;
	}

	public void setQuota(Long quota) {
		this.quota = quota;
		if(quota != null){
			putQueryParameter("Quota", quota.toString());
		}
	}

	public Integer getIndustryLabelBagId() {
		return this.industryLabelBagId;
	}

	public void setIndustryLabelBagId(Integer industryLabelBagId) {
		this.industryLabelBagId = industryLabelBagId;
		if(industryLabelBagId != null){
			putQueryParameter("IndustryLabelBagId", industryLabelBagId.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Long getQuotaDay() {
		return this.quotaDay;
	}

	public void setQuotaDay(Long quotaDay) {
		this.quotaDay = quotaDay;
		if(quotaDay != null){
			putQueryParameter("QuotaDay", quotaDay.toString());
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putQueryParameter("ChannelId", channelId);
		}
	}

	@Override
	public Class<CreateUnionTaskResponse> getResponseClass() {
		return CreateUnionTaskResponse.class;
	}

}
