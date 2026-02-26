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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeUpdateBackendTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUpdateBackendTaskResponse extends AcsResponse {

	private String requestId;

	private List<ApiUpdateBackendResult> apiUpdateBackendResults;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ApiUpdateBackendResult> getApiUpdateBackendResults() {
		return this.apiUpdateBackendResults;
	}

	public void setApiUpdateBackendResults(List<ApiUpdateBackendResult> apiUpdateBackendResults) {
		this.apiUpdateBackendResults = apiUpdateBackendResults;
	}

	public static class ApiUpdateBackendResult {

		private String stageId;

		private String updateStatus;

		private String groupName;

		private String groupId;

		private String apiUid;

		private String errorMsg;

		private String stageName;

		private String apiName;

		private String backendId;

		public String getStageId() {
			return this.stageId;
		}

		public void setStageId(String stageId) {
			this.stageId = stageId;
		}

		public String getUpdateStatus() {
			return this.updateStatus;
		}

		public void setUpdateStatus(String updateStatus) {
			this.updateStatus = updateStatus;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getApiUid() {
			return this.apiUid;
		}

		public void setApiUid(String apiUid) {
			this.apiUid = apiUid;
		}

		public String getErrorMsg() {
			return this.errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public String getStageName() {
			return this.stageName;
		}

		public void setStageName(String stageName) {
			this.stageName = stageName;
		}

		public String getApiName() {
			return this.apiName;
		}

		public void setApiName(String apiName) {
			this.apiName = apiName;
		}

		public String getBackendId() {
			return this.backendId;
		}

		public void setBackendId(String backendId) {
			this.backendId = backendId;
		}
	}

	@Override
	public DescribeUpdateBackendTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeUpdateBackendTaskResponseUnmarshaller.unmarshall(this, context);
	}
}
