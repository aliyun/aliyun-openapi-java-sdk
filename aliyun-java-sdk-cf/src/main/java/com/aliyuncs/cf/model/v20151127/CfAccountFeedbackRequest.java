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

package com.aliyuncs.cf.model.v20151127;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class CfAccountFeedbackRequest extends RpcAcsRequest<CfAccountFeedbackResponse> {
	
	public CfAccountFeedbackRequest() {
		super("CF", "2015-11-27", "CfAccountFeedback", "cf");
		setProtocol(ProtocolType.HTTPS);
	}

	private String eventId;

	private Integer userFeedback;

	private String aliDecision;

	private String customerDecision;

	private String denyReason;

	private String appToken;

	private String appKey;

	private String cFTimestamp;

	public String getEventId() {
		return this.eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
		if(eventId != null){
			putQueryParameter("EventId", eventId);
		}
	}

	public Integer getUserFeedback() {
		return this.userFeedback;
	}

	public void setUserFeedback(Integer userFeedback) {
		this.userFeedback = userFeedback;
		if(userFeedback != null){
			putQueryParameter("UserFeedback", userFeedback.toString());
		}
	}

	public String getAliDecision() {
		return this.aliDecision;
	}

	public void setAliDecision(String aliDecision) {
		this.aliDecision = aliDecision;
		if(aliDecision != null){
			putQueryParameter("AliDecision", aliDecision);
		}
	}

	public String getCustomerDecision() {
		return this.customerDecision;
	}

	public void setCustomerDecision(String customerDecision) {
		this.customerDecision = customerDecision;
		if(customerDecision != null){
			putQueryParameter("CustomerDecision", customerDecision);
		}
	}

	public String getDenyReason() {
		return this.denyReason;
	}

	public void setDenyReason(String denyReason) {
		this.denyReason = denyReason;
		if(denyReason != null){
			putQueryParameter("DenyReason", denyReason);
		}
	}

	public String getAppToken() {
		return this.appToken;
	}

	public void setAppToken(String appToken) {
		this.appToken = appToken;
		if(appToken != null){
			putQueryParameter("AppToken", appToken);
		}
	}

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putQueryParameter("AppKey", appKey);
		}
	}

	public String getCFTimestamp() {
		return this.cFTimestamp;
	}

	public void setCFTimestamp(String cFTimestamp) {
		this.cFTimestamp = cFTimestamp;
		if(cFTimestamp != null){
			putQueryParameter("CFTimestamp", cFTimestamp);
		}
	}

	@Override
	public Class<CfAccountFeedbackResponse> getResponseClass() {
		return CfAccountFeedbackResponse.class;
	}

}
