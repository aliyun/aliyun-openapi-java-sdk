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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateExportMigrationRequest extends RpcAcsRequest<CreateExportMigrationResponse> {
	   

	private Long incrementalSince;

	private String description;

	private String exportObjectStatus;

	private String exportMode;

	private String name;

	private Long projectId;
	public CreateExportMigrationRequest() {
		super("dataworks-public", "2020-05-18", "CreateExportMigration");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getIncrementalSince() {
		return this.incrementalSince;
	}

	public void setIncrementalSince(Long incrementalSince) {
		this.incrementalSince = incrementalSince;
		if(incrementalSince != null){
			putBodyParameter("IncrementalSince", incrementalSince.toString());
		}
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

	public String getExportObjectStatus() {
		return this.exportObjectStatus;
	}

	public void setExportObjectStatus(String exportObjectStatus) {
		this.exportObjectStatus = exportObjectStatus;
		if(exportObjectStatus != null){
			putBodyParameter("ExportObjectStatus", exportObjectStatus);
		}
	}

	public String getExportMode() {
		return this.exportMode;
	}

	public void setExportMode(String exportMode) {
		this.exportMode = exportMode;
		if(exportMode != null){
			putBodyParameter("ExportMode", exportMode);
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

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId.toString());
		}
	}

	@Override
	public Class<CreateExportMigrationResponse> getResponseClass() {
		return CreateExportMigrationResponse.class;
	}

}
