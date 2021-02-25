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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteBackupClientResourceRequest extends RpcAcsRequest<DeleteBackupClientResourceResponse> {
	   

	private String clientIds;
	public DeleteBackupClientResourceRequest() {
		super("hbr", "2017-09-08", "DeleteBackupClientResource", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientIds() {
		return this.clientIds;
	}

	public void setClientIds(String clientIds) {
		this.clientIds = clientIds;
		if(clientIds != null){
			putQueryParameter("ClientIds", clientIds);
		}
	}

	@Override
	public Class<DeleteBackupClientResourceResponse> getResponseClass() {
		return DeleteBackupClientResourceResponse.class;
	}

}
