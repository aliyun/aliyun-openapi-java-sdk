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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SendDigitalSmsRequest extends RpcAcsRequest<SendDigitalSmsResponse> {
	   

	private String accessId;

	private String phoneNumbers;

	private Long channelType;

	private String tenantId;

	private String taskName;

	private String outId;

	private String platformId;

	private String smsTemplateId;

	private String workspaceId;
	public SendDigitalSmsRequest() {
		super("retailadvqa-public", "2020-05-15", "SendDigitalSms");
		setMethod(MethodType.GET);
	}

	public String getAccessId() {
		return this.accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
		if(accessId != null){
			putQueryParameter("AccessId", accessId);
		}
	}

	public String getPhoneNumbers() {
		return this.phoneNumbers;
	}

	public void setPhoneNumbers(String phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
		if(phoneNumbers != null){
			putQueryParameter("PhoneNumbers", phoneNumbers);
		}
	}

	public Long getChannelType() {
		return this.channelType;
	}

	public void setChannelType(Long channelType) {
		this.channelType = channelType;
		if(channelType != null){
			putQueryParameter("ChannelType", channelType.toString());
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId);
		}
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
		}
	}

	public String getOutId() {
		return this.outId;
	}

	public void setOutId(String outId) {
		this.outId = outId;
		if(outId != null){
			putQueryParameter("OutId", outId);
		}
	}

	public String getPlatformId() {
		return this.platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
		if(platformId != null){
			putQueryParameter("PlatformId", platformId);
		}
	}

	public String getSmsTemplateId() {
		return this.smsTemplateId;
	}

	public void setSmsTemplateId(String smsTemplateId) {
		this.smsTemplateId = smsTemplateId;
		if(smsTemplateId != null){
			putQueryParameter("SmsTemplateId", smsTemplateId);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<SendDigitalSmsResponse> getResponseClass() {
		return SendDigitalSmsResponse.class;
	}

}
