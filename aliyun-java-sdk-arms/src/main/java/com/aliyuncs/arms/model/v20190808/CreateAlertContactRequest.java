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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAlertContactRequest extends RpcAcsRequest<CreateAlertContactResponse> {
	   

	private String phoneNum;

	private String contactName;

	private String dingRobotWebhookUrl;

	private String email;

	private Boolean systemNoc;
	public CreateAlertContactRequest() {
		super("ARMS", "2019-08-08", "CreateAlertContact");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPhoneNum() {
		return this.phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
		if(phoneNum != null){
			putQueryParameter("PhoneNum", phoneNum);
		}
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
		if(contactName != null){
			putQueryParameter("ContactName", contactName);
		}
	}

	public String getDingRobotWebhookUrl() {
		return this.dingRobotWebhookUrl;
	}

	public void setDingRobotWebhookUrl(String dingRobotWebhookUrl) {
		this.dingRobotWebhookUrl = dingRobotWebhookUrl;
		if(dingRobotWebhookUrl != null){
			putQueryParameter("DingRobotWebhookUrl", dingRobotWebhookUrl);
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putQueryParameter("Email", email);
		}
	}

	public Boolean getSystemNoc() {
		return this.systemNoc;
	}

	public void setSystemNoc(Boolean systemNoc) {
		this.systemNoc = systemNoc;
		if(systemNoc != null){
			putQueryParameter("SystemNoc", systemNoc.toString());
		}
	}

	@Override
	public Class<CreateAlertContactResponse> getResponseClass() {
		return CreateAlertContactResponse.class;
	}

}
