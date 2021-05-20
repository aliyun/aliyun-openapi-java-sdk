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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.GetMonitorListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMonitorListResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalCount;

		private Integer pageSize;

		private Integer totalPage;

		private Integer pageNumber;

		private List<Record> records;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(Integer totalPage) {
			this.totalPage = totalPage;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public List<Record> getRecords() {
			return this.records;
		}

		public void setRecords(List<Record> records) {
			this.records = records;
		}

		public static class Record {

			private String status;

			private String taskId;

			private String description;

			private String monitorType;

			private String notifierExtendValues;

			private String imageMatch;

			private String attributes;

			private String deviceList;

			private String modifiedDate;

			private String createDate;

			private String notifierType;

			private String ruleExpression;

			private String algorithmVendor;

			private String expression;

			private String ruleName;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getMonitorType() {
				return this.monitorType;
			}

			public void setMonitorType(String monitorType) {
				this.monitorType = monitorType;
			}

			public String getNotifierExtendValues() {
				return this.notifierExtendValues;
			}

			public void setNotifierExtendValues(String notifierExtendValues) {
				this.notifierExtendValues = notifierExtendValues;
			}

			public String getImageMatch() {
				return this.imageMatch;
			}

			public void setImageMatch(String imageMatch) {
				this.imageMatch = imageMatch;
			}

			public String getAttributes() {
				return this.attributes;
			}

			public void setAttributes(String attributes) {
				this.attributes = attributes;
			}

			public String getDeviceList() {
				return this.deviceList;
			}

			public void setDeviceList(String deviceList) {
				this.deviceList = deviceList;
			}

			public String getModifiedDate() {
				return this.modifiedDate;
			}

			public void setModifiedDate(String modifiedDate) {
				this.modifiedDate = modifiedDate;
			}

			public String getCreateDate() {
				return this.createDate;
			}

			public void setCreateDate(String createDate) {
				this.createDate = createDate;
			}

			public String getNotifierType() {
				return this.notifierType;
			}

			public void setNotifierType(String notifierType) {
				this.notifierType = notifierType;
			}

			public String getRuleExpression() {
				return this.ruleExpression;
			}

			public void setRuleExpression(String ruleExpression) {
				this.ruleExpression = ruleExpression;
			}

			public String getAlgorithmVendor() {
				return this.algorithmVendor;
			}

			public void setAlgorithmVendor(String algorithmVendor) {
				this.algorithmVendor = algorithmVendor;
			}

			public String getExpression() {
				return this.expression;
			}

			public void setExpression(String expression) {
				this.expression = expression;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}
		}
	}

	@Override
	public GetMonitorListResponse getInstance(UnmarshallerContext context) {
		return	GetMonitorListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
