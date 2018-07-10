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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetAuditResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAuditResultResponse extends AcsResponse {

	private String requestId;

	private AIAuditResult aIAuditResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AIAuditResult getAIAuditResult() {
		return this.aIAuditResult;
	}

	public void setAIAuditResult(AIAuditResult aIAuditResult) {
		this.aIAuditResult = aIAuditResult;
	}

	public static class AIAuditResult {

		private String label;

		private String terrorismResult;

		private String pornResult;

		public String getLabel() {
			return this.label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getTerrorismResult() {
			return this.terrorismResult;
		}

		public void setTerrorismResult(String terrorismResult) {
			this.terrorismResult = terrorismResult;
		}

		public String getPornResult() {
			return this.pornResult;
		}

		public void setPornResult(String pornResult) {
			this.pornResult = pornResult;
		}
	}

	@Override
	public GetAuditResultResponse getInstance(UnmarshallerContext context) {
		return	GetAuditResultResponseUnmarshaller.unmarshall(this, context);
	}
}
