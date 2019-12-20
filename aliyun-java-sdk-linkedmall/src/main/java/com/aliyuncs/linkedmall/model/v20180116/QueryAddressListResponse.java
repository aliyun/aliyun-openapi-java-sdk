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

package com.aliyuncs.linkedmall.model.v20180116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.QueryAddressListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAddressListResponse extends AcsResponse {

	private String code;

	private String requestId;

	private String message;

	private List<Address> addressList;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Address> getAddressList() {
		return this.addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

	public static class Address {

		private Long addressId;

		private String fullName;

		private String mobile;

		private String country;

		private String province;

		private String city;

		private String town;

		private String townDivisionCode;

		private String addressDetail;

		private String postCode;

		private Integer status;

		private String divisionCode;

		private String area;

		public Long getAddressId() {
			return this.addressId;
		}

		public void setAddressId(Long addressId) {
			this.addressId = addressId;
		}

		public String getFullName() {
			return this.fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
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

		public String getTown() {
			return this.town;
		}

		public void setTown(String town) {
			this.town = town;
		}

		public String getTownDivisionCode() {
			return this.townDivisionCode;
		}

		public void setTownDivisionCode(String townDivisionCode) {
			this.townDivisionCode = townDivisionCode;
		}

		public String getAddressDetail() {
			return this.addressDetail;
		}

		public void setAddressDetail(String addressDetail) {
			this.addressDetail = addressDetail;
		}

		public String getPostCode() {
			return this.postCode;
		}

		public void setPostCode(String postCode) {
			this.postCode = postCode;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getDivisionCode() {
			return this.divisionCode;
		}

		public void setDivisionCode(String divisionCode) {
			this.divisionCode = divisionCode;
		}

		public String getArea() {
			return this.area;
		}

		public void setArea(String area) {
			this.area = area;
		}
	}

	@Override
	public QueryAddressListResponse getInstance(UnmarshallerContext context) {
		return	QueryAddressListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
