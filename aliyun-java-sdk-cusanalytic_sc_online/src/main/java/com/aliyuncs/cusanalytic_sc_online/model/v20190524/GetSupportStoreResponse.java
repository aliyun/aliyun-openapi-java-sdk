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
import com.aliyuncs.cusanalytic_sc_online.transform.v20190524.GetSupportStoreResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSupportStoreResponse extends AcsResponse {

	private List<StorePopDTO> storePopDTOs;

	public List<StorePopDTO> getStorePopDTOs() {
		return this.storePopDTOs;
	}

	public void setStorePopDTOs(List<StorePopDTO> storePopDTOs) {
		this.storePopDTOs = storePopDTOs;
	}

	public static class StorePopDTO {

		private Long storeId;

		private String name;

		private String regionName;

		private String openingStartTime;

		private String openingEndTime;

		private Long regionId;

		private String storeType;

		private String address;

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

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getOpeningStartTime() {
			return this.openingStartTime;
		}

		public void setOpeningStartTime(String openingStartTime) {
			this.openingStartTime = openingStartTime;
		}

		public String getOpeningEndTime() {
			return this.openingEndTime;
		}

		public void setOpeningEndTime(String openingEndTime) {
			this.openingEndTime = openingEndTime;
		}

		public Long getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(Long regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public Long getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(Long regionId) {
			this.regionId = regionId;
		}

		public String getStoreType() {
			return this.storeType;
		}

		public void setStoreType(String storeType) {
			this.storeType = storeType;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
	}

	@Override
	public GetSupportStoreResponse getInstance(UnmarshallerContext context) {
		return	GetSupportStoreResponseUnmarshaller.unmarshall(this, context);
	}
}
