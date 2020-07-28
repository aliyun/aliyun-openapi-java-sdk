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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.ListOperationLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOperationLogsResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private Integer totalSize;

	private Integer currentPage;

	private Integer pageSize;

	private List<Log> logList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTotalSize() {
		return this.totalSize;
	}

	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Log> getLogList() {
		return this.logList;
	}

	public void setLogList(List<Log> logList) {
		this.logList = logList;
	}

	public static class Log {

		private String actionGroup;

		private String actionName;

		private Long beginTime;

		private Long endTime;

		private String operatorName;

		private String operatorId;

		private String source;

		private String status;

		private String message;

		private String extraParameters;

		private String appId;

		public String getActionGroup() {
			return this.actionGroup;
		}

		public void setActionGroup(String actionGroup) {
			this.actionGroup = actionGroup;
		}

		public String getActionName() {
			return this.actionName;
		}

		public void setActionName(String actionName) {
			this.actionName = actionName;
		}

		public Long getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(Long beginTime) {
			this.beginTime = beginTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getOperatorName() {
			return this.operatorName;
		}

		public void setOperatorName(String operatorName) {
			this.operatorName = operatorName;
		}

		public String getOperatorId() {
			return this.operatorId;
		}

		public void setOperatorId(String operatorId) {
			this.operatorId = operatorId;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getExtraParameters() {
			return this.extraParameters;
		}

		public void setExtraParameters(String extraParameters) {
			this.extraParameters = extraParameters;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}
	}

	@Override
	public ListOperationLogsResponse getInstance(UnmarshallerContext context) {
		return	ListOperationLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
