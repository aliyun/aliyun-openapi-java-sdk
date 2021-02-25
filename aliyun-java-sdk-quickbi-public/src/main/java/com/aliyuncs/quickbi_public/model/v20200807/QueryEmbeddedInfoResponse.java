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

package com.aliyuncs.quickbi_public.model.v20200807;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20200807.QueryEmbeddedInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryEmbeddedInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer maxCount;

		private Integer embeddedCount;

		private Detail detail;

		public Integer getMaxCount() {
			return this.maxCount;
		}

		public void setMaxCount(Integer maxCount) {
			this.maxCount = maxCount;
		}

		public Integer getEmbeddedCount() {
			return this.embeddedCount;
		}

		public void setEmbeddedCount(Integer embeddedCount) {
			this.embeddedCount = embeddedCount;
		}

		public Detail getDetail() {
			return this.detail;
		}

		public void setDetail(Detail detail) {
			this.detail = detail;
		}

		public static class Detail {

			private Integer report;

			private Integer page;

			private Integer dashboardOfflineQuery;

			public Integer getReport() {
				return this.report;
			}

			public void setReport(Integer report) {
				this.report = report;
			}

			public Integer getPage() {
				return this.page;
			}

			public void setPage(Integer page) {
				this.page = page;
			}

			public Integer getDashboardOfflineQuery() {
				return this.dashboardOfflineQuery;
			}

			public void setDashboardOfflineQuery(Integer dashboardOfflineQuery) {
				this.dashboardOfflineQuery = dashboardOfflineQuery;
			}
		}
	}

	@Override
	public QueryEmbeddedInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryEmbeddedInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
