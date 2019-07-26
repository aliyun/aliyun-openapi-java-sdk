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
import com.aliyuncs.cusanalytic_sc_online.transform.v20190524.GetAnalyzePlaceDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAnalyzePlaceDataResponse extends AcsResponse {

	private Long count;

	private Long storeId;

	private Float percent;

	private String locationName;

	private String parentLocationIds;

	private Long locationId;

	private List<AnalyzePlaceItem> analyzePlaceItems;

	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public Float getPercent() {
		return this.percent;
	}

	public void setPercent(Float percent) {
		this.percent = percent;
	}

	public String getLocationName() {
		return this.locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getParentLocationIds() {
		return this.parentLocationIds;
	}

	public void setParentLocationIds(String parentLocationIds) {
		this.parentLocationIds = parentLocationIds;
	}

	public Long getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public List<AnalyzePlaceItem> getAnalyzePlaceItems() {
		return this.analyzePlaceItems;
	}

	public void setAnalyzePlaceItems(List<AnalyzePlaceItem> analyzePlaceItems) {
		this.analyzePlaceItems = analyzePlaceItems;
	}

	public static class AnalyzePlaceItem {

		private String locationName;

		private Long locationId;

		private String parentLocationIds;

		private Long count;

		private Long storeId;

		private Float percent;

		public String getLocationName() {
			return this.locationName;
		}

		public void setLocationName(String locationName) {
			this.locationName = locationName;
		}

		public Long getLocationId() {
			return this.locationId;
		}

		public void setLocationId(Long locationId) {
			this.locationId = locationId;
		}

		public String getParentLocationIds() {
			return this.parentLocationIds;
		}

		public void setParentLocationIds(String parentLocationIds) {
			this.parentLocationIds = parentLocationIds;
		}

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Long getStoreId() {
			return this.storeId;
		}

		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}

		public Float getPercent() {
			return this.percent;
		}

		public void setPercent(Float percent) {
			this.percent = percent;
		}
	}

	@Override
	public GetAnalyzePlaceDataResponse getInstance(UnmarshallerContext context) {
		return	GetAnalyzePlaceDataResponseUnmarshaller.unmarshall(this, context);
	}
}
