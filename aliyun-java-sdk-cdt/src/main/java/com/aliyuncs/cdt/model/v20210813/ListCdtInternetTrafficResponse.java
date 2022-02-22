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

package com.aliyuncs.cdt.model.v20210813;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdt.transform.v20210813.ListCdtInternetTrafficResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCdtInternetTrafficResponse extends AcsResponse {

	private String requestId;

	private List<TrafficDetailsItem> trafficDetails;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TrafficDetailsItem> getTrafficDetails() {
		return this.trafficDetails;
	}

	public void setTrafficDetails(List<TrafficDetailsItem> trafficDetails) {
		this.trafficDetails = trafficDetails;
	}

	public static class TrafficDetailsItem {

		private String iSPType;

		private String businessRegionId;

		private Long traffic;

		private List<ProductTrafficDetailsItem> productTrafficDetails;

		private List<TrafficTierDetailsItem> trafficTierDetails;

		public String getISPType() {
			return this.iSPType;
		}

		public void setISPType(String iSPType) {
			this.iSPType = iSPType;
		}

		public String getBusinessRegionId() {
			return this.businessRegionId;
		}

		public void setBusinessRegionId(String businessRegionId) {
			this.businessRegionId = businessRegionId;
		}

		public Long getTraffic() {
			return this.traffic;
		}

		public void setTraffic(Long traffic) {
			this.traffic = traffic;
		}

		public List<ProductTrafficDetailsItem> getProductTrafficDetails() {
			return this.productTrafficDetails;
		}

		public void setProductTrafficDetails(List<ProductTrafficDetailsItem> productTrafficDetails) {
			this.productTrafficDetails = productTrafficDetails;
		}

		public List<TrafficTierDetailsItem> getTrafficTierDetails() {
			return this.trafficTierDetails;
		}

		public void setTrafficTierDetails(List<TrafficTierDetailsItem> trafficTierDetails) {
			this.trafficTierDetails = trafficTierDetails;
		}

		public static class ProductTrafficDetailsItem {

			private String product;

			private Long traffic;

			public String getProduct() {
				return this.product;
			}

			public void setProduct(String product) {
				this.product = product;
			}

			public Long getTraffic() {
				return this.traffic;
			}

			public void setTraffic(Long traffic) {
				this.traffic = traffic;
			}
		}

		public static class TrafficTierDetailsItem {

			private Long tier;

			private Long traffic;

			private Long lowestTraffic;

			private Long highestTraffic;

			public Long getTier() {
				return this.tier;
			}

			public void setTier(Long tier) {
				this.tier = tier;
			}

			public Long getTraffic() {
				return this.traffic;
			}

			public void setTraffic(Long traffic) {
				this.traffic = traffic;
			}

			public Long getLowestTraffic() {
				return this.lowestTraffic;
			}

			public void setLowestTraffic(Long lowestTraffic) {
				this.lowestTraffic = lowestTraffic;
			}

			public Long getHighestTraffic() {
				return this.highestTraffic;
			}

			public void setHighestTraffic(Long highestTraffic) {
				this.highestTraffic = highestTraffic;
			}
		}
	}

	@Override
	public ListCdtInternetTrafficResponse getInstance(UnmarshallerContext context) {
		return	ListCdtInternetTrafficResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
