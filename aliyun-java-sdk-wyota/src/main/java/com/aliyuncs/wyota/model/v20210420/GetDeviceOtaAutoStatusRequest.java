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
public class GetDeviceOtaAutoStatusRequest extends RpcAcsRequest<GetDeviceOtaAutoStatusResponse> {
	   

	private Integer clientType;
	public GetDeviceOtaAutoStatusRequest() {
		super("wyota", "2021-04-20", "GetDeviceOtaAutoStatus");
		setMethod(MethodType.POST);
	}

	public Integer getClientType() {
		return this.clientType;
	}

	public void setClientType(Integer clientType) {
		this.clientType = clientType;
		if(clientType != null){
			putBodyParameter("ClientType", clientType.toString());
		}
	}

	@Override
	public Class<GetDeviceOtaAutoStatusResponse> getResponseClass() {
		return GetDeviceOtaAutoStatusResponse.class;
	}

}
