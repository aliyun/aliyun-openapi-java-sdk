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

package com.aliyuncs.eventbridge.model.v20200401;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eventbridge.transform.v20200401.EventCenterQueryEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class EventCenterQueryEventsResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String nextToken;

		private Integer maxResults;

		private Integer totalCount;

		private List<TimeSeriesItem> timeSeries;

		private List<TableItem> table;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public Integer getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Integer maxResults) {
			this.maxResults = maxResults;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<TimeSeriesItem> getTimeSeries() {
			return this.timeSeries;
		}

		public void setTimeSeries(List<TimeSeriesItem> timeSeries) {
			this.timeSeries = timeSeries;
		}

		public List<TableItem> getTable() {
			return this.table;
		}

		public void setTable(List<TableItem> table) {
			this.table = table;
		}

		public static class TimeSeriesItem {

			private Map<Object,Object> rowData;

			private String time;

			public Map<Object,Object> getRowData() {
				return this.rowData;
			}

			public void setRowData(Map<Object,Object> rowData) {
				this.rowData = rowData;
			}

			public String getTime() {
				return this.time;
			}

			public void setTime(String time) {
				this.time = time;
			}
		}

		public static class TableItem {

			private Map<Object,Object> rowData;

			public Map<Object,Object> getRowData() {
				return this.rowData;
			}

			public void setRowData(Map<Object,Object> rowData) {
				this.rowData = rowData;
			}
		}
	}

	@Override
	public EventCenterQueryEventsResponse getInstance(UnmarshallerContext context) {
		return	EventCenterQueryEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
