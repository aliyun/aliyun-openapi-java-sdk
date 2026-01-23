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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.ListSecurityIdentifyRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSecurityIdentifyRecordsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private PageResult pageResult;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public PageResult getPageResult() {
		return this.pageResult;
	}

	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}

	public static class PageResult {

		private Integer totalCount;

		private List<IdentifyRecord> identifyRecordList;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<IdentifyRecord> getIdentifyRecordList() {
			return this.identifyRecordList;
		}

		public void setIdentifyRecordList(List<IdentifyRecord> identifyRecordList) {
			this.identifyRecordList = identifyRecordList;
		}

		public static class IdentifyRecord {

			private Long id;

			private Long bizUnitId;

			private String bizUnitName;

			private String bizUnitDisplayName;

			private Long projectId;

			private String projectName;

			private String projectDisplayName;

			private Long datasourceId;

			private String datasourceName;

			private String tableEnv;

			private String tableId;

			private String tableName;

			private String tableDescription;

			private String tableType;

			private String fieldId;

			private String fieldName;

			private String fieldDescription;

			private Double actualIdentifyRate;

			private Long classifyId;

			private String classifyName;

			private String classifyAbbreviation;

			private String classifyStatus;

			private Long levelIndex;

			private String levelName;

			private String levelAbbreviation;

			private Boolean isCustomIdentify;

			private Boolean isLocked;

			private Boolean isBetterMatch;

			private String bizDate;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getBizUnitId() {
				return this.bizUnitId;
			}

			public void setBizUnitId(Long bizUnitId) {
				this.bizUnitId = bizUnitId;
			}

			public String getBizUnitName() {
				return this.bizUnitName;
			}

			public void setBizUnitName(String bizUnitName) {
				this.bizUnitName = bizUnitName;
			}

			public String getBizUnitDisplayName() {
				return this.bizUnitDisplayName;
			}

			public void setBizUnitDisplayName(String bizUnitDisplayName) {
				this.bizUnitDisplayName = bizUnitDisplayName;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getProjectDisplayName() {
				return this.projectDisplayName;
			}

			public void setProjectDisplayName(String projectDisplayName) {
				this.projectDisplayName = projectDisplayName;
			}

			public Long getDatasourceId() {
				return this.datasourceId;
			}

			public void setDatasourceId(Long datasourceId) {
				this.datasourceId = datasourceId;
			}

			public String getDatasourceName() {
				return this.datasourceName;
			}

			public void setDatasourceName(String datasourceName) {
				this.datasourceName = datasourceName;
			}

			public String getTableEnv() {
				return this.tableEnv;
			}

			public void setTableEnv(String tableEnv) {
				this.tableEnv = tableEnv;
			}

			public String getTableId() {
				return this.tableId;
			}

			public void setTableId(String tableId) {
				this.tableId = tableId;
			}

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public String getTableDescription() {
				return this.tableDescription;
			}

			public void setTableDescription(String tableDescription) {
				this.tableDescription = tableDescription;
			}

			public String getTableType() {
				return this.tableType;
			}

			public void setTableType(String tableType) {
				this.tableType = tableType;
			}

			public String getFieldId() {
				return this.fieldId;
			}

			public void setFieldId(String fieldId) {
				this.fieldId = fieldId;
			}

			public String getFieldName() {
				return this.fieldName;
			}

			public void setFieldName(String fieldName) {
				this.fieldName = fieldName;
			}

			public String getFieldDescription() {
				return this.fieldDescription;
			}

			public void setFieldDescription(String fieldDescription) {
				this.fieldDescription = fieldDescription;
			}

			public Double getActualIdentifyRate() {
				return this.actualIdentifyRate;
			}

			public void setActualIdentifyRate(Double actualIdentifyRate) {
				this.actualIdentifyRate = actualIdentifyRate;
			}

			public Long getClassifyId() {
				return this.classifyId;
			}

			public void setClassifyId(Long classifyId) {
				this.classifyId = classifyId;
			}

			public String getClassifyName() {
				return this.classifyName;
			}

			public void setClassifyName(String classifyName) {
				this.classifyName = classifyName;
			}

			public String getClassifyAbbreviation() {
				return this.classifyAbbreviation;
			}

			public void setClassifyAbbreviation(String classifyAbbreviation) {
				this.classifyAbbreviation = classifyAbbreviation;
			}

			public String getClassifyStatus() {
				return this.classifyStatus;
			}

			public void setClassifyStatus(String classifyStatus) {
				this.classifyStatus = classifyStatus;
			}

			public Long getLevelIndex() {
				return this.levelIndex;
			}

			public void setLevelIndex(Long levelIndex) {
				this.levelIndex = levelIndex;
			}

			public String getLevelName() {
				return this.levelName;
			}

			public void setLevelName(String levelName) {
				this.levelName = levelName;
			}

			public String getLevelAbbreviation() {
				return this.levelAbbreviation;
			}

			public void setLevelAbbreviation(String levelAbbreviation) {
				this.levelAbbreviation = levelAbbreviation;
			}

			public Boolean getIsCustomIdentify() {
				return this.isCustomIdentify;
			}

			public void setIsCustomIdentify(Boolean isCustomIdentify) {
				this.isCustomIdentify = isCustomIdentify;
			}

			public Boolean getIsLocked() {
				return this.isLocked;
			}

			public void setIsLocked(Boolean isLocked) {
				this.isLocked = isLocked;
			}

			public Boolean getIsBetterMatch() {
				return this.isBetterMatch;
			}

			public void setIsBetterMatch(Boolean isBetterMatch) {
				this.isBetterMatch = isBetterMatch;
			}

			public String getBizDate() {
				return this.bizDate;
			}

			public void setBizDate(String bizDate) {
				this.bizDate = bizDate;
			}
		}
	}

	@Override
	public ListSecurityIdentifyRecordsResponse getInstance(UnmarshallerContext context) {
		return	ListSecurityIdentifyRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
