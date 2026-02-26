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

package com.aliyuncs.eais.model.v20190624;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eais.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AttachEaisEiRequest extends RpcAcsRequest<AttachEaisEiResponse> {
	   

	private String eiInstanceType;

	private String clientInstanceId;

	private String eiInstanceId;
	public AttachEaisEiRequest() {
		super("eais", "2019-06-24", "AttachEaisEi", "eais");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEiInstanceType() {
		return this.eiInstanceType;
	}

	public void setEiInstanceType(String eiInstanceType) {
		this.eiInstanceType = eiInstanceType;
		if(eiInstanceType != null){
			putQueryParameter("EiInstanceType", eiInstanceType);
		}
	}

	public String getClientInstanceId() {
		return this.clientInstanceId;
	}

	public void setClientInstanceId(String clientInstanceId) {
		this.clientInstanceId = clientInstanceId;
		if(clientInstanceId != null){
			putQueryParameter("ClientInstanceId", clientInstanceId);
		}
	}

	public String getEiInstanceId() {
		return this.eiInstanceId;
	}

	public void setEiInstanceId(String eiInstanceId) {
		this.eiInstanceId = eiInstanceId;
		if(eiInstanceId != null){
			putQueryParameter("EiInstanceId", eiInstanceId);
		}
	}

	@Override
	public Class<AttachEaisEiResponse> getResponseClass() {
		return AttachEaisEiResponse.class;
	}

}
