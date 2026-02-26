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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpsertQualityWatchRequest extends RpcAcsRequest<UpsertQualityWatchResponse> {
	   

	private Long opTenantId;

	@SerializedName("upsertCommand")
	private UpsertCommand upsertCommand;
	public UpsertQualityWatchRequest() {
		super("dataphin-public", "2023-06-30", "UpsertQualityWatch");
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

	public UpsertCommand getUpsertCommand() {
		return this.upsertCommand;
	}

	public void setUpsertCommand(UpsertCommand upsertCommand) {
		this.upsertCommand = upsertCommand;	
		if (upsertCommand != null) {
			putBodyParameter("UpsertCommand" , new Gson().toJson(upsertCommand));
		}	
	}

	public static class UpsertCommand {

		@SerializedName("IndexInfo")
		private IndexInfo indexInfo;

		@SerializedName("DataSourceInfo")
		private DataSourceInfo dataSourceInfo;

		@SerializedName("QualityOwner")
		private String qualityOwner;

		@SerializedName("Id")
		private Long id;

		@SerializedName("Type")
		private String type;

		@SerializedName("TableInfo")
		private TableInfo tableInfo;

		public IndexInfo getIndexInfo() {
			return this.indexInfo;
		}

		public void setIndexInfo(IndexInfo indexInfo) {
			this.indexInfo = indexInfo;
		}

		public DataSourceInfo getDataSourceInfo() {
			return this.dataSourceInfo;
		}

		public void setDataSourceInfo(DataSourceInfo dataSourceInfo) {
			this.dataSourceInfo = dataSourceInfo;
		}

		public String getQualityOwner() {
			return this.qualityOwner;
		}

		public void setQualityOwner(String qualityOwner) {
			this.qualityOwner = qualityOwner;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public TableInfo getTableInfo() {
			return this.tableInfo;
		}

		public void setTableInfo(TableInfo tableInfo) {
			this.tableInfo = tableInfo;
		}

		public static class IndexInfo {

			@SerializedName("ComputeType")
			private String computeType;

			@SerializedName("DateType")
			private String dateType;

			@SerializedName("CellSumLogicTableName")
			private String cellSumLogicTableName;

			@SerializedName("GranularityDisplayName")
			private String granularityDisplayName;

			@SerializedName("DisplayName")
			private String displayName;

			@SerializedName("Name")
			private String name;

			@SerializedName("Description")
			private String description;

			@SerializedName("Id")
			private String id;

			@SerializedName("GranularityId")
			private Long granularityId;

			@SerializedName("Type")
			private String type;

			@SerializedName("ProjectId")
			private Long projectId;

			@SerializedName("BizUnitId")
			private Long bizUnitId;

			public String getComputeType() {
				return this.computeType;
			}

			public void setComputeType(String computeType) {
				this.computeType = computeType;
			}

			public String getDateType() {
				return this.dateType;
			}

			public void setDateType(String dateType) {
				this.dateType = dateType;
			}

			public String getCellSumLogicTableName() {
				return this.cellSumLogicTableName;
			}

			public void setCellSumLogicTableName(String cellSumLogicTableName) {
				this.cellSumLogicTableName = cellSumLogicTableName;
			}

			public String getGranularityDisplayName() {
				return this.granularityDisplayName;
			}

			public void setGranularityDisplayName(String granularityDisplayName) {
				this.granularityDisplayName = granularityDisplayName;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
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

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public Long getGranularityId() {
				return this.granularityId;
			}

			public void setGranularityId(Long granularityId) {
				this.granularityId = granularityId;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public Long getBizUnitId() {
				return this.bizUnitId;
			}

			public void setBizUnitId(Long bizUnitId) {
				this.bizUnitId = bizUnitId;
			}
		}

		public static class DataSourceInfo {

			@SerializedName("Id")
			private String id;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}

		public static class TableInfo {

			@SerializedName("Id")
			private String id;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}
	}

	@Override
	public Class<UpsertQualityWatchResponse> getResponseClass() {
		return UpsertQualityWatchResponse.class;
	}

}
