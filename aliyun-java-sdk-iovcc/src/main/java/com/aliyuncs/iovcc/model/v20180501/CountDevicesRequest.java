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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CountDevicesRequest extends RpcAcsRequest<CountDevicesResponse> {
	   

	private Integer deviceModelId;

	private String projectId;

	private String deviceModel;
	public CountDevicesRequest() {
		super("iovcc", "2018-05-01", "CountDevices", "iovcc");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getDeviceModelId() {
		return this.deviceModelId;
	}

	public void setDeviceModelId(Integer deviceModelId) {
		this.deviceModelId = deviceModelId;
		if(deviceModelId != null){
			putQueryParameter("DeviceModelId", deviceModelId.toString());
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

	public String getDeviceModel() {
		return this.deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
		if(deviceModel != null){
			putQueryParameter("DeviceModel", deviceModel);
		}
	}

	@Override
	public Class<CountDevicesResponse> getResponseClass() {
		return CountDevicesResponse.class;
	}

}
