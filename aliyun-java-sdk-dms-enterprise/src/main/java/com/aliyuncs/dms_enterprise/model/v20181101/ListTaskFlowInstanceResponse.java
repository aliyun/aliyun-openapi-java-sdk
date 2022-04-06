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
import com.aliyuncs.dms_enterprise.transform.v20181101.ListTaskFlowInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTaskFlowInstanceResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Integer totalCount;

	private List<DAGInstance> dAGInstanceList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<DAGInstance> getDAGInstanceList() {
		return this.dAGInstanceList;
	}

	public void setDAGInstanceList(List<DAGInstance> dAGInstanceList) {
		this.dAGInstanceList = dAGInstanceList;
	}

	public static class DAGInstance {

		private Long id;

		private String businessTime;

		private String endTime;

		private String dagId;

		private Integer triggerType;

		private Integer status;

		private String message;

		private Long historyDagId;

		private String dagName;

		private String ownerName;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getBusinessTime() {
			return this.businessTime;
		}

		public void setBusinessTime(String businessTime) {
			this.businessTime = businessTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getDagId() {
			return this.dagId;
		}

		public void setDagId(String dagId) {
			this.dagId = dagId;
		}

		public Integer getTriggerType() {
			return this.triggerType;
		}

		public void setTriggerType(Integer triggerType) {
			this.triggerType = triggerType;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Long getHistoryDagId() {
			return this.historyDagId;
		}

		public void setHistoryDagId(Long historyDagId) {
			this.historyDagId = historyDagId;
		}

		public String getDagName() {
			return this.dagName;
		}

		public void setDagName(String dagName) {
			this.dagName = dagName;
		}

		public String getOwnerName() {
			return this.ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
	}

	@Override
	public ListTaskFlowInstanceResponse getInstance(UnmarshallerContext context) {
		return	ListTaskFlowInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
