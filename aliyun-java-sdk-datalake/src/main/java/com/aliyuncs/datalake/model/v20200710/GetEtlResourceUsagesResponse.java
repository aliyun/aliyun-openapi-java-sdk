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
import com.aliyuncs.datalake.transform.v20200710.GetEtlResourceUsagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEtlResourceUsagesResponse extends AcsResponse {

	private String requestId;

	private String totalCount;

	private Boolean success;

	private List<EtlResourceUsage> etlResourceUsages;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<EtlResourceUsage> getEtlResourceUsages() {
		return this.etlResourceUsages;
	}

	public void setEtlResourceUsages(List<EtlResourceUsage> etlResourceUsages) {
		this.etlResourceUsages = etlResourceUsages;
	}

	public static class EtlResourceUsage {

		private String queryTime;

		private String month;

		private Long cuUsage;

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

		public Long getCuUsage() {
			return this.cuUsage;
		}

		public void setCuUsage(Long cuUsage) {
			this.cuUsage = cuUsage;
		}
	}

	@Override
	public GetEtlResourceUsagesResponse getInstance(UnmarshallerContext context) {
		return	GetEtlResourceUsagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
