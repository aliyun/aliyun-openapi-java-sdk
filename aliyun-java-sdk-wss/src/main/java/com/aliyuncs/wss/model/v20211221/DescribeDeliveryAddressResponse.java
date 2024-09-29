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

package com.aliyuncs.wss.model.v20211221;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.wss.transform.v20211221.DescribeDeliveryAddressResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeliveryAddressResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<Address> addresses;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public static class Address {

		private String postalCode;

		private String contacts;

		private String mobile;

		private Boolean defaultAddress;

		private String detail;

		private Province province;

		private City city;

		private Area area;

		private Town town;

		public String getPostalCode() {
			return this.postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		public String getContacts() {
			return this.contacts;
		}

		public void setContacts(String contacts) {
			this.contacts = contacts;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public Boolean getDefaultAddress() {
			return this.defaultAddress;
		}

		public void setDefaultAddress(Boolean defaultAddress) {
			this.defaultAddress = defaultAddress;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public Province getProvince() {
			return this.province;
		}

		public void setProvince(Province province) {
			this.province = province;
		}

		public City getCity() {
			return this.city;
		}

		public void setCity(City city) {
			this.city = city;
		}

		public Area getArea() {
			return this.area;
		}

		public void setArea(Area area) {
			this.area = area;
		}

		public Town getTown() {
			return this.town;
		}

		public void setTown(Town town) {
			this.town = town;
		}

		public static class Province {

			private Long provinceId;

			private String provinceName;

			public Long getProvinceId() {
				return this.provinceId;
			}

			public void setProvinceId(Long provinceId) {
				this.provinceId = provinceId;
			}

			public String getProvinceName() {
				return this.provinceName;
			}

			public void setProvinceName(String provinceName) {
				this.provinceName = provinceName;
			}
		}

		public static class City {

			private Long cityId;

			private String cityName;

			public Long getCityId() {
				return this.cityId;
			}

			public void setCityId(Long cityId) {
				this.cityId = cityId;
			}

			public String getCityName() {
				return this.cityName;
			}

			public void setCityName(String cityName) {
				this.cityName = cityName;
			}
		}

		public static class Area {

			private String areaName;

			private Long areaId;

			public String getAreaName() {
				return this.areaName;
			}

			public void setAreaName(String areaName) {
				this.areaName = areaName;
			}

			public Long getAreaId() {
				return this.areaId;
			}

			public void setAreaId(Long areaId) {
				this.areaId = areaId;
			}
		}

		public static class Town {

			private String townName;

			private Long townId;

			public String getTownName() {
				return this.townName;
			}

			public void setTownName(String townName) {
				this.townName = townName;
			}

			public Long getTownId() {
				return this.townId;
			}

			public void setTownId(Long townId) {
				this.townId = townId;
			}
		}
	}

	@Override
	public DescribeDeliveryAddressResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeliveryAddressResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
