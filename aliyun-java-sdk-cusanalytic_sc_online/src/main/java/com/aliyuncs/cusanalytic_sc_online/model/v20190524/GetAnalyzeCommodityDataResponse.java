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

package com.aliyuncs.cusanalytic_sc_online.model.v20190524;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cusanalytic_sc_online.transform.v20190524.GetAnalyzeCommodityDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAnalyzeCommodityDataResponse extends AcsResponse {

	private Integer pageIndex;

	private Integer total;

	private Integer pageSize;

	private List<AnalyzeCommodityItem> analyzeCommodityItems;

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<AnalyzeCommodityItem> getAnalyzeCommodityItems() {
		return this.analyzeCommodityItems;
	}

	public void setAnalyzeCommodityItems(List<AnalyzeCommodityItem> analyzeCommodityItems) {
		this.analyzeCommodityItems = analyzeCommodityItems;
	}

	public static class AnalyzeCommodityItem {

		private String locationNames;

		private Long supportCount;

		private String locationIds;

		private Long itemCount;

		public String getLocationNames() {
			return this.locationNames;
		}

		public void setLocationNames(String locationNames) {
			this.locationNames = locationNames;
		}

		public Long getSupportCount() {
			return this.supportCount;
		}

		public void setSupportCount(Long supportCount) {
			this.supportCount = supportCount;
		}

		public String getLocationIds() {
			return this.locationIds;
		}

		public void setLocationIds(String locationIds) {
			this.locationIds = locationIds;
		}

		public Long getItemCount() {
			return this.itemCount;
		}

		public void setItemCount(Long itemCount) {
			this.itemCount = itemCount;
		}
	}

	@Override
	public GetAnalyzeCommodityDataResponse getInstance(UnmarshallerContext context) {
		return	GetAnalyzeCommodityDataResponseUnmarshaller.unmarshall(this, context);
	}
}
