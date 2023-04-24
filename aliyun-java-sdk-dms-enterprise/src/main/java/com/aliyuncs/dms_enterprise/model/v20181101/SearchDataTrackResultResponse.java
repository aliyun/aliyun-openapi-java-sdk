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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.SearchDataTrackResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchDataTrackResultResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private TrackResult trackResult;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public TrackResult getTrackResult() {
		return this.trackResult;
	}

	public void setTrackResult(TrackResult trackResult) {
		this.trackResult = trackResult;
	}

	public static class TrackResult {

		private Long totalCount;

		private List<Event> eventList;

		private List<TableInfo> tableInfoList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<Event> getEventList() {
			return this.eventList;
		}

		public void setEventList(List<Event> eventList) {
			this.eventList = eventList;
		}

		public List<TableInfo> getTableInfoList() {
			return this.tableInfoList;
		}

		public void setTableInfoList(List<TableInfo> tableInfoList) {
			this.tableInfoList = tableInfoList;
		}

		public static class Event {

			private Long eventLength;

			private String eventTimestamp;

			private String eventType;

			private Long eventId;

			private String rollSQL;

			private List<String> dataAfter;

			private List<String> dataBefore;

			public Long getEventLength() {
				return this.eventLength;
			}

			public void setEventLength(Long eventLength) {
				this.eventLength = eventLength;
			}

			public String getEventTimestamp() {
				return this.eventTimestamp;
			}

			public void setEventTimestamp(String eventTimestamp) {
				this.eventTimestamp = eventTimestamp;
			}

			public String getEventType() {
				return this.eventType;
			}

			public void setEventType(String eventType) {
				this.eventType = eventType;
			}

			public Long getEventId() {
				return this.eventId;
			}

			public void setEventId(Long eventId) {
				this.eventId = eventId;
			}

			public String getRollSQL() {
				return this.rollSQL;
			}

			public void setRollSQL(String rollSQL) {
				this.rollSQL = rollSQL;
			}

			public List<String> getDataAfter() {
				return this.dataAfter;
			}

			public void setDataAfter(List<String> dataAfter) {
				this.dataAfter = dataAfter;
			}

			public List<String> getDataBefore() {
				return this.dataBefore;
			}

			public void setDataBefore(List<String> dataBefore) {
				this.dataBefore = dataBefore;
			}
		}

		public static class TableInfo {

			private String schemaName;

			private String tableName;

			private String description;

			private List<Column> columns;

			public String getSchemaName() {
				return this.schemaName;
			}

			public void setSchemaName(String schemaName) {
				this.schemaName = schemaName;
			}

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public List<Column> getColumns() {
				return this.columns;
			}

			public void setColumns(List<Column> columns) {
				this.columns = columns;
			}

			public static class Column {

				private String columnName;

				private Integer columnPosition;

				private String columnType;

				private Boolean fictive;

				public String getColumnName() {
					return this.columnName;
				}

				public void setColumnName(String columnName) {
					this.columnName = columnName;
				}

				public Integer getColumnPosition() {
					return this.columnPosition;
				}

				public void setColumnPosition(Integer columnPosition) {
					this.columnPosition = columnPosition;
				}

				public String getColumnType() {
					return this.columnType;
				}

				public void setColumnType(String columnType) {
					this.columnType = columnType;
				}

				public Boolean getFictive() {
					return this.fictive;
				}

				public void setFictive(Boolean fictive) {
					this.fictive = fictive;
				}
			}
		}
	}

	@Override
	public SearchDataTrackResultResponse getInstance(UnmarshallerContext context) {
		return	SearchDataTrackResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
