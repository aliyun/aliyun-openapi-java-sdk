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

package com.aliyuncs.iotcc.model.v20210513;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GrantVirtualBorderRouterRequest extends RpcAcsRequest<GrantVirtualBorderRouterResponse> {
	   

	private String virtualBorderRouterId;
	public GrantVirtualBorderRouterRequest() {
		super("IoTCC", "2021-05-13", "GrantVirtualBorderRouter", "cciot");
		setMethod(MethodType.POST);
	}

	public String getVirtualBorderRouterId() {
		return this.virtualBorderRouterId;
	}

	public void setVirtualBorderRouterId(String virtualBorderRouterId) {
		this.virtualBorderRouterId = virtualBorderRouterId;
		if(virtualBorderRouterId != null){
			putQueryParameter("VirtualBorderRouterId", virtualBorderRouterId);
		}
	}

	@Override
	public Class<GrantVirtualBorderRouterResponse> getResponseClass() {
		return GrantVirtualBorderRouterResponse.class;
	}

}
