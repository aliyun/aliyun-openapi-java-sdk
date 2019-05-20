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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SendShortMessageRequest extends RpcAcsRequest<SendShortMessageResponse> {
	
	public SendShortMessageRequest() {
		super("CloudCallCenter", "2017-07-05", "SendShortMessage", "CloudCallCenter", "innerAPI");
	}

	private String smsUpExtendCode;

	private String signName;

	private String instanceId;

	private String phoneNumbers;

	private String outId;

	private String templateCode;

	private String templateParam;

	public String getSmsUpExtendCode() {
		return this.smsUpExtendCode;
	}

	public void setSmsUpExtendCode(String smsUpExtendCode) {
		this.smsUpExtendCode = smsUpExtendCode;
		if(smsUpExtendCode != null){
			putQueryParameter("SmsUpExtendCode", smsUpExtendCode);
		}
	}

	public String getSignName() {
		return this.signName;
	}

	public void setSignName(String signName) {
		this.signName = signName;
		if(signName != null){
			putQueryParameter("SignName", signName);
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

	public String getPhoneNumbers() {
		return this.phoneNumbers;
	}

	public void setPhoneNumbers(String phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
		if(phoneNumbers != null){
			putQueryParameter("PhoneNumbers", phoneNumbers);
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

	public String getTemplateCode() {
		return this.templateCode;
	}

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
		if(templateCode != null){
			putQueryParameter("TemplateCode", templateCode);
		}
	}

	public String getTemplateParam() {
		return this.templateParam;
	}

	public void setTemplateParam(String templateParam) {
		this.templateParam = templateParam;
		if(templateParam != null){
			putQueryParameter("TemplateParam", templateParam);
		}
	}

	@Override
	public Class<SendShortMessageResponse> getResponseClass() {
		return SendShortMessageResponse.class;
	}

}
