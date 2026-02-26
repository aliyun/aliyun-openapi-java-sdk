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
public class CreateUdfRequest extends RpcAcsRequest<CreateUdfResponse> {
	   

	private Long opTenantId;

	@SerializedName("createCommand")
	private CreateCommand createCommand;
	public CreateUdfRequest() {
		super("dataphin-public", "2023-06-30", "CreateUdf");
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

		@SerializedName("ComputeEngineType")
		private String computeEngineType;

		@SerializedName("RefResourceIdList")
		private List<Long> refResourceIdList;

		@SerializedName("ClassName")
		private String className;

		@SerializedName("Name")
		private String name;

		@SerializedName("Description")
		private String description;

		@SerializedName("Comment")
		private String comment;

		@SerializedName("Category")
		private Integer category;

		@SerializedName("CommandHelp")
		private String commandHelp;

		@SerializedName("ProjectId")
		private Long projectId;

		@SerializedName("Directory")
		private String directory;

		public String getComputeEngineType() {
			return this.computeEngineType;
		}

		public void setComputeEngineType(String computeEngineType) {
			this.computeEngineType = computeEngineType;
		}

		public List<Long> getRefResourceIdList() {
			return this.refResourceIdList;
		}

		public void setRefResourceIdList(List<Long> refResourceIdList) {
			this.refResourceIdList = refResourceIdList;
		}

		public String getClassName() {
			return this.className;
		}

		public void setClassName(String className) {
			this.className = className;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public Integer getCategory() {
			return this.category;
		}

		public void setCategory(Integer category) {
			this.category = category;
		}

		public String getCommandHelp() {
			return this.commandHelp;
		}

		public void setCommandHelp(String commandHelp) {
			this.commandHelp = commandHelp;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getDirectory() {
			return this.directory;
		}

		public void setDirectory(String directory) {
			this.directory = directory;
		}
	}

	@Override
	public Class<CreateUdfResponse> getResponseClass() {
		return CreateUdfResponse.class;
	}

}
