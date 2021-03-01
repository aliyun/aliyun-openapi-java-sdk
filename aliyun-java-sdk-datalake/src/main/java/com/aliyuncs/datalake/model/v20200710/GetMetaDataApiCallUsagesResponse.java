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

package com.aliyuncs.datalake.model.v20200710;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.datalake.transform.v20200710.GetMetaDataApiCallUsagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMetaDataApiCallUsagesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Boolean success;

	private List<MetaDataApiCallUsage> metaDataApiCallUsages;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<MetaDataApiCallUsage> getMetaDataApiCallUsages() {
		return this.metaDataApiCallUsages;
	}

	public void setMetaDataApiCallUsages(List<MetaDataApiCallUsage> metaDataApiCallUsages) {
		this.metaDataApiCallUsages = metaDataApiCallUsages;
	}

	public static class MetaDataApiCallUsage {

		private String queryTime;

		private String month;

		private Long apiCall;

		public String getQueryTime() {
			return this.queryTime;
		}

		public void setQueryTime(String queryTime) {
			this.queryTime = queryTime;
		}

		public String getMonth() {
			return this.month;
		}

		public void setMonth(String month) {
			this.month = month;
		}

		public Long getApiCall() {
			return this.apiCall;
		}

		public void setApiCall(Long apiCall) {
			this.apiCall = apiCall;
		}
	}

	@Override
	public GetMetaDataApiCallUsagesResponse getInstance(UnmarshallerContext context) {
		return	GetMetaDataApiCallUsagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
