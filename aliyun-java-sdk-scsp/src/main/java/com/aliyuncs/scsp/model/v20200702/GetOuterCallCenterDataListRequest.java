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
public class GetOuterCallCenterDataListRequest extends RpcAcsRequest<GetOuterCallCenterDataListResponse> {
	   

	private String queryEndTime;

	private String instanceId;

	private String toPhoneNum;

	private String queryStartTime;

	private String bizId;

	private String sessionId;

	private String fromPhoneNum;
	public GetOuterCallCenterDataListRequest() {
		super("scsp", "2020-07-02", "GetOuterCallCenterDataList", "scsp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getQueryEndTime() {
		return this.queryEndTime;
	}

	public void setQueryEndTime(String queryEndTime) {
		this.queryEndTime = queryEndTime;
		if(queryEndTime != null){
			putBodyParameter("QueryEndTime", queryEndTime);
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

	public String getQueryStartTime() {
		return this.queryStartTime;
	}

	public void setQueryStartTime(String queryStartTime) {
		this.queryStartTime = queryStartTime;
		if(queryStartTime != null){
			putBodyParameter("QueryStartTime", queryStartTime);
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

	@Override
	public Class<GetOuterCallCenterDataListResponse> getResponseClass() {
		return GetOuterCallCenterDataListResponse.class;
	}

}
