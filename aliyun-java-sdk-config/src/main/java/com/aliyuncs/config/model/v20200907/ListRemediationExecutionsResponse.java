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

package com.aliyuncs.config.model.v20200907;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.ListRemediationExecutionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRemediationExecutionsResponse extends AcsResponse {

	private String requestId;

	private RemediationExecutionData remediationExecutionData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RemediationExecutionData getRemediationExecutionData() {
		return this.remediationExecutionData;
	}

	public void setRemediationExecutionData(RemediationExecutionData remediationExecutionData) {
		this.remediationExecutionData = remediationExecutionData;
	}

	public static class RemediationExecutionData {

		private String nextToken;

		private Long maxResults;

		private List<RemediationExecutionsItem> remediationExecutions;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public Long getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Long maxResults) {
			this.maxResults = maxResults;
		}

		public List<RemediationExecutionsItem> getRemediationExecutions() {
			return this.remediationExecutions;
		}

		public void setRemediationExecutions(List<RemediationExecutionsItem> remediationExecutions) {
			this.remediationExecutions = remediationExecutions;
		}

		public static class RemediationExecutionsItem {

			private String executionInvocationId;

			private String executionStatus;

			private String executionResourceType;

			private String executionCreateDate;

			private String executionStatusMessage;

			private String executionResourceIds;

			public String getExecutionInvocationId() {
				return this.executionInvocationId;
			}

			public void setExecutionInvocationId(String executionInvocationId) {
				this.executionInvocationId = executionInvocationId;
			}

			public String getExecutionStatus() {
				return this.executionStatus;
			}

			public void setExecutionStatus(String executionStatus) {
				this.executionStatus = executionStatus;
			}

			public String getExecutionResourceType() {
				return this.executionResourceType;
			}

			public void setExecutionResourceType(String executionResourceType) {
				this.executionResourceType = executionResourceType;
			}

			public String getExecutionCreateDate() {
				return this.executionCreateDate;
			}

			public void setExecutionCreateDate(String executionCreateDate) {
				this.executionCreateDate = executionCreateDate;
			}

			public String getExecutionStatusMessage() {
				return this.executionStatusMessage;
			}

			public void setExecutionStatusMessage(String executionStatusMessage) {
				this.executionStatusMessage = executionStatusMessage;
			}

			public String getExecutionResourceIds() {
				return this.executionResourceIds;
			}

			public void setExecutionResourceIds(String executionResourceIds) {
				this.executionResourceIds = executionResourceIds;
			}
		}
	}

	@Override
	public ListRemediationExecutionsResponse getInstance(UnmarshallerContext context) {
		return	ListRemediationExecutionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
