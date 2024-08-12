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
public class ModifyDevicesSecureNetworkTypeRequest extends RpcAcsRequest<ModifyDevicesSecureNetworkTypeResponse> {
	   

	private String serialNos;

	private String secureNetworkType;

	private Long allDevices;
	public ModifyDevicesSecureNetworkTypeRequest() {
		super("wyota", "2021-04-20", "ModifyDevicesSecureNetworkType");
		setMethod(MethodType.POST);
	}

	public String getSerialNos() {
		return this.serialNos;
	}

	public void setSerialNos(String serialNos) {
		this.serialNos = serialNos;
		if(serialNos != null){
			putBodyParameter("SerialNos", serialNos);
		}
	}

	public String getSecureNetworkType() {
		return this.secureNetworkType;
	}

	public void setSecureNetworkType(String secureNetworkType) {
		this.secureNetworkType = secureNetworkType;
		if(secureNetworkType != null){
			putBodyParameter("SecureNetworkType", secureNetworkType);
		}
	}

	public Long getAllDevices() {
		return this.allDevices;
	}

	public void setAllDevices(Long allDevices) {
		this.allDevices = allDevices;
		if(allDevices != null){
			putBodyParameter("AllDevices", allDevices.toString());
		}
	}

	@Override
	public Class<ModifyDevicesSecureNetworkTypeResponse> getResponseClass() {
		return ModifyDevicesSecureNetworkTypeResponse.class;
	}

}
