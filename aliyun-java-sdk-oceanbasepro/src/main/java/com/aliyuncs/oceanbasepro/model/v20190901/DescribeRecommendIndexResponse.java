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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeRecommendIndexResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRecommendIndexResponse extends AcsResponse {

	private String requestId;

	private RecommendIndex recommendIndex;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RecommendIndex getRecommendIndex() {
		return this.recommendIndex;
	}

	public void setRecommendIndex(RecommendIndex recommendIndex) {
		this.recommendIndex = recommendIndex;
	}

	public static class RecommendIndex {

		private String suggestIndex;

		private String tenantMode;

		private String tableList;

		public String getSuggestIndex() {
			return this.suggestIndex;
		}

		public void setSuggestIndex(String suggestIndex) {
			this.suggestIndex = suggestIndex;
		}

		public String getTenantMode() {
			return this.tenantMode;
		}

		public void setTenantMode(String tenantMode) {
			this.tenantMode = tenantMode;
		}

		public String getTableList() {
			return this.tableList;
		}

		public void setTableList(String tableList) {
			this.tableList = tableList;
		}
	}

	@Override
	public DescribeRecommendIndexResponse getInstance(UnmarshallerContext context) {
		return	DescribeRecommendIndexResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
