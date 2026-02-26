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
import com.aliyuncs.cloudapi.transform.v20160714.DescribeDeployApiTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeployApiTaskResponse extends AcsResponse {

	private String requestId;

	private List<DeployedResult> deployedResults;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DeployedResult> getDeployedResults() {
		return this.deployedResults;
	}

	public void setDeployedResults(List<DeployedResult> deployedResults) {
		this.deployedResults = deployedResults;
	}

	public static class DeployedResult {

		private String errorMsg;

		private String stageName;

		private String groupId;

		private String apiUid;

		private String deployedStatus;

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

		public String getDeployedStatus() {
			return this.deployedStatus;
		}

		public void setDeployedStatus(String deployedStatus) {
			this.deployedStatus = deployedStatus;
		}
	}

	@Override
	public DescribeDeployApiTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeployApiTaskResponseUnmarshaller.unmarshall(this, context);
	}
}
