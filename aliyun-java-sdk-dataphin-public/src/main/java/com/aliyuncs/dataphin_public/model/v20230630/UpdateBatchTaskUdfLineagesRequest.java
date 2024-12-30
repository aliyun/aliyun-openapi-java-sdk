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
public class UpdateBatchTaskUdfLineagesRequest extends RpcAcsRequest<UpdateBatchTaskUdfLineagesResponse> {
	   

	private Long opTenantId;

	@SerializedName("updateCommand")
	private UpdateCommand updateCommand;
	public UpdateBatchTaskUdfLineagesRequest() {
		super("dataphin-public", "2023-06-30", "UpdateBatchTaskUdfLineages");
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

	public UpdateCommand getUpdateCommand() {
		return this.updateCommand;
	}

	public void setUpdateCommand(UpdateCommand updateCommand) {
		this.updateCommand = updateCommand;	
		if (updateCommand != null) {
			putBodyParameter("UpdateCommand" , new Gson().toJson(updateCommand));
		}	
	}

	public static class UpdateCommand {

		@SerializedName("LineageGroupList")
		private List<LineageGroupListItem> lineageGroupList;

		@SerializedName("ProjectId")
		private Long projectId;

		@SerializedName("FileId")
		private Long fileId;

		public List<LineageGroupListItem> getLineageGroupList() {
			return this.lineageGroupList;
		}

		public void setLineageGroupList(List<LineageGroupListItem> lineageGroupList) {
			this.lineageGroupList = lineageGroupList;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public Long getFileId() {
			return this.fileId;
		}

		public void setFileId(Long fileId) {
			this.fileId = fileId;
		}

		public static class LineageGroupListItem {

			@SerializedName("InputLineageList")
			private List<InputLineageListItem> inputLineageList;

			@SerializedName("OutputLineageList")
			private List<OutputLineageListItem> outputLineageList;

			public List<InputLineageListItem> getInputLineageList() {
				return this.inputLineageList;
			}

			public void setInputLineageList(List<InputLineageListItem> inputLineageList) {
				this.inputLineageList = inputLineageList;
			}

			public List<OutputLineageListItem> getOutputLineageList() {
				return this.outputLineageList;
			}

			public void setOutputLineageList(List<OutputLineageListItem> outputLineageList) {
				this.outputLineageList = outputLineageList;
			}

			public static class InputLineageListItem {

				@SerializedName("FullTable")
				private Boolean fullTable;

				@SerializedName("Name")
				private String name;

				@SerializedName("Env")
				private String env;

				@SerializedName("ColumnList")
				private List<String> columnList;

				public Boolean getFullTable() {
					return this.fullTable;
				}

				public void setFullTable(Boolean fullTable) {
					this.fullTable = fullTable;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getEnv() {
					return this.env;
				}

				public void setEnv(String env) {
					this.env = env;
				}

				public List<String> getColumnList() {
					return this.columnList;
				}

				public void setColumnList(List<String> columnList) {
					this.columnList = columnList;
				}
			}

			public static class OutputLineageListItem {

				@SerializedName("FullTable")
				private Boolean fullTable;

				@SerializedName("Name")
				private String name;

				@SerializedName("Env")
				private String env;

				@SerializedName("ColumnList")
				private List<String> columnList;

				public Boolean getFullTable() {
					return this.fullTable;
				}

				public void setFullTable(Boolean fullTable) {
					this.fullTable = fullTable;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getEnv() {
					return this.env;
				}

				public void setEnv(String env) {
					this.env = env;
				}

				public List<String> getColumnList() {
					return this.columnList;
				}

				public void setColumnList(List<String> columnList) {
					this.columnList = columnList;
				}
			}
		}
	}

	@Override
	public Class<UpdateBatchTaskUdfLineagesResponse> getResponseClass() {
		return UpdateBatchTaskUdfLineagesResponse.class;
	}

}
