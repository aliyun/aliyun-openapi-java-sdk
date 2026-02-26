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

package com.aliyuncs.iqs.model.v20240712;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iqs.transform.v20240712.QueryRestaurantsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRestaurantsResponse extends AcsResponse {

	private String requestId;

	private QueryResult queryResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public QueryResult getQueryResult() {
		return this.queryResult;
	}

	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}

	public static class QueryResult {

		private List<DataItem> data;

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private String address;

			private String cityCode;

			private String cityName;

			private String districtCode;

			private String districtName;

			private String id;

			private String latitude;

			private String longitude;

			private String name;

			private String provinceCode;

			private String provinceName;

			private String typeCode;

			private String types;

			private List<ImagesItem> images;

			private Metadata metadata;

			public String getAddress() {
				return this.address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getCityCode() {
				return this.cityCode;
			}

			public void setCityCode(String cityCode) {
				this.cityCode = cityCode;
			}

			public String getCityName() {
				return this.cityName;
			}

			public void setCityName(String cityName) {
				this.cityName = cityName;
			}

			public String getDistrictCode() {
				return this.districtCode;
			}

			public void setDistrictCode(String districtCode) {
				this.districtCode = districtCode;
			}

			public String getDistrictName() {
				return this.districtName;
			}

			public void setDistrictName(String districtName) {
				this.districtName = districtName;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getLatitude() {
				return this.latitude;
			}

			public void setLatitude(String latitude) {
				this.latitude = latitude;
			}

			public String getLongitude() {
				return this.longitude;
			}

			public void setLongitude(String longitude) {
				this.longitude = longitude;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getProvinceCode() {
				return this.provinceCode;
			}

			public void setProvinceCode(String provinceCode) {
				this.provinceCode = provinceCode;
			}

			public String getProvinceName() {
				return this.provinceName;
			}

			public void setProvinceName(String provinceName) {
				this.provinceName = provinceName;
			}

			public String getTypeCode() {
				return this.typeCode;
			}

			public void setTypeCode(String typeCode) {
				this.typeCode = typeCode;
			}

			public String getTypes() {
				return this.types;
			}

			public void setTypes(String types) {
				this.types = types;
			}

			public List<ImagesItem> getImages() {
				return this.images;
			}

			public void setImages(List<ImagesItem> images) {
				this.images = images;
			}

			public Metadata getMetadata() {
				return this.metadata;
			}

			public void setMetadata(Metadata metadata) {
				this.metadata = metadata;
			}

			public static class ImagesItem {

				private String title;

				private String url;

				public String getTitle() {
					return this.title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				public String getUrl() {
					return this.url;
				}

				public void setUrl(String url) {
					this.url = url;
				}
			}

			public static class Metadata {

				private String businessArea;

				private String dailyOpeningHours;

				private String mainTag;

				private String phone;

				private String score;

				private String weeklyOpeningDays;

				public String getBusinessArea() {
					return this.businessArea;
				}

				public void setBusinessArea(String businessArea) {
					this.businessArea = businessArea;
				}

				public String getDailyOpeningHours() {
					return this.dailyOpeningHours;
				}

				public void setDailyOpeningHours(String dailyOpeningHours) {
					this.dailyOpeningHours = dailyOpeningHours;
				}

				public String getMainTag() {
					return this.mainTag;
				}

				public void setMainTag(String mainTag) {
					this.mainTag = mainTag;
				}

				public String getPhone() {
					return this.phone;
				}

				public void setPhone(String phone) {
					this.phone = phone;
				}

				public String getScore() {
					return this.score;
				}

				public void setScore(String score) {
					this.score = score;
				}

				public String getWeeklyOpeningDays() {
					return this.weeklyOpeningDays;
				}

				public void setWeeklyOpeningDays(String weeklyOpeningDays) {
					this.weeklyOpeningDays = weeklyOpeningDays;
				}
			}
		}
	}

	@Override
	public QueryRestaurantsResponse getInstance(UnmarshallerContext context) {
		return	QueryRestaurantsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
