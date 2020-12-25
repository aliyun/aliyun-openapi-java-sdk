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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetContentKeyRequest extends RpcAcsRequest<GetContentKeyResponse> {
	   

	private String project;

	private String versionId;

	private String dRMServerId;

	private String keyIds;
	public GetContentKeyRequest() {
		super("imm", "2017-09-06", "GetContentKey");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
		if(versionId != null){
			putQueryParameter("VersionId", versionId);
		}
	}

	public String getDRMServerId() {
		return this.dRMServerId;
	}

	public void setDRMServerId(String dRMServerId) {
		this.dRMServerId = dRMServerId;
		if(dRMServerId != null){
			putQueryParameter("DRMServerId", dRMServerId);
		}
	}

	public String getKeyIds() {
		return this.keyIds;
	}

	public void setKeyIds(String keyIds) {
		this.keyIds = keyIds;
		if(keyIds != null){
			putQueryParameter("KeyIds", keyIds);
		}
	}

	@Override
	public Class<GetContentKeyResponse> getResponseClass() {
		return GetContentKeyResponse.class;
	}

}
