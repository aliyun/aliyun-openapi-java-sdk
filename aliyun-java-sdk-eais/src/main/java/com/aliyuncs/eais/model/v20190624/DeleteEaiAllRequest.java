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
public class DeleteEaiAllRequest extends RpcAcsRequest<DeleteEaiAllResponse> {
	   

	private String clientInstanceId;

	private String elasticAcceleratedInstanceId;
	public DeleteEaiAllRequest() {
		super("eais", "2019-06-24", "DeleteEaiAll", "eais");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getElasticAcceleratedInstanceId() {
		return this.elasticAcceleratedInstanceId;
	}

	public void setElasticAcceleratedInstanceId(String elasticAcceleratedInstanceId) {
		this.elasticAcceleratedInstanceId = elasticAcceleratedInstanceId;
		if(elasticAcceleratedInstanceId != null){
			putQueryParameter("ElasticAcceleratedInstanceId", elasticAcceleratedInstanceId);
		}
	}

	@Override
	public Class<DeleteEaiAllResponse> getResponseClass() {
		return DeleteEaiAllResponse.class;
	}

}
