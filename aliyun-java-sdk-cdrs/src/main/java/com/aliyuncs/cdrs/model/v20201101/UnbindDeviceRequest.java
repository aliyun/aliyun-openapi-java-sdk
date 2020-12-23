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

package com.aliyuncs.cdrs.model.v20201101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UnbindDeviceRequest extends RpcAcsRequest<UnbindDeviceResponse> {
	   

	private String deviceIds;

	private String corpId;
	public UnbindDeviceRequest() {
		super("CDRS", "2020-11-01", "UnbindDevice");
		setMethod(MethodType.POST);
	}

	public String getDeviceIds() {
		return this.deviceIds;
	}

	public void setDeviceIds(String deviceIds) {
		this.deviceIds = deviceIds;
		if(deviceIds != null){
			putBodyParameter("DeviceIds", deviceIds);
		}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	@Override
	public Class<UnbindDeviceResponse> getResponseClass() {
		return UnbindDeviceResponse.class;
	}

}
