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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.account_crm.transform.v20160606.QueryAccountAddressInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAccountAddressInfoResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private ProfileInfo profileInfo;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public ProfileInfo getProfileInfo() {
		return this.profileInfo;
	}

	public void setProfileInfo(ProfileInfo profileInfo) {
		this.profileInfo = profileInfo;
	}

	public static class ProfileInfo {

		private String accountAttr;

		private String address6;

		private String postCode;

		private String address4;

		private String email;

		private String havanaId;

		private String address3;

		private String address5;

		private String version;

		private String address;

		private String nationalityCode;

		private String address2;

		private String trueName;

		private String selfServicingBusinessRegNum;

		private String selfServicingIdentificationNum;

		private District district;

		private City city;

		private Province province;

		public String getAccountAttr() {
			return this.accountAttr;
		}

		public void setAccountAttr(String accountAttr) {
			this.accountAttr = accountAttr;
		}

		public String getAddress6() {
			return this.address6;
		}

		public void setAddress6(String address6) {
			this.address6 = address6;
		}

		public String getPostCode() {
			return this.postCode;
		}

		public void setPostCode(String postCode) {
			this.postCode = postCode;
		}

		public String getAddress4() {
			return this.address4;
		}

		public void setAddress4(String address4) {
			this.address4 = address4;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getHavanaId() {
			return this.havanaId;
		}

		public void setHavanaId(String havanaId) {
			this.havanaId = havanaId;
		}

		public String getAddress3() {
			return this.address3;
		}

		public void setAddress3(String address3) {
			this.address3 = address3;
		}

		public String getAddress5() {
			return this.address5;
		}

		public void setAddress5(String address5) {
			this.address5 = address5;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getNationalityCode() {
			return this.nationalityCode;
		}

		public void setNationalityCode(String nationalityCode) {
			this.nationalityCode = nationalityCode;
		}

		public String getAddress2() {
			return this.address2;
		}

		public void setAddress2(String address2) {
			this.address2 = address2;
		}

		public String getTrueName() {
			return this.trueName;
		}

		public void setTrueName(String trueName) {
			this.trueName = trueName;
		}

		public String getSelfServicingBusinessRegNum() {
			return this.selfServicingBusinessRegNum;
		}

		public void setSelfServicingBusinessRegNum(String selfServicingBusinessRegNum) {
			this.selfServicingBusinessRegNum = selfServicingBusinessRegNum;
		}

		public String getSelfServicingIdentificationNum() {
			return this.selfServicingIdentificationNum;
		}

		public void setSelfServicingIdentificationNum(String selfServicingIdentificationNum) {
			this.selfServicingIdentificationNum = selfServicingIdentificationNum;
		}

		public District getDistrict() {
			return this.district;
		}

		public void setDistrict(District district) {
			this.district = district;
		}

		public City getCity() {
			return this.city;
		}

		public void setCity(City city) {
			this.city = city;
		}

		public Province getProvince() {
			return this.province;
		}

		public void setProvince(Province province) {
			this.province = province;
		}

		public static class District {

			private String name;

			private String id;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}

		public static class City {

			private String name;

			private String id;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}

		public static class Province {

			private String name;

			private String id;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}
	}

	@Override
	public QueryAccountAddressInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryAccountAddressInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
