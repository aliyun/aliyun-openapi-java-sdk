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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchUnbindParentPlatformDevicesRequest extends RpcAcsRequest<BatchUnbindParentPlatformDevicesResponse> {
	   

	private String parentPlatformId;

	private Long ownerId;

	private String deviceId;
	public BatchUnbindParentPlatformDevicesRequest() {
		super("vs", "2018-12-12", "BatchUnbindParentPlatformDevices");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getParentPlatformId() {
		return this.parentPlatformId;
	}

	public void setParentPlatformId(String parentPlatformId) {
		this.parentPlatformId = parentPlatformId;
		if(parentPlatformId != null){
			putQueryParameter("ParentPlatformId", parentPlatformId);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
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

	@Override
	public Class<BatchUnbindParentPlatformDevicesResponse> getResponseClass() {
		return BatchUnbindParentPlatformDevicesResponse.class;
	}

}
