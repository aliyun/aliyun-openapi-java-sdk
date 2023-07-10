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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDataArchiveOrderRequest extends RpcAcsRequest<CreateDataArchiveOrderResponse> {
	   

	private Long tid;

	private Long parentId;

	private String pluginType;

	@SerializedName("param")
	private Param param;

	@SerializedName("relatedUserList")
	private List<String> relatedUserList;

	private String comment;
	public CreateDataArchiveOrderRequest() {
		super("dms-enterprise", "2018-11-01", "CreateDataArchiveOrder", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
		if(parentId != null){
			putQueryParameter("ParentId", parentId.toString());
		}
	}

	public String getPluginType() {
		return this.pluginType;
	}

	public void setPluginType(String pluginType) {
		this.pluginType = pluginType;
		if(pluginType != null){
			putQueryParameter("PluginType", pluginType);
		}
	}

	public Param getParam() {
		return this.param;
	}

	public void setParam(Param param) {
		this.param = param;	
		if (param != null) {
			putQueryParameter("Param" , new Gson().toJson(param));
		}	
	}

	public List<String> getRelatedUserList() {
		return this.relatedUserList;
	}

	public void setRelatedUserList(List<String> relatedUserList) {
		this.relatedUserList = relatedUserList;	
		if (relatedUserList != null) {
			putQueryParameter("RelatedUserList" , new Gson().toJson(relatedUserList));
		}	
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putQueryParameter("Comment", comment);
		}
	}

	public static class Param {

		@SerializedName("Variables")
		private List<String> variables;

		@SerializedName("TargetInstanceId")
		private String targetInstanceId;

		@SerializedName("TableMapping")
		private List<String> tableMapping;

		@SerializedName("OrderAfter")
		private List<String> orderAfter;

		@SerializedName("SourceDatabaseId")
		private Long sourceDatabaseId;

		@SerializedName("DbSchema")
		private String dbSchema;

		@SerializedName("RunMethod")
		private String runMethod;

		@SerializedName("Logic")
		private Boolean logic;

		@SerializedName("ArchiveMethod")
		private String archiveMethod;

		@SerializedName("TableIncludes")
		private List<TableIncludesItem> tableIncludes;

		public List<String> getVariables() {
			return this.variables;
		}

		public void setVariables(List<String> variables) {
			this.variables = variables;
		}

		public String getTargetInstanceId() {
			return this.targetInstanceId;
		}

		public void setTargetInstanceId(String targetInstanceId) {
			this.targetInstanceId = targetInstanceId;
		}

		public List<String> getTableMapping() {
			return this.tableMapping;
		}

		public void setTableMapping(List<String> tableMapping) {
			this.tableMapping = tableMapping;
		}

		public List<String> getOrderAfter() {
			return this.orderAfter;
		}

		public void setOrderAfter(List<String> orderAfter) {
			this.orderAfter = orderAfter;
		}

		public Long getSourceDatabaseId() {
			return this.sourceDatabaseId;
		}

		public void setSourceDatabaseId(Long sourceDatabaseId) {
			this.sourceDatabaseId = sourceDatabaseId;
		}

		public String getDbSchema() {
			return this.dbSchema;
		}

		public void setDbSchema(String dbSchema) {
			this.dbSchema = dbSchema;
		}

		public String getRunMethod() {
			return this.runMethod;
		}

		public void setRunMethod(String runMethod) {
			this.runMethod = runMethod;
		}

		public Boolean getLogic() {
			return this.logic;
		}

		public void setLogic(Boolean logic) {
			this.logic = logic;
		}

		public String getArchiveMethod() {
			return this.archiveMethod;
		}

		public void setArchiveMethod(String archiveMethod) {
			this.archiveMethod = archiveMethod;
		}

		public List<TableIncludesItem> getTableIncludes() {
			return this.tableIncludes;
		}

		public void setTableIncludes(List<TableIncludesItem> tableIncludes) {
			this.tableIncludes = tableIncludes;
		}

		public static class TableIncludesItem {

			@SerializedName("TableWhere")
			private String tableWhere;

			@SerializedName("TableName")
			private String tableName;

			public String getTableWhere() {
				return this.tableWhere;
			}

			public void setTableWhere(String tableWhere) {
				this.tableWhere = tableWhere;
			}

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}
		}
	}

	@Override
	public Class<CreateDataArchiveOrderResponse> getResponseClass() {
		return CreateDataArchiveOrderResponse.class;
	}

}
