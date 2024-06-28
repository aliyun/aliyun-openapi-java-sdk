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

package com.aliyuncs.quickbi_public.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.QueryAuditLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAuditLogResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<LogApiResultModel> result;

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

	public List<LogApiResultModel> getResult() {
		return this.result;
	}

	public void setResult(List<LogApiResultModel> result) {
		this.result = result;
	}

	public static class LogApiResultModel {

		private String workspaceId;

		private String operatorName;

		private String operatorAccountName;

		private String operatorType;

		private String targetType;

		private String targetName;

		private String gmtCreate;

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}

		public String getOperatorName() {
			return this.operatorName;
		}

		public void setOperatorName(String operatorName) {
			this.operatorName = operatorName;
		}

		public String getOperatorAccountName() {
			return this.operatorAccountName;
		}

		public void setOperatorAccountName(String operatorAccountName) {
			this.operatorAccountName = operatorAccountName;
		}

		public String getOperatorType() {
			return this.operatorType;
		}

		public void setOperatorType(String operatorType) {
			this.operatorType = operatorType;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public String getTargetName() {
			return this.targetName;
		}

		public void setTargetName(String targetName) {
			this.targetName = targetName;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
	}

	@Override
	public QueryAuditLogResponse getInstance(UnmarshallerContext context) {
		return	QueryAuditLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
