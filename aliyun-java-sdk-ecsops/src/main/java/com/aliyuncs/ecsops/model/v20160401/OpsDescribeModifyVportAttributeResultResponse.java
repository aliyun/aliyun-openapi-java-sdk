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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeModifyVportAttributeResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeModifyVportAttributeResultResponse extends AcsResponse {

	private String requestId;

	private String workflowToken;

	private List<FailedEniListItem> failedEniList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getWorkflowToken() {
		return this.workflowToken;
	}

	public void setWorkflowToken(String workflowToken) {
		this.workflowToken = workflowToken;
	}

	public List<FailedEniListItem> getFailedEniList() {
		return this.failedEniList;
	}

	public void setFailedEniList(List<FailedEniListItem> failedEniList) {
		this.failedEniList = failedEniList;
	}

	public static class FailedEniListItem {

		private String eniName;

		private Integer code;

		private String message;

		public String getEniName() {
			return this.eniName;
		}

		public void setEniName(String eniName) {
			this.eniName = eniName;
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
	}

	@Override
	public OpsDescribeModifyVportAttributeResultResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeModifyVportAttributeResultResponseUnmarshaller.unmarshall(this, context);
	}
}
