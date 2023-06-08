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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resourcemanager.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetServiceLinkedRoleDeletionStatusRequest extends RpcAcsRequest<GetServiceLinkedRoleDeletionStatusResponse> {
	   

	private String deletionTaskId;
	public GetServiceLinkedRoleDeletionStatusRequest() {
		super("ResourceManager", "2020-03-31", "GetServiceLinkedRoleDeletionStatus", "resourcemanager");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDeletionTaskId() {
		return this.deletionTaskId;
	}

	public void setDeletionTaskId(String deletionTaskId) {
		this.deletionTaskId = deletionTaskId;
		if(deletionTaskId != null){
			putQueryParameter("DeletionTaskId", deletionTaskId);
		}
	}

	@Override
	public Class<GetServiceLinkedRoleDeletionStatusResponse> getResponseClass() {
		return GetServiceLinkedRoleDeletionStatusResponse.class;
	}

}
