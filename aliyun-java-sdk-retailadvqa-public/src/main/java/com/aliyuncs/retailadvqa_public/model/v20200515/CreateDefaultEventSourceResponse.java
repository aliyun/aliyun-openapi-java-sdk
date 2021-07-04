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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailadvqa_public.transform.v20200515.CreateDefaultEventSourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateDefaultEventSourceResponse extends AcsResponse {

	private String errorDesc;

	private String traceId;

	private String errorCode;

	private Boolean success;

	private String requestId;

	private Data data;

	public String getErrorDesc() {
		return this.errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

		private String eventSourceId;

		private String eventSourceName;

		private String eventSourceType;

		private String eventSourceCode;

		private String gmtModified;

		private String gmtCreate;

		private String createId;

		private String modifyId;

		private String orgnizationId;

		private String workspaceId;

		private String errDescription;

		private Integer isUse;

		public String getEventSourceId() {
			return this.eventSourceId;
		}

		public void setEventSourceId(String eventSourceId) {
			this.eventSourceId = eventSourceId;
		}

		public String getEventSourceName() {
			return this.eventSourceName;
		}

		public void setEventSourceName(String eventSourceName) {
			this.eventSourceName = eventSourceName;
		}

		public String getEventSourceType() {
			return this.eventSourceType;
		}

		public void setEventSourceType(String eventSourceType) {
			this.eventSourceType = eventSourceType;
		}

		public String getEventSourceCode() {
			return this.eventSourceCode;
		}

		public void setEventSourceCode(String eventSourceCode) {
			this.eventSourceCode = eventSourceCode;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getCreateId() {
			return this.createId;
		}

		public void setCreateId(String createId) {
			this.createId = createId;
		}

		public String getModifyId() {
			return this.modifyId;
		}

		public void setModifyId(String modifyId) {
			this.modifyId = modifyId;
		}

		public String getOrgnizationId() {
			return this.orgnizationId;
		}

		public void setOrgnizationId(String orgnizationId) {
			this.orgnizationId = orgnizationId;
		}

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}

		public String getErrDescription() {
			return this.errDescription;
		}

		public void setErrDescription(String errDescription) {
			this.errDescription = errDescription;
		}

		public Integer getIsUse() {
			return this.isUse;
		}

		public void setIsUse(Integer isUse) {
			this.isUse = isUse;
		}
	}

	@Override
	public CreateDefaultEventSourceResponse getInstance(UnmarshallerContext context) {
		return	CreateDefaultEventSourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
