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

package com.aliyuncs.uisplus.model.v20200707;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.uisplus.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteGreConnectionRequest extends RpcAcsRequest<DeleteGreConnectionResponse> {
	   

	private String clientToken;

	private String greConnectionId;

	private String resourceMode;

	private String uisId;
	public DeleteGreConnectionRequest() {
		super("Uisplus", "2020-07-07", "DeleteGreConnection", "uisplus");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getGreConnectionId() {
		return this.greConnectionId;
	}

	public void setGreConnectionId(String greConnectionId) {
		this.greConnectionId = greConnectionId;
		if(greConnectionId != null){
			putQueryParameter("GreConnectionId", greConnectionId);
		}
	}

	public String getResourceMode() {
		return this.resourceMode;
	}

	public void setResourceMode(String resourceMode) {
		this.resourceMode = resourceMode;
		if(resourceMode != null){
			putQueryParameter("ResourceMode", resourceMode);
		}
	}

	public String getUisId() {
		return this.uisId;
	}

	public void setUisId(String uisId) {
		this.uisId = uisId;
		if(uisId != null){
			putQueryParameter("UisId", uisId);
		}
	}

	@Override
	public Class<DeleteGreConnectionResponse> getResponseClass() {
		return DeleteGreConnectionResponse.class;
	}

}
