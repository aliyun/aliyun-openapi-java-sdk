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
import com.aliyuncs.dataphin_public.transform.v20230630.ListSecurityIdentifyResultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSecurityIdentifyResultsResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private PageResult pageResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public PageResult getPageResult() {
		return this.pageResult;
	}

	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}

	public static class PageResult {

		private Integer totalCount;

		private List<SecurityIdentifyResult> securityIdentifyResultList;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<SecurityIdentifyResult> getSecurityIdentifyResultList() {
			return this.securityIdentifyResultList;
		}

		public void setSecurityIdentifyResultList(List<SecurityIdentifyResult> securityIdentifyResultList) {
			this.securityIdentifyResultList = securityIdentifyResultList;
		}

		public static class SecurityIdentifyResult {

			private String levelAbbreviation;

			private String tableId;

			private String modifyTime;

			private Long levelColor;

			private String classifyAbbreviation;

			private Long datasourceId;

			private Boolean isCustomIdentify;

			private String projectName;

			private Long tableTaskId;

			private String creator;

			private String tableDescription;

			private Boolean hasBetterRule;

			private Long bizUnitId;

			private String bizUnitDisplayName;

			private Long scanTaskId;

			private Long classifyId;

			private String tableCatalog;

			private String bizUnitName;

			private String fieldName;

			private String modifier;

			private String bizDate;

			private String status;

			private String projectDisplayName;

			private Long identifyRecordId;

			private String datasourceName;

			private String tableType;

			private String tableEnv;

			private String createTime;

			private Long projectId;

			private Boolean isLocked;

			private String fieldDescription;

			private String tableName;

			private String classifyName;

			private String fieldId;

			private String levelName;

			private Long id;

			private Long levelIndex;

			public String getLevelAbbreviation() {
				return this.levelAbbreviation;
			}

			public void setLevelAbbreviation(String levelAbbreviation) {
				this.levelAbbreviation = levelAbbreviation;
			}

			public String getTableId() {
				return this.tableId;
			}

			public void setTableId(String tableId) {
				this.tableId = tableId;
			}

			public String getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(String modifyTime) {
				this.modifyTime = modifyTime;
			}

			public Long getLevelColor() {
				return this.levelColor;
			}

			public void setLevelColor(Long levelColor) {
				this.levelColor = levelColor;
			}

			public String getClassifyAbbreviation() {
				return this.classifyAbbreviation;
			}

			public void setClassifyAbbreviation(String classifyAbbreviation) {
				this.classifyAbbreviation = classifyAbbreviation;
			}

			public Long getDatasourceId() {
				return this.datasourceId;
			}

			public void setDatasourceId(Long datasourceId) {
				this.datasourceId = datasourceId;
			}

			public Boolean getIsCustomIdentify() {
				return this.isCustomIdentify;
			}

			public void setIsCustomIdentify(Boolean isCustomIdentify) {
				this.isCustomIdentify = isCustomIdentify;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public Long getTableTaskId() {
				return this.tableTaskId;
			}

			public void setTableTaskId(Long tableTaskId) {
				this.tableTaskId = tableTaskId;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getTableDescription() {
				return this.tableDescription;
			}

			public void setTableDescription(String tableDescription) {
				this.tableDescription = tableDescription;
			}

			public Boolean getHasBetterRule() {
				return this.hasBetterRule;
			}

			public void setHasBetterRule(Boolean hasBetterRule) {
				this.hasBetterRule = hasBetterRule;
			}

			public Long getBizUnitId() {
				return this.bizUnitId;
			}

			public void setBizUnitId(Long bizUnitId) {
				this.bizUnitId = bizUnitId;
			}

			public String getBizUnitDisplayName() {
				return this.bizUnitDisplayName;
			}

			public void setBizUnitDisplayName(String bizUnitDisplayName) {
				this.bizUnitDisplayName = bizUnitDisplayName;
			}

			public Long getScanTaskId() {
				return this.scanTaskId;
			}

			public void setScanTaskId(Long scanTaskId) {
				this.scanTaskId = scanTaskId;
			}

			public Long getClassifyId() {
				return this.classifyId;
			}

			public void setClassifyId(Long classifyId) {
				this.classifyId = classifyId;
			}

			public String getTableCatalog() {
				return this.tableCatalog;
			}

			public void setTableCatalog(String tableCatalog) {
				this.tableCatalog = tableCatalog;
			}

			public String getBizUnitName() {
				return this.bizUnitName;
			}

			public void setBizUnitName(String bizUnitName) {
				this.bizUnitName = bizUnitName;
			}

			public String getFieldName() {
				return this.fieldName;
			}

			public void setFieldName(String fieldName) {
				this.fieldName = fieldName;
			}

			public String getModifier() {
				return this.modifier;
			}

			public void setModifier(String modifier) {
				this.modifier = modifier;
			}

			public String getBizDate() {
				return this.bizDate;
			}

			public void setBizDate(String bizDate) {
				this.bizDate = bizDate;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getProjectDisplayName() {
				return this.projectDisplayName;
			}

			public void setProjectDisplayName(String projectDisplayName) {
				this.projectDisplayName = projectDisplayName;
			}

			public Long getIdentifyRecordId() {
				return this.identifyRecordId;
			}

			public void setIdentifyRecordId(Long identifyRecordId) {
				this.identifyRecordId = identifyRecordId;
			}

			public String getDatasourceName() {
				return this.datasourceName;
			}

			public void setDatasourceName(String datasourceName) {
				this.datasourceName = datasourceName;
			}

			public String getTableType() {
				return this.tableType;
			}

			public void setTableType(String tableType) {
				this.tableType = tableType;
			}

			public String getTableEnv() {
				return this.tableEnv;
			}

			public void setTableEnv(String tableEnv) {
				this.tableEnv = tableEnv;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public Boolean getIsLocked() {
				return this.isLocked;
			}

			public void setIsLocked(Boolean isLocked) {
				this.isLocked = isLocked;
			}

			public String getFieldDescription() {
				return this.fieldDescription;
			}

			public void setFieldDescription(String fieldDescription) {
				this.fieldDescription = fieldDescription;
			}

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public String getClassifyName() {
				return this.classifyName;
			}

			public void setClassifyName(String classifyName) {
				this.classifyName = classifyName;
			}

			public String getFieldId() {
				return this.fieldId;
			}

			public void setFieldId(String fieldId) {
				this.fieldId = fieldId;
			}

			public String getLevelName() {
				return this.levelName;
			}

			public void setLevelName(String levelName) {
				this.levelName = levelName;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getLevelIndex() {
				return this.levelIndex;
			}

			public void setLevelIndex(Long levelIndex) {
				this.levelIndex = levelIndex;
			}
		}
	}

	@Override
	public ListSecurityIdentifyResultsResponse getInstance(UnmarshallerContext context) {
		return	ListSecurityIdentifyResultsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
