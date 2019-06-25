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

package com.aliyuncs.market.model.v20151101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.market.transform.v20151101.SearchCommoditiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchCommoditiesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long total;

		private List<Commodity> commodities;

		private Pageable pageable;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<Commodity> getCommodities() {
			return this.commodities;
		}

		public void setCommodities(List<Commodity> commodities) {
			this.commodities = commodities;
		}

		public Pageable getPageable() {
			return this.pageable;
		}

		public void setPageable(Pageable pageable) {
			this.pageable = pageable;
		}

		public static class Commodity {

			private String commodityId;

			private String properties;

			private String commoditySuggestedPrice;

			private String commodityScore;

			private String supplierId;

			private String supplierName;

			public String getCommodityId() {
				return this.commodityId;
			}

			public void setCommodityId(String commodityId) {
				this.commodityId = commodityId;
			}

			public String getProperties() {
				return this.properties;
			}

			public void setProperties(String properties) {
				this.properties = properties;
			}

			public String getCommoditySuggestedPrice() {
				return this.commoditySuggestedPrice;
			}

			public void setCommoditySuggestedPrice(String commoditySuggestedPrice) {
				this.commoditySuggestedPrice = commoditySuggestedPrice;
			}

			public String getCommodityScore() {
				return this.commodityScore;
			}

			public void setCommodityScore(String commodityScore) {
				this.commodityScore = commodityScore;
			}

			public String getSupplierId() {
				return this.supplierId;
			}

			public void setSupplierId(String supplierId) {
				this.supplierId = supplierId;
			}

			public String getSupplierName() {
				return this.supplierName;
			}

			public void setSupplierName(String supplierName) {
				this.supplierName = supplierName;
			}
		}

		public static class Pageable {

			private Integer pageIndex;

			private Integer pageSize;

			public Integer getPageIndex() {
				return this.pageIndex;
			}

			public void setPageIndex(Integer pageIndex) {
				this.pageIndex = pageIndex;
			}

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}
		}
	}

	@Override
	public SearchCommoditiesResponse getInstance(UnmarshallerContext context) {
		return	SearchCommoditiesResponseUnmarshaller.unmarshall(this, context);
	}
}
