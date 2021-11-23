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

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QueryCustomerAddressListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCustomerAddressListResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<CustomerInvoiceAddress> customerInvoiceAddressList;

		public List<CustomerInvoiceAddress> getCustomerInvoiceAddressList() {
			return this.customerInvoiceAddressList;
		}

		public void setCustomerInvoiceAddressList(List<CustomerInvoiceAddress> customerInvoiceAddressList) {
			this.customerInvoiceAddressList = customerInvoiceAddressList;
		}

		public static class CustomerInvoiceAddress {

			private String addressee;

			private String postalCode;

			private Long userId;

			private String city;

			private String userNick;

			private String street;

			private String phone;

			private String county;

			private String bizType;

			private String deliveryAddress;

			private Long id;

			private String province;

			public String getAddressee() {
				return this.addressee;
			}

			public void setAddressee(String addressee) {
				this.addressee = addressee;
			}

			public String getPostalCode() {
				return this.postalCode;
			}

			public void setPostalCode(String postalCode) {
				this.postalCode = postalCode;
			}

			public Long getUserId() {
				return this.userId;
			}

			public void setUserId(Long userId) {
				this.userId = userId;
			}

			public String getCity() {
				return this.city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getUserNick() {
				return this.userNick;
			}

			public void setUserNick(String userNick) {
				this.userNick = userNick;
			}

			public String getStreet() {
				return this.street;
			}

			public void setStreet(String street) {
				this.street = street;
			}

			public String getPhone() {
				return this.phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}

			public String getCounty() {
				return this.county;
			}

			public void setCounty(String county) {
				this.county = county;
			}

			public String getBizType() {
				return this.bizType;
			}

			public void setBizType(String bizType) {
				this.bizType = bizType;
			}

			public String getDeliveryAddress() {
				return this.deliveryAddress;
			}

			public void setDeliveryAddress(String deliveryAddress) {
				this.deliveryAddress = deliveryAddress;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getProvince() {
				return this.province;
			}

			public void setProvince(String province) {
				this.province = province;
			}
		}
	}

	@Override
	public QueryCustomerAddressListResponse getInstance(UnmarshallerContext context) {
		return	QueryCustomerAddressListResponseUnmarshaller.unmarshall(this, context);
	}
}
