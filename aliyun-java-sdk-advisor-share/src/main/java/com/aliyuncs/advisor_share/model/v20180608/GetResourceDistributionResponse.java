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
import com.aliyuncs.advisor_share.transform.v20180608.GetResourceDistributionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetResourceDistributionResponse extends AcsResponse {

	private String requestId;

	private List<ProductDistributionDTO> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ProductDistributionDTO> getData() {
		return this.data;
	}

	public void setData(List<ProductDistributionDTO> data) {
		this.data = data;
	}

	public static class ProductDistributionDTO {

		private String product;

		private List<ResourceDistributionDTO> regionDistribution;

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public List<ResourceDistributionDTO> getRegionDistribution() {
			return this.regionDistribution;
		}

		public void setRegionDistribution(List<ResourceDistributionDTO> regionDistribution) {
			this.regionDistribution = regionDistribution;
		}

		public static class ResourceDistributionDTO {

			private String regionId;

			private Integer resourceCount;

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public Integer getResourceCount() {
				return this.resourceCount;
			}

			public void setResourceCount(Integer resourceCount) {
				this.resourceCount = resourceCount;
			}
		}
	}

	@Override
	public GetResourceDistributionResponse getInstance(UnmarshallerContext context) {
		return	GetResourceDistributionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
