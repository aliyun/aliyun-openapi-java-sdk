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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateVersionPrepublishRequest extends RpcAcsRequest<CreateVersionPrepublishResponse> {
	   

	private String barrierCount;

	private String versionId;

	private String versionType;

	private String name;

	private String isTotalPrepublish;

	private String projectId;
	public CreateVersionPrepublishRequest() {
		super("iovcc", "2018-05-01", "CreateVersionPrepublish", "iovcc");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBarrierCount() {
		return this.barrierCount;
	}

	public void setBarrierCount(String barrierCount) {
		this.barrierCount = barrierCount;
		if(barrierCount != null){
			putQueryParameter("BarrierCount", barrierCount);
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

	public String getVersionType() {
		return this.versionType;
	}

	public void setVersionType(String versionType) {
		this.versionType = versionType;
		if(versionType != null){
			putQueryParameter("VersionType", versionType);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getIsTotalPrepublish() {
		return this.isTotalPrepublish;
	}

	public void setIsTotalPrepublish(String isTotalPrepublish) {
		this.isTotalPrepublish = isTotalPrepublish;
		if(isTotalPrepublish != null){
			putQueryParameter("IsTotalPrepublish", isTotalPrepublish);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	@Override
	public Class<CreateVersionPrepublishResponse> getResponseClass() {
		return CreateVersionPrepublishResponse.class;
	}

}
