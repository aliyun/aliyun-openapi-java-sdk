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
public class DeletePipelineRelationsRequest extends RoaAcsRequest<DeletePipelineRelationsResponse> {
	   

	private String relObjectType;

	private String relObjectId;

	private Long pipelineId;

	private String organizationId;
	public DeletePipelineRelationsRequest() {
		super("devops", "2021-06-25", "DeletePipelineRelations");
		setUriPattern("/organization/[organizationId]/[pipelineId]/pipelineRelations");
		setMethod(MethodType.DELETE);
	}

	public String getRelObjectType() {
		return this.relObjectType;
	}

	public void setRelObjectType(String relObjectType) {
		this.relObjectType = relObjectType;
		if(relObjectType != null){
			putQueryParameter("relObjectType", relObjectType);
		}
	}

	public String getRelObjectId() {
		return this.relObjectId;
	}

	public void setRelObjectId(String relObjectId) {
		this.relObjectId = relObjectId;
		if(relObjectId != null){
			putQueryParameter("relObjectId", relObjectId);
		}
	}

	public Long getPipelineId() {
		return this.pipelineId;
	}

	public void setPipelineId(Long pipelineId) {
		this.pipelineId = pipelineId;
		if(pipelineId != null){
			putPathParameter("pipelineId", pipelineId.toString());
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
		}
	}

	@Override
	public Class<DeletePipelineRelationsResponse> getResponseClass() {
		return DeletePipelineRelationsResponse.class;
	}

}
