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

package com.aliyuncs.paifeaturestore.model.v20230621;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.paifeaturestore.transform.v20230621.CheckModelFeatureFGFeatureResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckModelFeatureFGFeatureResponse extends AcsResponse {

	private String requestId;

	private List<FGCheckResultsItem> fGCheckResults;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FGCheckResultsItem> getFGCheckResults() {
		return this.fGCheckResults;
	}

	public void setFGCheckResults(List<FGCheckResultsItem> fGCheckResults) {
		this.fGCheckResults = fGCheckResults;
	}

	public static class FGCheckResultsItem {

		private String ruleCode;

		private Boolean status;

		private String message;

		public String getRuleCode() {
			return this.ruleCode;
		}

		public void setRuleCode(String ruleCode) {
			this.ruleCode = ruleCode;
		}

		public Boolean getStatus() {
			return this.status;
		}

		public void setStatus(Boolean status) {
			this.status = status;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	@Override
	public CheckModelFeatureFGFeatureResponse getInstance(UnmarshallerContext context) {
		return	CheckModelFeatureFGFeatureResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
