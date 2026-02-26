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
public class UpdatePipelineBaseInfoRequest extends RoaAcsRequest<UpdatePipelineBaseInfoResponse> {
	   

	private String pipelineName;

	private Long envId;

	private String pipelineId;

	private String tagList;

	private String organizationId;
	public UpdatePipelineBaseInfoRequest() {
		super("devops", "2021-06-25", "UpdatePipelineBaseInfo");
		setUriPattern("/organization/[organizationId]/pipelines/[pipelineId]/baseInfo");
		setMethod(MethodType.PUT);
	}

	public String getPipelineName() {
		return this.pipelineName;
	}

	public void setPipelineName(String pipelineName) {
		this.pipelineName = pipelineName;
		if(pipelineName != null){
			putQueryParameter("pipelineName", pipelineName);
		}
	}

	public Long getEnvId() {
		return this.envId;
	}

	public void setEnvId(Long envId) {
		this.envId = envId;
		if(envId != null){
			putQueryParameter("envId", envId.toString());
		}
	}

	public String getPipelineId() {
		return this.pipelineId;
	}

	public void setPipelineId(String pipelineId) {
		this.pipelineId = pipelineId;
		if(pipelineId != null){
			putPathParameter("pipelineId", pipelineId);
		}
	}

	public String getTagList() {
		return this.tagList;
	}

	public void setTagList(String tagList) {
		this.tagList = tagList;
		if(tagList != null){
			putQueryParameter("tagList", tagList);
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
	public Class<UpdatePipelineBaseInfoResponse> getResponseClass() {
		return UpdatePipelineBaseInfoResponse.class;
	}

}
