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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListDataLakeTablebaseInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataLakeTablebaseInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private String totalCount;

	private List<TablebaseInfo> tablebaseInfoList;

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<TablebaseInfo> getTablebaseInfoList() {
		return this.tablebaseInfoList;
	}

	public void setTablebaseInfoList(List<TablebaseInfo> tablebaseInfoList) {
		this.tablebaseInfoList = tablebaseInfoList;
	}

	public static class TablebaseInfo {

		private String owner;

		private String viewOriginalText;

		private String tableType;

		private Map<Object,Object> parameters;

		private String description;

		private Long creatorId;

		private Integer createTime;

		private Integer lastAccessTime;

		private Integer retention;

		private String name;

		private String ownerType;

		private String viewExpandedText;

		private Long dbId;

		private String dbName;

		private String catalogName;

		private Long modifierId;

		private String location;

		private List<Column> partitionKeys;

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getViewOriginalText() {
			return this.viewOriginalText;
		}

		public void setViewOriginalText(String viewOriginalText) {
			this.viewOriginalText = viewOriginalText;
		}

		public String getTableType() {
			return this.tableType;
		}

		public void setTableType(String tableType) {
			this.tableType = tableType;
		}

		public Map<Object,Object> getParameters() {
			return this.parameters;
		}

		public void setParameters(Map<Object,Object> parameters) {
			this.parameters = parameters;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(Long creatorId) {
			this.creatorId = creatorId;
		}

		public Integer getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Integer createTime) {
			this.createTime = createTime;
		}

		public Integer getLastAccessTime() {
			return this.lastAccessTime;
		}

		public void setLastAccessTime(Integer lastAccessTime) {
			this.lastAccessTime = lastAccessTime;
		}

		public Integer getRetention() {
			return this.retention;
		}

		public void setRetention(Integer retention) {
			this.retention = retention;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOwnerType() {
			return this.ownerType;
		}

		public void setOwnerType(String ownerType) {
			this.ownerType = ownerType;
		}

		public String getViewExpandedText() {
			return this.viewExpandedText;
		}

		public void setViewExpandedText(String viewExpandedText) {
			this.viewExpandedText = viewExpandedText;
		}

		public Long getDbId() {
			return this.dbId;
		}

		public void setDbId(Long dbId) {
			this.dbId = dbId;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public String getCatalogName() {
			return this.catalogName;
		}

		public void setCatalogName(String catalogName) {
			this.catalogName = catalogName;
		}

		public Long getModifierId() {
			return this.modifierId;
		}

		public void setModifierId(Long modifierId) {
			this.modifierId = modifierId;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public List<Column> getPartitionKeys() {
			return this.partitionKeys;
		}

		public void setPartitionKeys(List<Column> partitionKeys) {
			this.partitionKeys = partitionKeys;
		}

		public static class Column {

			private String comment;

			private String type;

			private String name;

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public ListDataLakeTablebaseInfoResponse getInstance(UnmarshallerContext context) {
		return	ListDataLakeTablebaseInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
