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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ApplyMetricRuleTemplateRequest extends RpcAcsRequest<ApplyMetricRuleTemplateResponse> {
	
	public ApplyMetricRuleTemplateRequest() {
		super("Cms", "2019-01-01", "ApplyMetricRuleTemplate", "cms");
	}

	private Long enableStartTime;

	private String applyMode;

	private String webhook;

	private String templateIds;

	private Long enableEndTime;

	private Long groupId;

	private Long notifyLevel;

	private Long silenceTime;

	public Long getEnableStartTime() {
		return this.enableStartTime;
	}

	public void setEnableStartTime(Long enableStartTime) {
		this.enableStartTime = enableStartTime;
		if(enableStartTime != null){
			putQueryParameter("EnableStartTime", enableStartTime.toString());
		}
	}

	public String getApplyMode() {
		return this.applyMode;
	}

	public void setApplyMode(String applyMode) {
		this.applyMode = applyMode;
		if(applyMode != null){
			putQueryParameter("ApplyMode", applyMode);
		}
	}

	public String getWebhook() {
		return this.webhook;
	}

	public void setWebhook(String webhook) {
		this.webhook = webhook;
		if(webhook != null){
			putQueryParameter("Webhook", webhook);
		}
	}

	public String getTemplateIds() {
		return this.templateIds;
	}

	public void setTemplateIds(String templateIds) {
		this.templateIds = templateIds;
		if(templateIds != null){
			putQueryParameter("TemplateIds", templateIds);
		}
	}

	public Long getEnableEndTime() {
		return this.enableEndTime;
	}

	public void setEnableEndTime(Long enableEndTime) {
		this.enableEndTime = enableEndTime;
		if(enableEndTime != null){
			putQueryParameter("EnableEndTime", enableEndTime.toString());
		}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
		}
	}

	public Long getNotifyLevel() {
		return this.notifyLevel;
	}

	public void setNotifyLevel(Long notifyLevel) {
		this.notifyLevel = notifyLevel;
		if(notifyLevel != null){
			putQueryParameter("NotifyLevel", notifyLevel.toString());
		}
	}

	public Long getSilenceTime() {
		return this.silenceTime;
	}

	public void setSilenceTime(Long silenceTime) {
		this.silenceTime = silenceTime;
		if(silenceTime != null){
			putQueryParameter("SilenceTime", silenceTime.toString());
		}
	}

	@Override
	public Class<ApplyMetricRuleTemplateResponse> getResponseClass() {
		return ApplyMetricRuleTemplateResponse.class;
	}

}
