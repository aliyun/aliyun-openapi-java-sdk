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
import com.aliyuncs.devops.transform.v20210625.ListWorkitemEstimateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListWorkitemEstimateResponse extends AcsResponse {

	private String requestId;

	private String errorMsg;

	private String errorCode;

	private Boolean success;

	private Long code;

	private List<WorkitemTimeEstimateItem> workitemTimeEstimate;

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

	public List<WorkitemTimeEstimateItem> getWorkitemTimeEstimate() {
		return this.workitemTimeEstimate;
	}

	public void setWorkitemTimeEstimate(List<WorkitemTimeEstimateItem> workitemTimeEstimate) {
		this.workitemTimeEstimate = workitemTimeEstimate;
	}

	public static class WorkitemTimeEstimateItem {

		private String workitemIdentifier;

		private String identifier;

		private Long gmtStart;

		private Long gmtEnd;

		private Float spentTime;

		private String type;

		private String description;

		private Long gmtCreate;

		private Long gmtModified;

		private RecordUser recordUser;

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

		public Float getSpentTime() {
			return this.spentTime;
		}

		public void setSpentTime(Float spentTime) {
			this.spentTime = spentTime;
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

		public RecordUser getRecordUser() {
			return this.recordUser;
		}

		public void setRecordUser(RecordUser recordUser) {
			this.recordUser = recordUser;
		}

		public static class RecordUser {

			private String identifier;

			private String name;

			public String getIdentifier() {
				return this.identifier;
			}

			public void setIdentifier(String identifier) {
				this.identifier = identifier;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public ListWorkitemEstimateResponse getInstance(UnmarshallerContext context) {
		return	ListWorkitemEstimateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
