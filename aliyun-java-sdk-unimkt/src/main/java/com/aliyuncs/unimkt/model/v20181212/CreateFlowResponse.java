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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.unimkt.transform.v20181212.CreateFlowResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateFlowResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Model model;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public static class Model {

		private String type;

		private String status;

		private String childStatus;

		private String applyUserId;

		private Long approveTime;

		private String flowId;

		private String extInfo;

		private Long gmtModifiedTime;

		private String oldData;

		private Long gmtCreateTime;

		private String approveUserId;

		private String newData;

		private String businessKey;

		private String reasonType;

		private String tenantId;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getChildStatus() {
			return this.childStatus;
		}

		public void setChildStatus(String childStatus) {
			this.childStatus = childStatus;
		}

		public String getApplyUserId() {
			return this.applyUserId;
		}

		public void setApplyUserId(String applyUserId) {
			this.applyUserId = applyUserId;
		}

		public Long getApproveTime() {
			return this.approveTime;
		}

		public void setApproveTime(Long approveTime) {
			this.approveTime = approveTime;
		}

		public String getFlowId() {
			return this.flowId;
		}

		public void setFlowId(String flowId) {
			this.flowId = flowId;
		}

		public String getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(String extInfo) {
			this.extInfo = extInfo;
		}

		public Long getGmtModifiedTime() {
			return this.gmtModifiedTime;
		}

		public void setGmtModifiedTime(Long gmtModifiedTime) {
			this.gmtModifiedTime = gmtModifiedTime;
		}

		public String getOldData() {
			return this.oldData;
		}

		public void setOldData(String oldData) {
			this.oldData = oldData;
		}

		public Long getGmtCreateTime() {
			return this.gmtCreateTime;
		}

		public void setGmtCreateTime(Long gmtCreateTime) {
			this.gmtCreateTime = gmtCreateTime;
		}

		public String getApproveUserId() {
			return this.approveUserId;
		}

		public void setApproveUserId(String approveUserId) {
			this.approveUserId = approveUserId;
		}

		public String getNewData() {
			return this.newData;
		}

		public void setNewData(String newData) {
			this.newData = newData;
		}

		public String getBusinessKey() {
			return this.businessKey;
		}

		public void setBusinessKey(String businessKey) {
			this.businessKey = businessKey;
		}

		public String getReasonType() {
			return this.reasonType;
		}

		public void setReasonType(String reasonType) {
			this.reasonType = reasonType;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}

	@Override
	public CreateFlowResponse getInstance(UnmarshallerContext context) {
		return	CreateFlowResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
