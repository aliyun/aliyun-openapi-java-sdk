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

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.foas.transform.v20181111.CheckRawPlanJsonResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckRawPlanJsonResponse extends AcsResponse {

	private String requestId;

	private PlanJsonInfo planJsonInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PlanJsonInfo getPlanJsonInfo() {
		return this.planJsonInfo;
	}

	public void setPlanJsonInfo(PlanJsonInfo planJsonInfo) {
		this.planJsonInfo = planJsonInfo;
	}

	public static class PlanJsonInfo {

		private String status;

		private String planJson;

		private String errorMessage;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPlanJson() {
			return this.planJson;
		}

		public void setPlanJson(String planJson) {
			this.planJson = planJson;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
	}

	@Override
	public CheckRawPlanJsonResponse getInstance(UnmarshallerContext context) {
		return	CheckRawPlanJsonResponseUnmarshaller.unmarshall(this, context);
	}
}
