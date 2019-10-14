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

package com.aliyuncs.linkwan.model.v20190301;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20190301.DeleteExternalNodeTuplesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteExternalNodeTuplesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private Long successCount;

		private Long failedCount;

		private List<FailedDetailsItem> failedDetails;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Long getSuccessCount() {
			return this.successCount;
		}

		public void setSuccessCount(Long successCount) {
			this.successCount = successCount;
		}

		public Long getFailedCount() {
			return this.failedCount;
		}

		public void setFailedCount(Long failedCount) {
			this.failedCount = failedCount;
		}

		public List<FailedDetailsItem> getFailedDetails() {
			return this.failedDetails;
		}

		public void setFailedDetails(List<FailedDetailsItem> failedDetails) {
			this.failedDetails = failedDetails;
		}

		public static class FailedDetailsItem {

			private String devEui;

			private String operationResult;

			public String getDevEui() {
				return this.devEui;
			}

			public void setDevEui(String devEui) {
				this.devEui = devEui;
			}

			public String getOperationResult() {
				return this.operationResult;
			}

			public void setOperationResult(String operationResult) {
				this.operationResult = operationResult;
			}
		}
	}

	@Override
	public DeleteExternalNodeTuplesResponse getInstance(UnmarshallerContext context) {
		return	DeleteExternalNodeTuplesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
