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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetDataArchiveCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataArchiveCountResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long failCount;

		private Long processingCount;

		private Long successCount;

		private Long totalCount;

		public Long getFailCount() {
			return this.failCount;
		}

		public void setFailCount(Long failCount) {
			this.failCount = failCount;
		}

		public Long getProcessingCount() {
			return this.processingCount;
		}

		public void setProcessingCount(Long processingCount) {
			this.processingCount = processingCount;
		}

		public Long getSuccessCount() {
			return this.successCount;
		}

		public void setSuccessCount(Long successCount) {
			this.successCount = successCount;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}
	}

	@Override
	public GetDataArchiveCountResponse getInstance(UnmarshallerContext context) {
		return	GetDataArchiveCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
