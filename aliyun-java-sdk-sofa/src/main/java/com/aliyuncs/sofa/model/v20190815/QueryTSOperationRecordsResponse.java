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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryTSOperationRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTSOperationRecordsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long pageNum;

	private Long pageSize;

	private String totalCount;

	private List<ListItem> list;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<ListItem> getList() {
		return this.list;
	}

	public void setList(List<ListItem> list) {
		this.list = list;
	}

	public static class ListItem {

		private String gmtOperate;

		private String id;

		private String instanceId;

		private String jobName;

		private String operateTime;

		private String operation;

		private Boolean operationResult;

		private String operationTarget;

		private String operationValue;

		private String operator;

		public String getGmtOperate() {
			return this.gmtOperate;
		}

		public void setGmtOperate(String gmtOperate) {
			this.gmtOperate = gmtOperate;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public String getOperateTime() {
			return this.operateTime;
		}

		public void setOperateTime(String operateTime) {
			this.operateTime = operateTime;
		}

		public String getOperation() {
			return this.operation;
		}

		public void setOperation(String operation) {
			this.operation = operation;
		}

		public Boolean getOperationResult() {
			return this.operationResult;
		}

		public void setOperationResult(Boolean operationResult) {
			this.operationResult = operationResult;
		}

		public String getOperationTarget() {
			return this.operationTarget;
		}

		public void setOperationTarget(String operationTarget) {
			this.operationTarget = operationTarget;
		}

		public String getOperationValue() {
			return this.operationValue;
		}

		public void setOperationValue(String operationValue) {
			this.operationValue = operationValue;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}
	}

	@Override
	public QueryTSOperationRecordsResponse getInstance(UnmarshallerContext context) {
		return	QueryTSOperationRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
