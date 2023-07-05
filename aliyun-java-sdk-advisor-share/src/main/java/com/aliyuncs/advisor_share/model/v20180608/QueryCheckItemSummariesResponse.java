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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.QueryCheckItemSummariesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCheckItemSummariesResponse extends AcsResponse {

	private String requestId;

	private List<CheckItemSummary> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CheckItemSummary> getData() {
		return this.data;
	}

	public void setData(List<CheckItemSummary> data) {
		this.data = data;
	}

	public static class CheckItemSummary {

		private Long impressionCount;

		private Long adviceCount;

		private Float conversionRate;

		private String product;

		private String checkId;

		private Long detailViewCount;

		private String category;

		private Long acceptedCount;

		public Long getImpressionCount() {
			return this.impressionCount;
		}

		public void setImpressionCount(Long impressionCount) {
			this.impressionCount = impressionCount;
		}

		public Long getAdviceCount() {
			return this.adviceCount;
		}

		public void setAdviceCount(Long adviceCount) {
			this.adviceCount = adviceCount;
		}

		public Float getConversionRate() {
			return this.conversionRate;
		}

		public void setConversionRate(Float conversionRate) {
			this.conversionRate = conversionRate;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getCheckId() {
			return this.checkId;
		}

		public void setCheckId(String checkId) {
			this.checkId = checkId;
		}

		public Long getDetailViewCount() {
			return this.detailViewCount;
		}

		public void setDetailViewCount(Long detailViewCount) {
			this.detailViewCount = detailViewCount;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public Long getAcceptedCount() {
			return this.acceptedCount;
		}

		public void setAcceptedCount(Long acceptedCount) {
			this.acceptedCount = acceptedCount;
		}
	}

	@Override
	public QueryCheckItemSummariesResponse getInstance(UnmarshallerContext context) {
		return	QueryCheckItemSummariesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
