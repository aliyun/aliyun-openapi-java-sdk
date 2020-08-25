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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddLinkeBahamutAdminpipelineRequest extends RpcAcsRequest<AddLinkeBahamutAdminpipelineResponse> {
	   

	private String description;

	private String externalPipelineId;

	private Long pipelineInstanceId;

	private List<String> tagsRepeatLists;

	private String context;

	private String tenantId;

	private Long id;

	private String externalExecId;

	private String stageEnv;

	private String name;

	private List<String> stageListRepeatLists;

	private String status;
	public AddLinkeBahamutAdminpipelineRequest() {
		super("SOFA", "2019-08-15", "AddLinkeBahamutAdminpipeline", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getExternalPipelineId() {
		return this.externalPipelineId;
	}

	public void setExternalPipelineId(String externalPipelineId) {
		this.externalPipelineId = externalPipelineId;
		if(externalPipelineId != null){
			putBodyParameter("ExternalPipelineId", externalPipelineId);
		}
	}

	public Long getPipelineInstanceId() {
		return this.pipelineInstanceId;
	}

	public void setPipelineInstanceId(Long pipelineInstanceId) {
		this.pipelineInstanceId = pipelineInstanceId;
		if(pipelineInstanceId != null){
			putBodyParameter("PipelineInstanceId", pipelineInstanceId.toString());
		}
	}

	public List<String> getTagsRepeatLists() {
		return this.tagsRepeatLists;
	}

	public void setTagsRepeatLists(List<String> tagsRepeatLists) {
		this.tagsRepeatLists = tagsRepeatLists;	
		if (tagsRepeatLists != null) {
			for (int i = 0; i < tagsRepeatLists.size(); i++) {
				putBodyParameter("TagsRepeatList." + (i + 1) , tagsRepeatLists.get(i));
			}
		}	
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
		if(context != null){
			putBodyParameter("Context", context);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getExternalExecId() {
		return this.externalExecId;
	}

	public void setExternalExecId(String externalExecId) {
		this.externalExecId = externalExecId;
		if(externalExecId != null){
			putBodyParameter("ExternalExecId", externalExecId);
		}
	}

	public String getStageEnv() {
		return this.stageEnv;
	}

	public void setStageEnv(String stageEnv) {
		this.stageEnv = stageEnv;
		if(stageEnv != null){
			putBodyParameter("StageEnv", stageEnv);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public List<String> getStageListRepeatLists() {
		return this.stageListRepeatLists;
	}

	public void setStageListRepeatLists(List<String> stageListRepeatLists) {
		this.stageListRepeatLists = stageListRepeatLists;	
		if (stageListRepeatLists != null) {
			for (int i = 0; i < stageListRepeatLists.size(); i++) {
				putBodyParameter("StageListRepeatList." + (i + 1) , stageListRepeatLists.get(i));
			}
		}	
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<AddLinkeBahamutAdminpipelineResponse> getResponseClass() {
		return AddLinkeBahamutAdminpipelineResponse.class;
	}

}
