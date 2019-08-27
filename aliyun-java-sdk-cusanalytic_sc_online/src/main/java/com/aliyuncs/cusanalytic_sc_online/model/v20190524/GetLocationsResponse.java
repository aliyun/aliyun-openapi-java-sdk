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
import com.aliyuncs.cusanalytic_sc_online.transform.v20190524.GetLocationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLocationsResponse extends AcsResponse {

	private Long storeId;

	private List<LocationItem> locationItems;

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public List<LocationItem> getLocationItems() {
		return this.locationItems;
	}

	public void setLocationItems(List<LocationItem> locationItems) {
		this.locationItems = locationItems;
	}

	public static class LocationItem {

		private Integer status;

		private Long storeId;

		private String name;

		private Boolean link;

		private String locationType;

		private Long locationId;

		private Long parentLocationId;

		private String layerType;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getStoreId() {
			return this.storeId;
		}

		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getLink() {
			return this.link;
		}

		public void setLink(Boolean link) {
			this.link = link;
		}

		public String getLocationType() {
			return this.locationType;
		}

		public void setLocationType(String locationType) {
			this.locationType = locationType;
		}

		public Long getLocationId() {
			return this.locationId;
		}

		public void setLocationId(Long locationId) {
			this.locationId = locationId;
		}

		public Long getParentLocationId() {
			return this.parentLocationId;
		}

		public void setParentLocationId(Long parentLocationId) {
			this.parentLocationId = parentLocationId;
		}

		public String getLayerType() {
			return this.layerType;
		}

		public void setLayerType(String layerType) {
			this.layerType = layerType;
		}
	}

	@Override
	public GetLocationsResponse getInstance(UnmarshallerContext context) {
		return	GetLocationsResponseUnmarshaller.unmarshall(this, context);
	}
}
