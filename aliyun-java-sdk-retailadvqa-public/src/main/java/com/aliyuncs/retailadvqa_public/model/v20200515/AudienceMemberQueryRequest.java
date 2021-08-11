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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AudienceMemberQueryRequest extends RpcAcsRequest<AudienceMemberQueryResponse> {
	   

	private String accessId;

	private String delimiter;

	private String audienceId;

	private String workspaceId;

	private String mappingTypes;
	public AudienceMemberQueryRequest() {
		super("retailadvqa-public", "2020-05-15", "AudienceMemberQuery");
		setMethod(MethodType.POST);
	}

	public String getAccessId() {
		return this.accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
		if(accessId != null){
			putQueryParameter("AccessId", accessId);
		}
	}

	public String getDelimiter() {
		return this.delimiter;
	}

	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
		if(delimiter != null){
			putQueryParameter("Delimiter", delimiter);
		}
	}

	public String getAudienceId() {
		return this.audienceId;
	}

	public void setAudienceId(String audienceId) {
		this.audienceId = audienceId;
		if(audienceId != null){
			putQueryParameter("AudienceId", audienceId);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	public String getMappingTypes() {
		return this.mappingTypes;
	}

	public void setMappingTypes(String mappingTypes) {
		this.mappingTypes = mappingTypes;
		if(mappingTypes != null){
			putQueryParameter("MappingTypes", mappingTypes);
		}
	}

	@Override
	public Class<AudienceMemberQueryResponse> getResponseClass() {
		return AudienceMemberQueryResponse.class;
	}

}
