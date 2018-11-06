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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeAssetSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAssetSummaryResponse extends AcsResponse {

	private String requestId;

	private Summary summary;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Summary getSummary() {
		return this.summary;
	}

	public void setSummary(Summary summary) {
		this.summary = summary;
	}

	public static class Summary {

		private Integer totalCount;

		private Integer offline;

		private Integer online;

		private Integer allRegionCount;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getOffline() {
			return this.offline;
		}

		public void setOffline(Integer offline) {
			this.offline = offline;
		}

		public Integer getOnline() {
			return this.online;
		}

		public void setOnline(Integer online) {
			this.online = online;
		}

		public Integer getAllRegionCount() {
			return this.allRegionCount;
		}

		public void setAllRegionCount(Integer allRegionCount) {
			this.allRegionCount = allRegionCount;
		}
	}

	@Override
	public DescribeAssetSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeAssetSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
