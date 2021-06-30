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
public class StopStreamsRequest extends RpcAcsRequest<StopStreamsResponse> {
	   

	private String description;

	private String deviceIdList;
	public StopStreamsRequest() {
		super("Vcs", "2020-05-15", "StopStreams");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getDeviceIdList() {
		return this.deviceIdList;
	}

	public void setDeviceIdList(String deviceIdList) {
		this.deviceIdList = deviceIdList;
		if(deviceIdList != null){
			putBodyParameter("DeviceIdList", deviceIdList);
		}
	}

	@Override
	public Class<StopStreamsResponse> getResponseClass() {
		return StopStreamsResponse.class;
	}

}