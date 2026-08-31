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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateBatchTaskRequest extends RpcAcsRequest<CreateBatchTaskResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("createCommand")
	private CreateCommand createCommand;
	public CreateBatchTaskRequest() {
		super("dataphin-public", "2023-06-30", "CreateBatchTask", "Dataphin");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
		if(opUserId != null){
			putQueryParameter("OpUserId", opUserId);
		}
	}

	public CreateCommand getCreateCommand() {
		return this.createCommand;
	}

	public void setCreateCommand(CreateCommand createCommand) {
		this.createCommand = createCommand;	
		if (createCommand != null) {
			putBodyParameter("CreateCommand" , new Gson().toJson(createCommand));
		}	
	}

	public static class CreateCommand {

		@SerializedName("ScheduleType")
		private Integer scheduleType;

		@SerializedName("TaskType")
		private Integer taskType;

		@SerializedName("OpsOwnerIdList")
		private List<String> opsOwnerIdList;

		@SerializedName("DataSourceSchema")
		private String dataSourceSchema;

		@SerializedName("Description")
		private String description;

		@SerializedName("DataSourceCatalog")
		private String dataSourceCatalog;

		@SerializedName("Directory")
		private String directory;

		@SerializedName("Engine")
		private String engine;

		@SerializedName("DevelopOwnerIdList")
		private List<String> developOwnerIdList;

		@SerializedName("Name")
		private String name;

		@SerializedName("DataSourceId")
		private String dataSourceId;

		@SerializedName("ProjectId")
		private Long projectId;

		@SerializedName("PythonModuleList")
		private List<String> pythonModuleList;

		public Integer getScheduleType() {
			return this.scheduleType;
		}

		public void setScheduleType(Integer scheduleType) {
			this.scheduleType = scheduleType;
		}

		public Integer getTaskType() {
			return this.taskType;
		}

		public void setTaskType(Integer taskType) {
			this.taskType = taskType;
		}

		public List<String> getOpsOwnerIdList() {
			return this.opsOwnerIdList;
		}

		public void setOpsOwnerIdList(List<String> opsOwnerIdList) {
			this.opsOwnerIdList = opsOwnerIdList;
		}

		public String getDataSourceSchema() {
			return this.dataSourceSchema;
		}

		public void setDataSourceSchema(String dataSourceSchema) {
			this.dataSourceSchema = dataSourceSchema;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDataSourceCatalog() {
			return this.dataSourceCatalog;
		}

		public void setDataSourceCatalog(String dataSourceCatalog) {
			this.dataSourceCatalog = dataSourceCatalog;
		}

		public String getDirectory() {
			return this.directory;
		}

		public void setDirectory(String directory) {
			this.directory = directory;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public List<String> getDevelopOwnerIdList() {
			return this.developOwnerIdList;
		}

		public void setDevelopOwnerIdList(List<String> developOwnerIdList) {
			this.developOwnerIdList = developOwnerIdList;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(String dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public List<String> getPythonModuleList() {
			return this.pythonModuleList;
		}

		public void setPythonModuleList(List<String> pythonModuleList) {
			this.pythonModuleList = pythonModuleList;
		}
	}

	@Override
	public Class<CreateBatchTaskResponse> getResponseClass() {
		return CreateBatchTaskResponse.class;
	}

}
