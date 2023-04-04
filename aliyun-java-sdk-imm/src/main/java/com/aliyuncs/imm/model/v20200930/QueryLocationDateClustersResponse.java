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

package com.aliyuncs.imm.model.v20200930;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20200930.QueryLocationDateClustersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLocationDateClustersResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<LocationDateClustersItem> locationDateClusters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<LocationDateClustersItem> getLocationDateClusters() {
		return this.locationDateClusters;
	}

	public void setLocationDateClusters(List<LocationDateClustersItem> locationDateClusters) {
		this.locationDateClusters = locationDateClusters;
	}

	public static class LocationDateClustersItem {

		private String title;

		private String locationDateClusterLevel;

		private String locationDateClusterStartTime;

		private String locationDateClusterEndTime;

		private String objectId;

		private String updateTime;

		private String createTime;

		private String customId;

		private Map<Object,Object> customLabels;

		private List<AddressesItem> addresses;

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getLocationDateClusterLevel() {
			return this.locationDateClusterLevel;
		}

		public void setLocationDateClusterLevel(String locationDateClusterLevel) {
			this.locationDateClusterLevel = locationDateClusterLevel;
		}

		public String getLocationDateClusterStartTime() {
			return this.locationDateClusterStartTime;
		}

		public void setLocationDateClusterStartTime(String locationDateClusterStartTime) {
			this.locationDateClusterStartTime = locationDateClusterStartTime;
		}

		public String getLocationDateClusterEndTime() {
			return this.locationDateClusterEndTime;
		}

		public void setLocationDateClusterEndTime(String locationDateClusterEndTime) {
			this.locationDateClusterEndTime = locationDateClusterEndTime;
		}

		public String getObjectId() {
			return this.objectId;
		}

		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getCustomId() {
			return this.customId;
		}

		public void setCustomId(String customId) {
			this.customId = customId;
		}

		public Map<Object,Object> getCustomLabels() {
			return this.customLabels;
		}

		public void setCustomLabels(Map<Object,Object> customLabels) {
			this.customLabels = customLabels;
		}

		public List<AddressesItem> getAddresses() {
			return this.addresses;
		}

		public void setAddresses(List<AddressesItem> addresses) {
			this.addresses = addresses;
		}

		public static class AddressesItem {

			private String language;

			private String addressLine;

			private String country;

			private String province;

			private String city;

			private String district;

			private String township;

			public String getLanguage() {
				return this.language;
			}

			public void setLanguage(String language) {
				this.language = language;
			}

			public String getAddressLine() {
				return this.addressLine;
			}

			public void setAddressLine(String addressLine) {
				this.addressLine = addressLine;
			}

			public String getCountry() {
				return this.country;
			}

			public void setCountry(String country) {
				this.country = country;
			}

			public String getProvince() {
				return this.province;
			}

			public void setProvince(String province) {
				this.province = province;
			}

			public String getCity() {
				return this.city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getDistrict() {
				return this.district;
			}

			public void setDistrict(String district) {
				this.district = district;
			}

			public String getTownship() {
				return this.township;
			}

			public void setTownship(String township) {
				this.township = township;
			}
		}
	}

	@Override
	public QueryLocationDateClustersResponse getInstance(UnmarshallerContext context) {
		return	QueryLocationDateClustersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
