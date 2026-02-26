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

package com.aliyuncs.quickbi_public.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.QueryDatasetInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDatasetInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Boolean custimzeSql;

		private String datasetId;

		private String datasetName;

		private String dsId;

		private String dsName;

		private String dsType;

		private String gmtCreate;

		private String gmtModify;

		private Boolean openOfflineAcceleration;

		private String ownerId;

		private String ownerName;

		private Boolean rowLevel;

		private String workspaceId;

		private String workspaceName;

		private List<CubeTableListItem> cubeTableList;

		private List<DimensionListItem> dimensionList;

		private List<MeasureListItem> measureList;

		private Directory directory;

		public Boolean getCustimzeSql() {
			return this.custimzeSql;
		}

		public void setCustimzeSql(Boolean custimzeSql) {
			this.custimzeSql = custimzeSql;
		}

		public String getDatasetId() {
			return this.datasetId;
		}

		public void setDatasetId(String datasetId) {
			this.datasetId = datasetId;
		}

		public String getDatasetName() {
			return this.datasetName;
		}

		public void setDatasetName(String datasetName) {
			this.datasetName = datasetName;
		}

		public String getDsId() {
			return this.dsId;
		}

		public void setDsId(String dsId) {
			this.dsId = dsId;
		}

		public String getDsName() {
			return this.dsName;
		}

		public void setDsName(String dsName) {
			this.dsName = dsName;
		}

		public String getDsType() {
			return this.dsType;
		}

		public void setDsType(String dsType) {
			this.dsType = dsType;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModify() {
			return this.gmtModify;
		}

		public void setGmtModify(String gmtModify) {
			this.gmtModify = gmtModify;
		}

		public Boolean getOpenOfflineAcceleration() {
			return this.openOfflineAcceleration;
		}

		public void setOpenOfflineAcceleration(Boolean openOfflineAcceleration) {
			this.openOfflineAcceleration = openOfflineAcceleration;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public String getOwnerName() {
			return this.ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public Boolean getRowLevel() {
			return this.rowLevel;
		}

		public void setRowLevel(Boolean rowLevel) {
			this.rowLevel = rowLevel;
		}

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}

		public String getWorkspaceName() {
			return this.workspaceName;
		}

		public void setWorkspaceName(String workspaceName) {
			this.workspaceName = workspaceName;
		}

		public List<CubeTableListItem> getCubeTableList() {
			return this.cubeTableList;
		}

		public void setCubeTableList(List<CubeTableListItem> cubeTableList) {
			this.cubeTableList = cubeTableList;
		}

		public List<DimensionListItem> getDimensionList() {
			return this.dimensionList;
		}

		public void setDimensionList(List<DimensionListItem> dimensionList) {
			this.dimensionList = dimensionList;
		}

		public List<MeasureListItem> getMeasureList() {
			return this.measureList;
		}

		public void setMeasureList(List<MeasureListItem> measureList) {
			this.measureList = measureList;
		}

		public Directory getDirectory() {
			return this.directory;
		}

		public void setDirectory(Directory directory) {
			this.directory = directory;
		}

		public static class CubeTableListItem {

			private String caption;

			private Boolean customsql;

			private String datasourceId;

			private String dsType;

			private Boolean factTable;

			private String sql;

			private String tableName;

			private String uniqueId;

			public String getCaption() {
				return this.caption;
			}

			public void setCaption(String caption) {
				this.caption = caption;
			}

			public Boolean getCustomsql() {
				return this.customsql;
			}

			public void setCustomsql(Boolean customsql) {
				this.customsql = customsql;
			}

			public String getDatasourceId() {
				return this.datasourceId;
			}

			public void setDatasourceId(String datasourceId) {
				this.datasourceId = datasourceId;
			}

			public String getDsType() {
				return this.dsType;
			}

			public void setDsType(String dsType) {
				this.dsType = dsType;
			}

			public Boolean getFactTable() {
				return this.factTable;
			}

			public void setFactTable(Boolean factTable) {
				this.factTable = factTable;
			}

			public String getSql() {
				return this.sql;
			}

			public void setSql(String sql) {
				this.sql = sql;
			}

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public String getUniqueId() {
				return this.uniqueId;
			}

			public void setUniqueId(String uniqueId) {
				this.uniqueId = uniqueId;
			}
		}

		public static class DimensionListItem {

			private String caption;

			private String dataType;

			private String dimensionType;

			private String expression;

			private String factColumn;

			private String fieldDescription;

			private String granularity;

			private String refUid;

			private String tableUniqueId;

			private String uid;

			private String expressionV2;

			public String getCaption() {
				return this.caption;
			}

			public void setCaption(String caption) {
				this.caption = caption;
			}

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public String getDimensionType() {
				return this.dimensionType;
			}

			public void setDimensionType(String dimensionType) {
				this.dimensionType = dimensionType;
			}

			public String getExpression() {
				return this.expression;
			}

			public void setExpression(String expression) {
				this.expression = expression;
			}

			public String getFactColumn() {
				return this.factColumn;
			}

			public void setFactColumn(String factColumn) {
				this.factColumn = factColumn;
			}

			public String getFieldDescription() {
				return this.fieldDescription;
			}

			public void setFieldDescription(String fieldDescription) {
				this.fieldDescription = fieldDescription;
			}

			public String getGranularity() {
				return this.granularity;
			}

			public void setGranularity(String granularity) {
				this.granularity = granularity;
			}

			public String getRefUid() {
				return this.refUid;
			}

			public void setRefUid(String refUid) {
				this.refUid = refUid;
			}

			public String getTableUniqueId() {
				return this.tableUniqueId;
			}

			public void setTableUniqueId(String tableUniqueId) {
				this.tableUniqueId = tableUniqueId;
			}

			public String getUid() {
				return this.uid;
			}

			public void setUid(String uid) {
				this.uid = uid;
			}

			public String getExpressionV2() {
				return this.expressionV2;
			}

			public void setExpressionV2(String expressionV2) {
				this.expressionV2 = expressionV2;
			}
		}

		public static class MeasureListItem {

			private String caption;

			private String dataType;

			private String expression;

			private String factColumn;

			private String fieldDescription;

			private String measureType;

			private String tableUniqueId;

			private String uid;

			private String expressionV2;

			public String getCaption() {
				return this.caption;
			}

			public void setCaption(String caption) {
				this.caption = caption;
			}

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public String getExpression() {
				return this.expression;
			}

			public void setExpression(String expression) {
				this.expression = expression;
			}

			public String getFactColumn() {
				return this.factColumn;
			}

			public void setFactColumn(String factColumn) {
				this.factColumn = factColumn;
			}

			public String getFieldDescription() {
				return this.fieldDescription;
			}

			public void setFieldDescription(String fieldDescription) {
				this.fieldDescription = fieldDescription;
			}

			public String getMeasureType() {
				return this.measureType;
			}

			public void setMeasureType(String measureType) {
				this.measureType = measureType;
			}

			public String getTableUniqueId() {
				return this.tableUniqueId;
			}

			public void setTableUniqueId(String tableUniqueId) {
				this.tableUniqueId = tableUniqueId;
			}

			public String getUid() {
				return this.uid;
			}

			public void setUid(String uid) {
				this.uid = uid;
			}

			public String getExpressionV2() {
				return this.expressionV2;
			}

			public void setExpressionV2(String expressionV2) {
				this.expressionV2 = expressionV2;
			}
		}

		public static class Directory {

			private String id;

			private String name;

			private String pathId;

			private String pathName;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getPathId() {
				return this.pathId;
			}

			public void setPathId(String pathId) {
				this.pathId = pathId;
			}

			public String getPathName() {
				return this.pathName;
			}

			public void setPathName(String pathName) {
				this.pathName = pathName;
			}
		}
	}

	@Override
	public QueryDatasetInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryDatasetInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
