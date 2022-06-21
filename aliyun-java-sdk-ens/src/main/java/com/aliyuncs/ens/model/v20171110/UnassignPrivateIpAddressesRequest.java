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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UnassignPrivateIpAddressesRequest extends RpcAcsRequest<UnassignPrivateIpAddressesResponse> {
	   

	private List<String> privateIpAddress;

	private String networkInterfaceId;
	public UnassignPrivateIpAddressesRequest() {
		super("Ens", "2017-11-10", "UnassignPrivateIpAddresses", "ens");
		setMethod(MethodType.POST);
	}

	public List<String> getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(List<String> privateIpAddress) {
		this.privateIpAddress = privateIpAddress;	
		if (privateIpAddress != null) {
			for (int depth1 = 0; depth1 < privateIpAddress.size(); depth1++) {
				putQueryParameter("PrivateIpAddress." + (depth1 + 1) , privateIpAddress.get(depth1));
			}
		}	
	}

	public String getNetworkInterfaceId() {
		return this.networkInterfaceId;
	}

	public void setNetworkInterfaceId(String networkInterfaceId) {
		this.networkInterfaceId = networkInterfaceId;
		if(networkInterfaceId != null){
			putQueryParameter("NetworkInterfaceId", networkInterfaceId);
		}
	}

	@Override
	public Class<UnassignPrivateIpAddressesResponse> getResponseClass() {
		return UnassignPrivateIpAddressesResponse.class;
	}

}
