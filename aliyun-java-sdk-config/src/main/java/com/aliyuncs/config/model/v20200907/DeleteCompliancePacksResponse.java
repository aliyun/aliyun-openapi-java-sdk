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
import com.aliyuncs.config.transform.v20200907.DeleteCompliancePacksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteCompliancePacksResponse extends AcsResponse {

	private String requestId;

	private OperateCompliancePacksResult operateCompliancePacksResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public OperateCompliancePacksResult getOperateCompliancePacksResult() {
		return this.operateCompliancePacksResult;
	}

	public void setOperateCompliancePacksResult(OperateCompliancePacksResult operateCompliancePacksResult) {
		this.operateCompliancePacksResult = operateCompliancePacksResult;
	}

	public static class OperateCompliancePacksResult {

		private List<OperateCompliancePacksItem> operateCompliancePacks;

		public List<OperateCompliancePacksItem> getOperateCompliancePacks() {
			return this.operateCompliancePacks;
		}

		public void setOperateCompliancePacks(List<OperateCompliancePacksItem> operateCompliancePacks) {
			this.operateCompliancePacks = operateCompliancePacks;
		}

		public static class OperateCompliancePacksItem {

			private String compliancePackId;

			private String errorCode;

			private Boolean success;

			public String getCompliancePackId() {
				return this.compliancePackId;
			}

			public void setCompliancePackId(String compliancePackId) {
				this.compliancePackId = compliancePackId;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public Boolean getSuccess() {
				return this.success;
			}

			public void setSuccess(Boolean success) {
				this.success = success;
			}
		}
	}

	@Override
	public DeleteCompliancePacksResponse getInstance(UnmarshallerContext context) {
		return	DeleteCompliancePacksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
