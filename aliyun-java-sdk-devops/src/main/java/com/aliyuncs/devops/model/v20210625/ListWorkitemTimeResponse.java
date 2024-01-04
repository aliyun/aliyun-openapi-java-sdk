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

package com.aliyuncs.devops.model.v20210625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.ListWorkitemTimeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListWorkitemTimeResponse extends AcsResponse {

	private String requestId;

	private String errorMsg;

	private String errorCode;

	private Boolean success;

	private Long code;

	private List<WorkitemTimeItem> workitemTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
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

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public List<WorkitemTimeItem> getWorkitemTime() {
		return this.workitemTime;
	}

	public void setWorkitemTime(List<WorkitemTimeItem> workitemTime) {
		this.workitemTime = workitemTime;
	}

	public static class WorkitemTimeItem {

		private String workitemIdentifier;

		private String identifier;

		private Long gmtStart;

		private Long gmtEnd;

		private Float actualTime;

		private String type;

		private String description;

		private String recordUser;

		private Long gmtCreate;

		private Long gmtModified;

		public String getWorkitemIdentifier() {
			return this.workitemIdentifier;
		}

		public void setWorkitemIdentifier(String workitemIdentifier) {
			this.workitemIdentifier = workitemIdentifier;
		}

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public Long getGmtStart() {
			return this.gmtStart;
		}

		public void setGmtStart(Long gmtStart) {
			this.gmtStart = gmtStart;
		}

		public Long getGmtEnd() {
			return this.gmtEnd;
		}

		public void setGmtEnd(Long gmtEnd) {
			this.gmtEnd = gmtEnd;
		}

		public Float getActualTime() {
			return this.actualTime;
		}

		public void setActualTime(Float actualTime) {
			this.actualTime = actualTime;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getRecordUser() {
			return this.recordUser;
		}

		public void setRecordUser(String recordUser) {
			this.recordUser = recordUser;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public ListWorkitemTimeResponse getInstance(UnmarshallerContext context) {
		return	ListWorkitemTimeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
