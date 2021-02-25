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

package com.aliyuncs.scsp.model.v20200702;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.scsp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOuterCallCenterDataRequest extends RpcAcsRequest<CreateOuterCallCenterDataResponse> {
	   

	private String extInfo;

	private String recordUrl;

	private String endReason;

	private String sessionId;

	private String fromPhoneNum;

	private String interveneTime;

	private String bizType;

	private String instanceId;

	private String toPhoneNum;

	private String bizId;

	private String tenantId;

	private String callType;

	private String userInfo;
	public CreateOuterCallCenterDataRequest() {
		super("scsp", "2020-07-02", "CreateOuterCallCenterData", "scsp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtInfo() {
		return this.extInfo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
		if(extInfo != null){
			putBodyParameter("ExtInfo", extInfo);
		}
	}

	public String getRecordUrl() {
		return this.recordUrl;
	}

	public void setRecordUrl(String recordUrl) {
		this.recordUrl = recordUrl;
		if(recordUrl != null){
			putBodyParameter("RecordUrl", recordUrl);
		}
	}

	public String getEndReason() {
		return this.endReason;
	}

	public void setEndReason(String endReason) {
		this.endReason = endReason;
		if(endReason != null){
			putBodyParameter("EndReason", endReason);
		}
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
		if(sessionId != null){
			putBodyParameter("SessionId", sessionId);
		}
	}

	public String getFromPhoneNum() {
		return this.fromPhoneNum;
	}

	public void setFromPhoneNum(String fromPhoneNum) {
		this.fromPhoneNum = fromPhoneNum;
		if(fromPhoneNum != null){
			putBodyParameter("FromPhoneNum", fromPhoneNum);
		}
	}

	public String getInterveneTime() {
		return this.interveneTime;
	}

	public void setInterveneTime(String interveneTime) {
		this.interveneTime = interveneTime;
		if(interveneTime != null){
			putBodyParameter("InterveneTime", interveneTime);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putBodyParameter("BizType", bizType);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getToPhoneNum() {
		return this.toPhoneNum;
	}

	public void setToPhoneNum(String toPhoneNum) {
		this.toPhoneNum = toPhoneNum;
		if(toPhoneNum != null){
			putBodyParameter("ToPhoneNum", toPhoneNum);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putBodyParameter("BizId", bizId);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getCallType() {
		return this.callType;
	}

	public void setCallType(String callType) {
		this.callType = callType;
		if(callType != null){
			putBodyParameter("CallType", callType);
		}
	}

	public String getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
		if(userInfo != null){
			putBodyParameter("UserInfo", userInfo);
		}
	}

	@Override
	public Class<CreateOuterCallCenterDataResponse> getResponseClass() {
		return CreateOuterCallCenterDataResponse.class;
	}

}
