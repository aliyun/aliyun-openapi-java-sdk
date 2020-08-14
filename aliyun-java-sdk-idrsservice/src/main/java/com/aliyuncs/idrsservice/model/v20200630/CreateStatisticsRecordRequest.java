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

package com.aliyuncs.idrsservice.model.v20200630;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateStatisticsRecordRequest extends RpcAcsRequest<CreateStatisticsRecordResponse> {
	   

	private String beginAt;

	private String clientToken;

	private String endAt;

	private String deviceId;

	private Integer deviceType;

	private String appId;
	public CreateStatisticsRecordRequest() {
		super("idrsservice", "2020-06-30", "CreateStatisticsRecord", "idrsservice");
		setMethod(MethodType.POST);
	}

	public String getBeginAt() {
		return this.beginAt;
	}

	public void setBeginAt(String beginAt) {
		this.beginAt = beginAt;
		if(beginAt != null){
			putQueryParameter("BeginAt", beginAt);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getEndAt() {
		return this.endAt;
	}

	public void setEndAt(String endAt) {
		this.endAt = endAt;
		if(endAt != null){
			putQueryParameter("EndAt", endAt);
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

	public Integer getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(Integer deviceType) {
		this.deviceType = deviceType;
		if(deviceType != null){
			putQueryParameter("DeviceType", deviceType.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	@Override
	public Class<CreateStatisticsRecordResponse> getResponseClass() {
		return CreateStatisticsRecordResponse.class;
	}

}
