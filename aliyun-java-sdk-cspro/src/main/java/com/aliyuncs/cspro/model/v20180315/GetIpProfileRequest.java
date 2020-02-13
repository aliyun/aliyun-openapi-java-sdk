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

package com.aliyuncs.cspro.model.v20180315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetIpProfileRequest extends RpcAcsRequest<GetIpProfileResponse> {
	   

	private String ip;
	public GetIpProfileRequest() {
		super("cspro", "2018-03-15", "GetIpProfile", "cspro");
		setMethod(MethodType.GET);
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putQueryParameter("Ip", ip);
		}
	}

	@Override
	public Class<GetIpProfileResponse> getResponseClass() {
		return GetIpProfileResponse.class;
	}

}
