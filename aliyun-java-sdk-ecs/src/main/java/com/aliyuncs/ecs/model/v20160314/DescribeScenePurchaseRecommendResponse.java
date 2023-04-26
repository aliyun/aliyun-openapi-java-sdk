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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeScenePurchaseRecommendResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScenePurchaseRecommendResponse extends AcsResponse {

	private String requestId;

	private List<RecommendProduct> recommendProducts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RecommendProduct> getRecommendProducts() {
		return this.recommendProducts;
	}

	public void setRecommendProducts(List<RecommendProduct> recommendProducts) {
		this.recommendProducts = recommendProducts;
	}

	public static class RecommendProduct {

		private String regionId;

		private List<RecommendSpSpec> recommendSpSpecs;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public List<RecommendSpSpec> getRecommendSpSpecs() {
			return this.recommendSpSpecs;
		}

		public void setRecommendSpSpecs(List<RecommendSpSpec> recommendSpSpecs) {
			this.recommendSpSpecs = recommendSpSpecs;
		}

		public static class RecommendSpSpec {

			private Integer duration;

			private String pricingCycle;

			private String type;

			private String payMode;

			private String effectiveDate;

			private String recommendReason;

			public Integer getDuration() {
				return this.duration;
			}

			public void setDuration(Integer duration) {
				this.duration = duration;
			}

			public String getPricingCycle() {
				return this.pricingCycle;
			}

			public void setPricingCycle(String pricingCycle) {
				this.pricingCycle = pricingCycle;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getPayMode() {
				return this.payMode;
			}

			public void setPayMode(String payMode) {
				this.payMode = payMode;
			}

			public String getEffectiveDate() {
				return this.effectiveDate;
			}

			public void setEffectiveDate(String effectiveDate) {
				this.effectiveDate = effectiveDate;
			}

			public String getRecommendReason() {
				return this.recommendReason;
			}

			public void setRecommendReason(String recommendReason) {
				this.recommendReason = recommendReason;
			}
		}
	}

	@Override
	public DescribeScenePurchaseRecommendResponse getInstance(UnmarshallerContext context) {
		return	DescribeScenePurchaseRecommendResponseUnmarshaller.unmarshall(this, context);
	}
}
