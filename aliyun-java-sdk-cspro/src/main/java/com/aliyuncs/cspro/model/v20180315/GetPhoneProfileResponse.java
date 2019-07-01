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

package com.aliyuncs.cspro.model.v20180315;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cspro.transform.v20180315.GetPhoneProfileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPhoneProfileResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String phone;

		private Info info;

		public String getPhone() {
			return this.phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public Info getInfo() {
			return this.info;
		}

		public void setInfo(Info info) {
			this.info = info;
		}

		public static class Info {

			private Integer isVirtualOperator;

			private Integer isBlackPhone;

			private Integer isBlackCampaign1d;

			private Integer isBlackCampaign7d;

			private Integer isBlackCampaign30d;

			private String province;

			private String city;

			private String operator;

			public Integer getIsVirtualOperator() {
				return this.isVirtualOperator;
			}

			public void setIsVirtualOperator(Integer isVirtualOperator) {
				this.isVirtualOperator = isVirtualOperator;
			}

			public Integer getIsBlackPhone() {
				return this.isBlackPhone;
			}

			public void setIsBlackPhone(Integer isBlackPhone) {
				this.isBlackPhone = isBlackPhone;
			}

			public Integer getIsBlackCampaign1d() {
				return this.isBlackCampaign1d;
			}

			public void setIsBlackCampaign1d(Integer isBlackCampaign1d) {
				this.isBlackCampaign1d = isBlackCampaign1d;
			}

			public Integer getIsBlackCampaign7d() {
				return this.isBlackCampaign7d;
			}

			public void setIsBlackCampaign7d(Integer isBlackCampaign7d) {
				this.isBlackCampaign7d = isBlackCampaign7d;
			}

			public Integer getIsBlackCampaign30d() {
				return this.isBlackCampaign30d;
			}

			public void setIsBlackCampaign30d(Integer isBlackCampaign30d) {
				this.isBlackCampaign30d = isBlackCampaign30d;
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

			public String getOperator() {
				return this.operator;
			}

			public void setOperator(String operator) {
				this.operator = operator;
			}
		}
	}

	@Override
	public GetPhoneProfileResponse getInstance(UnmarshallerContext context) {
		return	GetPhoneProfileResponseUnmarshaller.unmarshall(this, context);
	}
}
