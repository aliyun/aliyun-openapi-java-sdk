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

package com.aliyuncs.resourcemanager.model.v20200331;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resourcemanager.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeclineHandshakeRequest extends RpcAcsRequest<DeclineHandshakeResponse> {
	   

	private String handshakeId;
	public DeclineHandshakeRequest() {
		super("ResourceManager", "2020-03-31", "DeclineHandshake", "resourcemanager");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHandshakeId() {
		return this.handshakeId;
	}

	public void setHandshakeId(String handshakeId) {
		this.handshakeId = handshakeId;
		if(handshakeId != null){
			putQueryParameter("HandshakeId", handshakeId);
		}
	}

	@Override
	public Class<DeclineHandshakeResponse> getResponseClass() {
		return DeclineHandshakeResponse.class;
	}

}
