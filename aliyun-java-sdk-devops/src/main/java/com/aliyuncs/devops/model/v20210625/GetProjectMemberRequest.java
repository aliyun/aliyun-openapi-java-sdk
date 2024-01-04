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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetProjectMemberRequest extends RoaAcsRequest<GetProjectMemberResponse> {
	   

	private String organizationId;

	private String aliyunPk;

	private Long repositoryId;

	private String accessToken;
	public GetProjectMemberRequest() {
		super("devops", "2021-06-25", "GetProjectMember");
		setUriPattern("/repository/[repositoryId]/members/get/[aliyunPk]");
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

	public String getAliyunPk() {
		return this.aliyunPk;
	}

	public void setAliyunPk(String aliyunPk) {
		this.aliyunPk = aliyunPk;
		if(aliyunPk != null){
			putPathParameter("aliyunPk", aliyunPk);
		}
	}

	public Long getRepositoryId() {
		return this.repositoryId;
	}

	public void setRepositoryId(Long repositoryId) {
		this.repositoryId = repositoryId;
		if(repositoryId != null){
			putPathParameter("repositoryId", repositoryId.toString());
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

	@Override
	public Class<GetProjectMemberResponse> getResponseClass() {
		return GetProjectMemberResponse.class;
	}

}
