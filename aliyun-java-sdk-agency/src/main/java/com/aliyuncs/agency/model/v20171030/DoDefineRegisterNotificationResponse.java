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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.agency.transform.v20171030.DoDefineRegisterNotificationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DoDefineRegisterNotificationResponse extends AcsResponse {

	private String smsTemplateParamsJsonString;

	private Boolean interrupt;

	private String smsTemplate;

	private String invoker;

	private String emailTemplate;

	private String accountTraceId;

	private String pk;

	private String emailTemplateParamsJsonString;

	public String getSmsTemplateParamsJsonString() {
		return this.smsTemplateParamsJsonString;
	}

	public void setSmsTemplateParamsJsonString(String smsTemplateParamsJsonString) {
		this.smsTemplateParamsJsonString = smsTemplateParamsJsonString;
	}

	public Boolean getInterrupt() {
		return this.interrupt;
	}

	public void setInterrupt(Boolean interrupt) {
		this.interrupt = interrupt;
	}

	public String getSmsTemplate() {
		return this.smsTemplate;
	}

	public void setSmsTemplate(String smsTemplate) {
		this.smsTemplate = smsTemplate;
	}

	public String getInvoker() {
		return this.invoker;
	}

	public void setInvoker(String invoker) {
		this.invoker = invoker;
	}

	public String getEmailTemplate() {
		return this.emailTemplate;
	}

	public void setEmailTemplate(String emailTemplate) {
		this.emailTemplate = emailTemplate;
	}

	public String getAccountTraceId() {
		return this.accountTraceId;
	}

	public void setAccountTraceId(String accountTraceId) {
		this.accountTraceId = accountTraceId;
	}

	public String getPk() {
		return this.pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getEmailTemplateParamsJsonString() {
		return this.emailTemplateParamsJsonString;
	}

	public void setEmailTemplateParamsJsonString(String emailTemplateParamsJsonString) {
		this.emailTemplateParamsJsonString = emailTemplateParamsJsonString;
	}

	@Override
	public DoDefineRegisterNotificationResponse getInstance(UnmarshallerContext context) {
		return	DoDefineRegisterNotificationResponseUnmarshaller.unmarshall(this, context);
	}
}
