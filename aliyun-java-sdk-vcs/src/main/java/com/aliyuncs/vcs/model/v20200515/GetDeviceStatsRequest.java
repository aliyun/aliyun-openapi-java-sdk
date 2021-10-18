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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceStatsRequest extends RpcAcsRequest<GetDeviceStatsResponse> {
	   

	private String deviceStatus;

	private String deviceType;

	private String corpIdList;
	public GetDeviceStatsRequest() {
		super("Vcs", "2020-05-15", "GetDeviceStats");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDeviceStatus() {
		return this.deviceStatus;
	}

	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
		if(deviceStatus != null){
			putBodyParameter("DeviceStatus", deviceStatus);
		}
	}

	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
		if(deviceType != null){
			putBodyParameter("DeviceType", deviceType);
		}
	}

	public String getCorpIdList() {
		return this.corpIdList;
	}

	public void setCorpIdList(String corpIdList) {
		this.corpIdList = corpIdList;
		if(corpIdList != null){
			putBodyParameter("CorpIdList", corpIdList);
		}
	}

	@Override
	public Class<GetDeviceStatsResponse> getResponseClass() {
		return GetDeviceStatsResponse.class;
	}

}
