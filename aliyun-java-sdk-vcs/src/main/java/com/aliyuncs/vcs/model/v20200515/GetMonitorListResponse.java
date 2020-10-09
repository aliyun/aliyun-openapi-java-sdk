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

	private String code;

	private String message;

	private String requestId;

	private Data data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNo;

		private Integer pageSize;

		private Integer totalCount;

		private Integer totalPage;

		private List<Record> records;

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(Integer totalPage) {
			this.totalPage = totalPage;
		}

		public List<Record> getRecords() {
			return this.records;
		}

		public void setRecords(List<Record> records) {
			this.records = records;
		}

		public static class Record {

			private String taskId;

			private String status;

			private String monitorType;

			private String ruleName;

			private String algorithmVendor;

			private String createDate;

			private String modifiedDate;

			private String deviceList;

			private String attributes;

			private String ruleExpression;

			private String notifierType;

			private String notifierExtra;

			private String description;

			private String expression;

			private String imageMatch;

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getMonitorType() {
				return this.monitorType;
			}

			public void setMonitorType(String monitorType) {
				this.monitorType = monitorType;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public String getAlgorithmVendor() {
				return this.algorithmVendor;
			}

			public void setAlgorithmVendor(String algorithmVendor) {
				this.algorithmVendor = algorithmVendor;
			}

			public String getCreateDate() {
				return this.createDate;
			}

			public void setCreateDate(String createDate) {
				this.createDate = createDate;
			}

			public String getModifiedDate() {
				return this.modifiedDate;
			}

			public void setModifiedDate(String modifiedDate) {
				this.modifiedDate = modifiedDate;
			}

			public String getDeviceList() {
				return this.deviceList;
			}

			public void setDeviceList(String deviceList) {
				this.deviceList = deviceList;
			}

			public String getAttributes() {
				return this.attributes;
			}

			public void setAttributes(String attributes) {
				this.attributes = attributes;
			}

			public String getRuleExpression() {
				return this.ruleExpression;
			}

			public void setRuleExpression(String ruleExpression) {
				this.ruleExpression = ruleExpression;
			}

			public String getNotifierType() {
				return this.notifierType;
			}

			public void setNotifierType(String notifierType) {
				this.notifierType = notifierType;
			}

			public String getNotifierExtra() {
				return this.notifierExtra;
			}

			public void setNotifierExtra(String notifierExtra) {
				this.notifierExtra = notifierExtra;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getExpression() {
				return this.expression;
			}

			public void setExpression(String expression) {
				this.expression = expression;
			}

			public String getImageMatch() {
				return this.imageMatch;
			}

			public void setImageMatch(String imageMatch) {
				this.imageMatch = imageMatch;
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
