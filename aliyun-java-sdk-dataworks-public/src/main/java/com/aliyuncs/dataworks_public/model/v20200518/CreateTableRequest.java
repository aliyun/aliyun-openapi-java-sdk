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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTableRequest extends RpcAcsRequest<CreateTableResponse> {
	   

	private Integer visibility;

	private Long physicsLevelId;

	private List<Columns> columnss;

	private String ownerId;

	private Integer lifeCycle;

	private List<Themes> themess;

	private Long logicalLevelId;

	private String endpoint;

	private Integer isView;

	private String externalTableType;

	private Integer envType;

	private Integer hasPart;

	private String location;

	private String comment;

	private String tableName;

	private String appGuid;

	private Long projectId;

	private Long categoryId;
	public CreateTableRequest() {
		super("dataworks-public", "2020-05-18", "CreateTable");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getVisibility() {
		return this.visibility;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
		if(visibility != null){
			putQueryParameter("Visibility", visibility.toString());
		}
	}

	public Long getPhysicsLevelId() {
		return this.physicsLevelId;
	}

	public void setPhysicsLevelId(Long physicsLevelId) {
		this.physicsLevelId = physicsLevelId;
		if(physicsLevelId != null){
			putQueryParameter("PhysicsLevelId", physicsLevelId.toString());
		}
	}

	public List<Columns> getColumnss() {
		return this.columnss;
	}

	public void setColumnss(List<Columns> columnss) {
		this.columnss = columnss;	
		if (columnss != null) {
			for (int depth1 = 0; depth1 < columnss.size(); depth1++) {
				putBodyParameter("Columns." + (depth1 + 1) + ".SeqNumber" , columnss.get(depth1).getSeqNumber());
				putBodyParameter("Columns." + (depth1 + 1) + ".IsPartitionCol" , columnss.get(depth1).getIsPartitionCol());
				putBodyParameter("Columns." + (depth1 + 1) + ".ColumnNameCn" , columnss.get(depth1).getColumnNameCn());
				putBodyParameter("Columns." + (depth1 + 1) + ".Length" , columnss.get(depth1).getLength());
				putBodyParameter("Columns." + (depth1 + 1) + ".IsNullable" , columnss.get(depth1).getIsNullable());
				putBodyParameter("Columns." + (depth1 + 1) + ".Comment" , columnss.get(depth1).getComment());
				putBodyParameter("Columns." + (depth1 + 1) + ".IsPrimaryKey" , columnss.get(depth1).getIsPrimaryKey());
				putBodyParameter("Columns." + (depth1 + 1) + ".ColumnName" , columnss.get(depth1).getColumnName());
				putBodyParameter("Columns." + (depth1 + 1) + ".ColumnType" , columnss.get(depth1).getColumnType());
			}
		}	
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public Integer getLifeCycle() {
		return this.lifeCycle;
	}

	public void setLifeCycle(Integer lifeCycle) {
		this.lifeCycle = lifeCycle;
		if(lifeCycle != null){
			putQueryParameter("LifeCycle", lifeCycle.toString());
		}
	}

	public List<Themes> getThemess() {
		return this.themess;
	}

	public void setThemess(List<Themes> themess) {
		this.themess = themess;	
		if (themess != null) {
			for (int depth1 = 0; depth1 < themess.size(); depth1++) {
				putBodyParameter("Themes." + (depth1 + 1) + ".ThemeLevel" , themess.get(depth1).getThemeLevel());
				putBodyParameter("Themes." + (depth1 + 1) + ".ThemeId" , themess.get(depth1).getThemeId());
			}
		}	
	}

	public Long getLogicalLevelId() {
		return this.logicalLevelId;
	}

	public void setLogicalLevelId(Long logicalLevelId) {
		this.logicalLevelId = logicalLevelId;
		if(logicalLevelId != null){
			putQueryParameter("LogicalLevelId", logicalLevelId.toString());
		}
	}

	public String getEndpoint() {
		return this.endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
		if(endpoint != null){
			putBodyParameter("Endpoint", endpoint);
		}
	}

	public Integer getIsView() {
		return this.isView;
	}

	public void setIsView(Integer isView) {
		this.isView = isView;
		if(isView != null){
			putQueryParameter("IsView", isView.toString());
		}
	}

	public String getExternalTableType() {
		return this.externalTableType;
	}

	public void setExternalTableType(String externalTableType) {
		this.externalTableType = externalTableType;
		if(externalTableType != null){
			putQueryParameter("ExternalTableType", externalTableType);
		}
	}

	public Integer getEnvType() {
		return this.envType;
	}

	public void setEnvType(Integer envType) {
		this.envType = envType;
		if(envType != null){
			putBodyParameter("EnvType", envType.toString());
		}
	}

	public Integer getHasPart() {
		return this.hasPart;
	}

	public void setHasPart(Integer hasPart) {
		this.hasPart = hasPart;
		if(hasPart != null){
			putQueryParameter("HasPart", hasPart.toString());
		}
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		if(location != null){
			putQueryParameter("Location", location);
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

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
		if(tableName != null){
			putQueryParameter("TableName", tableName);
		}
	}

	public String getAppGuid() {
		return this.appGuid;
	}

	public void setAppGuid(String appGuid) {
		this.appGuid = appGuid;
		if(appGuid != null){
			putQueryParameter("AppGuid", appGuid);
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId.toString());
		}
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
		if(categoryId != null){
			putQueryParameter("CategoryId", categoryId.toString());
		}
	}

	public static class Columns {

		private Integer seqNumber;

		private Integer isPartitionCol;

		private String columnNameCn;

		private Integer length;

		private Integer isNullable;

		private String comment;

		private Integer isPrimaryKey;

		private String columnName;

		private String columnType;

		public Integer getSeqNumber() {
			return this.seqNumber;
		}

		public void setSeqNumber(Integer seqNumber) {
			this.seqNumber = seqNumber;
		}

		public Integer getIsPartitionCol() {
			return this.isPartitionCol;
		}

		public void setIsPartitionCol(Integer isPartitionCol) {
			this.isPartitionCol = isPartitionCol;
		}

		public String getColumnNameCn() {
			return this.columnNameCn;
		}

		public void setColumnNameCn(String columnNameCn) {
			this.columnNameCn = columnNameCn;
		}

		public Integer getLength() {
			return this.length;
		}

		public void setLength(Integer length) {
			this.length = length;
		}

		public Integer getIsNullable() {
			return this.isNullable;
		}

		public void setIsNullable(Integer isNullable) {
			this.isNullable = isNullable;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public Integer getIsPrimaryKey() {
			return this.isPrimaryKey;
		}

		public void setIsPrimaryKey(Integer isPrimaryKey) {
			this.isPrimaryKey = isPrimaryKey;
		}

		public String getColumnName() {
			return this.columnName;
		}

		public void setColumnName(String columnName) {
			this.columnName = columnName;
		}

		public String getColumnType() {
			return this.columnType;
		}

		public void setColumnType(String columnType) {
			this.columnType = columnType;
		}
	}

	public static class Themes {

		private Integer themeLevel;

		private Long themeId;

		public Integer getThemeLevel() {
			return this.themeLevel;
		}

		public void setThemeLevel(Integer themeLevel) {
			this.themeLevel = themeLevel;
		}

		public Long getThemeId() {
			return this.themeId;
		}

		public void setThemeId(Long themeId) {
			this.themeId = themeId;
		}
	}

	@Override
	public Class<CreateTableResponse> getResponseClass() {
		return CreateTableResponse.class;
	}

}
