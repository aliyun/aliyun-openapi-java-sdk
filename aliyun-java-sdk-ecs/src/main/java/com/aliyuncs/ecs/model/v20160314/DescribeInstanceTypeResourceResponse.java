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
import com.aliyuncs.ecs.transform.v20160314.DescribeInstanceTypeResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceTypeResourceResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<InstanceTypeResource> instanceTypeResources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<InstanceTypeResource> getInstanceTypeResources() {
		return this.instanceTypeResources;
	}

	public void setInstanceTypeResources(List<InstanceTypeResource> instanceTypeResources) {
		this.instanceTypeResources = instanceTypeResources;
	}

	public static class InstanceTypeResource {

		private String regionId;

		private String zoneId;

		private String instanceType;

		private String instanceTypeFamily;

		private String searchType;

		private Long totalQuota;

		private StockHealth stockHealth;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(String instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}

		public String getSearchType() {
			return this.searchType;
		}

		public void setSearchType(String searchType) {
			this.searchType = searchType;
		}

		public Long getTotalQuota() {
			return this.totalQuota;
		}

		public void setTotalQuota(Long totalQuota) {
			this.totalQuota = totalQuota;
		}

		public StockHealth getStockHealth() {
			return this.stockHealth;
		}

		public void setStockHealth(StockHealth stockHealth) {
			this.stockHealth = stockHealth;
		}

		public static class StockHealth {

			private Integer healthScore;

			private Integer adequacyScore;

			private Integer supplyScore;

			private Integer hotScore;

			public Integer getHealthScore() {
				return this.healthScore;
			}

			public void setHealthScore(Integer healthScore) {
				this.healthScore = healthScore;
			}

			public Integer getAdequacyScore() {
				return this.adequacyScore;
			}

			public void setAdequacyScore(Integer adequacyScore) {
				this.adequacyScore = adequacyScore;
			}

			public Integer getSupplyScore() {
				return this.supplyScore;
			}

			public void setSupplyScore(Integer supplyScore) {
				this.supplyScore = supplyScore;
			}

			public Integer getHotScore() {
				return this.hotScore;
			}

			public void setHotScore(Integer hotScore) {
				this.hotScore = hotScore;
			}
		}
	}

	@Override
	public DescribeInstanceTypeResourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceTypeResourceResponseUnmarshaller.unmarshall(this, context);
	}
}
