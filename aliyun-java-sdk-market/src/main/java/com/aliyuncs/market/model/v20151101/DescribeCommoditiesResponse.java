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
import com.aliyuncs.market.transform.v20151101.DescribeCommoditiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCommoditiesResponse extends AcsResponse {

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

		private Long totalCount;

		private List<Commodity> commodities;

		private Pageable pageable;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
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

			private String applicationId;

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

			public String getApplicationId() {
				return this.applicationId;
			}

			public void setApplicationId(String applicationId) {
				this.applicationId = applicationId;
			}
		}

		public static class Pageable {

			private Integer pageNumber;

			private Integer pageSize;

			public Integer getPageNumber() {
				return this.pageNumber;
			}

			public void setPageNumber(Integer pageNumber) {
				this.pageNumber = pageNumber;
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
	public DescribeCommoditiesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCommoditiesResponseUnmarshaller.unmarshall(this, context);
	}
}
