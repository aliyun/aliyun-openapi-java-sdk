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
import com.aliyuncs.cdt.transform.v20210813.ListCdtCrossBordTrafficResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCdtCrossBordTrafficResponse extends AcsResponse {

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

		private String businessRegionId;

		private Long traffic;

		private List<ProductTrafficDetailsItem> productTrafficDetails;

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
	}

	@Override
	public ListCdtCrossBordTrafficResponse getInstance(UnmarshallerContext context) {
		return	ListCdtCrossBordTrafficResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
