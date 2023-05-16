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

package com.aliyuncs.agency.model.v20171030;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.agency.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DoDefineRegisterNotificationRequest extends RpcAcsRequest<DoDefineRegisterNotificationResponse> {
	   

	private String accountTraceId;

	private String emailTemplate;

	private String emailTemplateParamsJsonString;

	private String smsTemplateParamsJsonString;

	private Boolean interrupt;

	private String smsTemplate;

	private String pk;

	private String invoker;
	public DoDefineRegisterNotificationRequest() {
		super("Agency", "2017-10-30", "DoDefineRegisterNotification", "openApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAccountTraceId() {
		return this.accountTraceId;
	}

	public void setAccountTraceId(String accountTraceId) {
		this.accountTraceId = accountTraceId;
		if(accountTraceId != null){
			putQueryParameter("accountTraceId", accountTraceId);
		}
	}

	public String getEmailTemplate() {
		return this.emailTemplate;
	}

	public void setEmailTemplate(String emailTemplate) {
		this.emailTemplate = emailTemplate;
		if(emailTemplate != null){
			putQueryParameter("emailTemplate", emailTemplate);
		}
	}

	public String getEmailTemplateParamsJsonString() {
		return this.emailTemplateParamsJsonString;
	}

	public void setEmailTemplateParamsJsonString(String emailTemplateParamsJsonString) {
		this.emailTemplateParamsJsonString = emailTemplateParamsJsonString;
		if(emailTemplateParamsJsonString != null){
			putQueryParameter("emailTemplateParamsJsonString", emailTemplateParamsJsonString);
		}
	}

	public String getSmsTemplateParamsJsonString() {
		return this.smsTemplateParamsJsonString;
	}

	public void setSmsTemplateParamsJsonString(String smsTemplateParamsJsonString) {
		this.smsTemplateParamsJsonString = smsTemplateParamsJsonString;
		if(smsTemplateParamsJsonString != null){
			putQueryParameter("smsTemplateParamsJsonString", smsTemplateParamsJsonString);
		}
	}

	public Boolean getInterrupt() {
		return this.interrupt;
	}

	public void setInterrupt(Boolean interrupt) {
		this.interrupt = interrupt;
		if(interrupt != null){
			putQueryParameter("interrupt", interrupt.toString());
		}
	}

	public String getSmsTemplate() {
		return this.smsTemplate;
	}

	public void setSmsTemplate(String smsTemplate) {
		this.smsTemplate = smsTemplate;
		if(smsTemplate != null){
			putQueryParameter("smsTemplate", smsTemplate);
		}
	}

	public String getPk() {
		return this.pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
		if(pk != null){
			putQueryParameter("pk", pk);
		}
	}

	public String getInvoker() {
		return this.invoker;
	}

	public void setInvoker(String invoker) {
		this.invoker = invoker;
		if(invoker != null){
			putQueryParameter("invoker", invoker);
		}
	}

	@Override
	public Class<DoDefineRegisterNotificationResponse> getResponseClass() {
		return DoDefineRegisterNotificationResponse.class;
	}

}
