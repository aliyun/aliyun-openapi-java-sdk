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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.copyright.transform.v20190123.GetLicenseInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLicenseInfoResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String enterpriseTime;

		private String effectivePeriod;

		private String cardNum;

		private String address;

		private String city;

		private String name;

		private String province;

		private String companyName;

		public String getEnterpriseTime() {
			return this.enterpriseTime;
		}

		public void setEnterpriseTime(String enterpriseTime) {
			this.enterpriseTime = enterpriseTime;
		}

		public String getEffectivePeriod() {
			return this.effectivePeriod;
		}

		public void setEffectivePeriod(String effectivePeriod) {
			this.effectivePeriod = effectivePeriod;
		}

		public String getCardNum() {
			return this.cardNum;
		}

		public void setCardNum(String cardNum) {
			this.cardNum = cardNum;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getCompanyName() {
			return this.companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
	}

	@Override
	public GetLicenseInfoResponse getInstance(UnmarshallerContext context) {
		return	GetLicenseInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
