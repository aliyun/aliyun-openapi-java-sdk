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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ChangeWorkModeRequest extends RpcAcsRequest<ChangeWorkModeResponse> {
	   

	private String signedSkillGroupIdList;

	private String mobile;

	private String workMode;

	private String userId;

	private String deviceId;

	private String instanceId;
	public ChangeWorkModeRequest() {
		super("CCC", "2020-07-01", "ChangeWorkMode", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSignedSkillGroupIdList() {
		return this.signedSkillGroupIdList;
	}

	public void setSignedSkillGroupIdList(String signedSkillGroupIdList) {
		this.signedSkillGroupIdList = signedSkillGroupIdList;
		if(signedSkillGroupIdList != null){
			putQueryParameter("SignedSkillGroupIdList", signedSkillGroupIdList);
		}
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
		if(mobile != null){
			putQueryParameter("Mobile", mobile);
		}
	}

	public String getWorkMode() {
		return this.workMode;
	}

	public void setWorkMode(String workMode) {
		this.workMode = workMode;
		if(workMode != null){
			putQueryParameter("WorkMode", workMode);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		if(deviceId != null){
			putQueryParameter("DeviceId", deviceId);
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

	@Override
	public Class<ChangeWorkModeResponse> getResponseClass() {
		return ChangeWorkModeResponse.class;
	}

}
