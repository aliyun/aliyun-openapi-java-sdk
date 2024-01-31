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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetCheckRunRequest extends RoaAcsRequest<GetCheckRunResponse> {
	   

	private String organizationId;

	private String repositoryIdentity;

	private String accessToken;

	private Long checkRunId;
	public GetCheckRunRequest() {
		super("devops", "2021-06-25", "GetCheckRun");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v4/projects/check_runs/get_check_run");
		setMethod(MethodType.GET);
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putQueryParameter("organizationId", organizationId);
		}
	}

	public String getRepositoryIdentity() {
		return this.repositoryIdentity;
	}

	public void setRepositoryIdentity(String repositoryIdentity) {
		this.repositoryIdentity = repositoryIdentity;
		if(repositoryIdentity != null){
			putQueryParameter("repositoryIdentity", repositoryIdentity);
		}
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
		if(accessToken != null){
			putQueryParameter("accessToken", accessToken);
		}
	}

	public Long getCheckRunId() {
		return this.checkRunId;
	}

	public void setCheckRunId(Long checkRunId) {
		this.checkRunId = checkRunId;
		if(checkRunId != null){
			putQueryParameter("checkRunId", checkRunId.toString());
		}
	}

	@Override
	public Class<GetCheckRunResponse> getResponseClass() {
		return GetCheckRunResponse.class;
	}

}
