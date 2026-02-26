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

package com.aliyuncs.quotas.model.v20200510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quotas.transform.v20200510.CreateQuotaApplicationsForTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateQuotaApplicationsForTemplateResponse extends AcsResponse {

	private String requestId;

	private String batchQuotaApplicationId;

	private List<FailResultsItem> failResults;

	private List<String> aliyunUids;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBatchQuotaApplicationId() {
		return this.batchQuotaApplicationId;
	}

	public void setBatchQuotaApplicationId(String batchQuotaApplicationId) {
		this.batchQuotaApplicationId = batchQuotaApplicationId;
	}

	public List<FailResultsItem> getFailResults() {
		return this.failResults;
	}

	public void setFailResults(List<FailResultsItem> failResults) {
		this.failResults = failResults;
	}

	public List<String> getAliyunUids() {
		return this.aliyunUids;
	}

	public void setAliyunUids(List<String> aliyunUids) {
		this.aliyunUids = aliyunUids;
	}

	public static class FailResultsItem {

		private String aliyunUid;

		private String reason;

		public String getAliyunUid() {
			return this.aliyunUid;
		}

		public void setAliyunUid(String aliyunUid) {
			this.aliyunUid = aliyunUid;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}
	}

	@Override
	public CreateQuotaApplicationsForTemplateResponse getInstance(UnmarshallerContext context) {
		return	CreateQuotaApplicationsForTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
