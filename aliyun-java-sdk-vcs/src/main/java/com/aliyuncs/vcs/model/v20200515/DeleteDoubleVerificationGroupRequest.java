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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteDoubleVerificationGroupRequest extends RpcAcsRequest<DeleteDoubleVerificationGroupResponse> {
	   

	private String doubleVerificationGroupId;

	private String id;
	public DeleteDoubleVerificationGroupRequest() {
		super("Vcs", "2020-05-15", "DeleteDoubleVerificationGroup");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDoubleVerificationGroupId() {
		return this.doubleVerificationGroupId;
	}

	public void setDoubleVerificationGroupId(String doubleVerificationGroupId) {
		this.doubleVerificationGroupId = doubleVerificationGroupId;
		if(doubleVerificationGroupId != null){
			putBodyParameter("DoubleVerificationGroupId", doubleVerificationGroupId);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	@Override
	public Class<DeleteDoubleVerificationGroupResponse> getResponseClass() {
		return DeleteDoubleVerificationGroupResponse.class;
	}

}
