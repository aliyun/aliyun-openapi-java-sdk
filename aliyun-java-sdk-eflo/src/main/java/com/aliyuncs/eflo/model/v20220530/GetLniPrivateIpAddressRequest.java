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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetLniPrivateIpAddressRequest extends RpcAcsRequest<GetLniPrivateIpAddressResponse> {
	   

	private String ipName;

	private String networkInterfaceId;
	public GetLniPrivateIpAddressRequest() {
		super("eflo", "2022-05-30", "GetLniPrivateIpAddress", "eflo");
		setMethod(MethodType.POST);
	}

	public String getIpName() {
		return this.ipName;
	}

	public void setIpName(String ipName) {
		this.ipName = ipName;
		if(ipName != null){
			putBodyParameter("IpName", ipName);
		}
	}

	public String getNetworkInterfaceId() {
		return this.networkInterfaceId;
	}

	public void setNetworkInterfaceId(String networkInterfaceId) {
		this.networkInterfaceId = networkInterfaceId;
		if(networkInterfaceId != null){
			putBodyParameter("NetworkInterfaceId", networkInterfaceId);
		}
	}

	@Override
	public Class<GetLniPrivateIpAddressResponse> getResponseClass() {
		return GetLniPrivateIpAddressResponse.class;
	}

}
