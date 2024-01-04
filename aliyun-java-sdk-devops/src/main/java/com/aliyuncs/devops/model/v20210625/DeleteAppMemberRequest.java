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
public class DeleteAppMemberRequest extends RoaAcsRequest<DeleteAppMemberResponse> {
	   

	private String organizationId;

	private String appName;

	private String subjectType;

	private String subjectId;
	public DeleteAppMemberRequest() {
		super("devops", "2021-06-25", "DeleteAppMember");
		setUriPattern("/appstack/apps/[appName]/members");
		setMethod(MethodType.DELETE);
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

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putPathParameter("appName", appName);
		}
	}

	public String getSubjectType() {
		return this.subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
		if(subjectType != null){
			putQueryParameter("subjectType", subjectType);
		}
	}

	public String getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
		if(subjectId != null){
			putQueryParameter("subjectId", subjectId);
		}
	}

	@Override
	public Class<DeleteAppMemberResponse> getResponseClass() {
		return DeleteAppMemberResponse.class;
	}

}
