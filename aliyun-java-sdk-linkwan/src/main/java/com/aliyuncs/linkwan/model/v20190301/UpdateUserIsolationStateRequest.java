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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkwan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateUserIsolationStateRequest extends RpcAcsRequest<UpdateUserIsolationStateResponse> {
	   

	private Boolean isolated;
	public UpdateUserIsolationStateRequest() {
		super("LinkWAN", "2019-03-01", "UpdateUserIsolationState", "linkwan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIsolated() {
		return this.isolated;
	}

	public void setIsolated(Boolean isolated) {
		this.isolated = isolated;
		if(isolated != null){
			putQueryParameter("Isolated", isolated.toString());
		}
	}

	@Override
	public Class<UpdateUserIsolationStateResponse> getResponseClass() {
		return UpdateUserIsolationStateResponse.class;
	}

}
