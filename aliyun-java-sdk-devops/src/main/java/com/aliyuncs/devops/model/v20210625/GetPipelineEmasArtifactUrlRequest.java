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
public class GetPipelineEmasArtifactUrlRequest extends RoaAcsRequest<GetPipelineEmasArtifactUrlResponse> {
	   

	private Long serviceConnectionId;

	private String emasJobInstanceId;

	private Long pipelineId;

	private String organizationId;

	private Long pipelineRunId;

	private String md5;
	public GetPipelineEmasArtifactUrlRequest() {
		super("devops", "2021-06-25", "GetPipelineEmasArtifactUrl");
		setUriPattern("/organization/[organizationId]/pipeline/[pipelineId]/pipelineRun/[pipelineRunId]/emas/artifact/[emasJobInstanceId]/[md5]");
		setMethod(MethodType.POST);
	}

	public Long getServiceConnectionId() {
		return this.serviceConnectionId;
	}

	public void setServiceConnectionId(Long serviceConnectionId) {
		this.serviceConnectionId = serviceConnectionId;
		if(serviceConnectionId != null){
			putQueryParameter("serviceConnectionId", serviceConnectionId.toString());
		}
	}

	public String getEmasJobInstanceId() {
		return this.emasJobInstanceId;
	}

	public void setEmasJobInstanceId(String emasJobInstanceId) {
		this.emasJobInstanceId = emasJobInstanceId;
		if(emasJobInstanceId != null){
			putPathParameter("emasJobInstanceId", emasJobInstanceId);
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

	public Long getPipelineRunId() {
		return this.pipelineRunId;
	}

	public void setPipelineRunId(Long pipelineRunId) {
		this.pipelineRunId = pipelineRunId;
		if(pipelineRunId != null){
			putPathParameter("pipelineRunId", pipelineRunId.toString());
		}
	}

	public String getMd5() {
		return this.md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
		if(md5 != null){
			putPathParameter("md5", md5);
		}
	}

	@Override
	public Class<GetPipelineEmasArtifactUrlResponse> getResponseClass() {
		return GetPipelineEmasArtifactUrlResponse.class;
	}

}
