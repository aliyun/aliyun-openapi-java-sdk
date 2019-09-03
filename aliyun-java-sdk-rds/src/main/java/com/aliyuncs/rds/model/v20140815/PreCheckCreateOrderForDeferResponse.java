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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.PreCheckCreateOrderForDeferResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PreCheckCreateOrderForDeferResponse extends AcsResponse {

	private String requestId;

	private Boolean preCheckResult;

	private List<FailuresItem> failures;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getPreCheckResult() {
		return this.preCheckResult;
	}

	public void setPreCheckResult(Boolean preCheckResult) {
		this.preCheckResult = preCheckResult;
	}

	public List<FailuresItem> getFailures() {
		return this.failures;
	}

	public void setFailures(List<FailuresItem> failures) {
		this.failures = failures;
	}

	public static class FailuresItem {

		private String code;

		private String message;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
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
	public PreCheckCreateOrderForDeferResponse getInstance(UnmarshallerContext context) {
		return	PreCheckCreateOrderForDeferResponseUnmarshaller.unmarshall(this, context);
	}
}
