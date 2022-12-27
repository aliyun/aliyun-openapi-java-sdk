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
import com.aliyuncs.config.transform.v20200907.DeleteRemediationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteRemediationsResponse extends AcsResponse {

	private String requestId;

	private List<RemediationDeleteResult> remediationDeleteResults;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RemediationDeleteResult> getRemediationDeleteResults() {
		return this.remediationDeleteResults;
	}

	public void setRemediationDeleteResults(List<RemediationDeleteResult> remediationDeleteResults) {
		this.remediationDeleteResults = remediationDeleteResults;
	}

	public static class RemediationDeleteResult {

		private String remediationId;

		private String errorMessage;

		private Boolean success;

		public String getRemediationId() {
			return this.remediationId;
		}

		public void setRemediationId(String remediationId) {
			this.remediationId = remediationId;
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
	}

	@Override
	public DeleteRemediationsResponse getInstance(UnmarshallerContext context) {
		return	DeleteRemediationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
