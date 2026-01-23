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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetSecurityIdentifyResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSecurityIdentifyResultResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private SecurityIdentifyResultInfo securityIdentifyResultInfo;

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

	public SecurityIdentifyResultInfo getSecurityIdentifyResultInfo() {
		return this.securityIdentifyResultInfo;
	}

	public void setSecurityIdentifyResultInfo(SecurityIdentifyResultInfo securityIdentifyResultInfo) {
		this.securityIdentifyResultInfo = securityIdentifyResultInfo;
	}

	public static class SecurityIdentifyResultInfo {

		private Long id;

		private Long scanTaskId;

		private Long tableTaskId;

		private Long classifyId;

		private String classifyName;

		private String classifyAbbreviation;

		private Long levelIndex;

		private String levelName;

		private String levelAbbreviation;

		private Long levelColor;

		private Long bizUnitId;

		private String bizUnitName;

		private String bizUnitDisplayName;

		private Long projectId;

		private String projectName;

		private String projectDisplayName;

		private Long datasourceId;

		private String datasourceName;

		private String tableEnv;

		private String tableType;

		private String tableCatalog;

		private String tableId;

		private String tableName;

		private String tableDescription;

		private String fieldId;

		private String fieldName;

		private String fieldDescription;

		private Boolean isCustomIdentify;

		private Boolean isLocked;

		private Boolean hasBetterRule;

		private Long identifyRecordId;

		private String status;

		private String bizDate;

		private String creator;

		private String createTime;

		private String modifier;

		private String modifyTime;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getScanTaskId() {
			return this.scanTaskId;
		}

		public void setScanTaskId(Long scanTaskId) {
			this.scanTaskId = scanTaskId;
		}

		public Long getTableTaskId() {
			return this.tableTaskId;
		}

		public void setTableTaskId(Long tableTaskId) {
			this.tableTaskId = tableTaskId;
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

		public Long getLevelColor() {
			return this.levelColor;
		}

		public void setLevelColor(Long levelColor) {
			this.levelColor = levelColor;
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

		public String getTableType() {
			return this.tableType;
		}

		public void setTableType(String tableType) {
			this.tableType = tableType;
		}

		public String getTableCatalog() {
			return this.tableCatalog;
		}

		public void setTableCatalog(String tableCatalog) {
			this.tableCatalog = tableCatalog;
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

		public Boolean getHasBetterRule() {
			return this.hasBetterRule;
		}

		public void setHasBetterRule(Boolean hasBetterRule) {
			this.hasBetterRule = hasBetterRule;
		}

		public Long getIdentifyRecordId() {
			return this.identifyRecordId;
		}

		public void setIdentifyRecordId(Long identifyRecordId) {
			this.identifyRecordId = identifyRecordId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getBizDate() {
			return this.bizDate;
		}

		public void setBizDate(String bizDate) {
			this.bizDate = bizDate;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifier() {
			return this.modifier;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}
	}

	@Override
	public GetSecurityIdentifyResultResponse getInstance(UnmarshallerContext context) {
		return	GetSecurityIdentifyResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
