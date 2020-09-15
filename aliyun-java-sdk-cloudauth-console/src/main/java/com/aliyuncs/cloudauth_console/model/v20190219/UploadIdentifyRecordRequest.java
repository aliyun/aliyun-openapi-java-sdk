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

package com.aliyuncs.cloudauth_console.model.v20190219;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth_console.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UploadIdentifyRecordRequest extends RpcAcsRequest<UploadIdentifyRecordResponse> {
	   

	private String identifyingImageUrl;

	private Long userId;

	private String iotId;

	private String projectId;

	private String identifyingImageBase64;

	private String deviceName;

	private Long identifyingTime;

	private String userName;
	public UploadIdentifyRecordRequest() {
		super("Cloudauth-console", "2019-02-19", "UploadIdentifyRecord");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIdentifyingImageUrl() {
		return this.identifyingImageUrl;
	}

	public void setIdentifyingImageUrl(String identifyingImageUrl) {
		this.identifyingImageUrl = identifyingImageUrl;
		if(identifyingImageUrl != null){
			putQueryParameter("IdentifyingImageUrl", identifyingImageUrl);
		}
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId.toString());
		}
	}

	public String getIotId() {
		return this.iotId;
	}

	public void setIotId(String iotId) {
		this.iotId = iotId;
		if(iotId != null){
			putQueryParameter("IotId", iotId);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public String getIdentifyingImageBase64() {
		return this.identifyingImageBase64;
	}

	public void setIdentifyingImageBase64(String identifyingImageBase64) {
		this.identifyingImageBase64 = identifyingImageBase64;
		if(identifyingImageBase64 != null){
			putBodyParameter("IdentifyingImageBase64", identifyingImageBase64);
		}
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		if(deviceName != null){
			putQueryParameter("DeviceName", deviceName);
		}
	}

	public Long getIdentifyingTime() {
		return this.identifyingTime;
	}

	public void setIdentifyingTime(Long identifyingTime) {
		this.identifyingTime = identifyingTime;
		if(identifyingTime != null){
			putQueryParameter("IdentifyingTime", identifyingTime.toString());
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<UploadIdentifyRecordResponse> getResponseClass() {
		return UploadIdentifyRecordResponse.class;
	}

}
