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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceOtaInfoTestRequest extends RpcAcsRequest<GetDeviceOtaInfoTestResponse> {
	   

	private String deviceId;

	private String baseVersion;

	private String tenantId;

	private String model;
	public GetDeviceOtaInfoTestRequest() {
		super("wyota", "2021-04-20", "GetDeviceOtaInfoTest");
		setMethod(MethodType.POST);
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		if(deviceId != null){
			putBodyParameter("DeviceId", deviceId);
		}
	}

	public String getBaseVersion() {
		return this.baseVersion;
	}

	public void setBaseVersion(String baseVersion) {
		this.baseVersion = baseVersion;
		if(baseVersion != null){
			putBodyParameter("BaseVersion", baseVersion);
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

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
		if(model != null){
			putBodyParameter("Model", model);
		}
	}

	@Override
	public Class<GetDeviceOtaInfoTestResponse> getResponseClass() {
		return GetDeviceOtaInfoTestResponse.class;
	}

}
