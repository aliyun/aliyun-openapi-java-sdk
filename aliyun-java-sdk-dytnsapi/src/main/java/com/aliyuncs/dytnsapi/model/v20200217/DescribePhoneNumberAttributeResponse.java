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

package com.aliyuncs.dytnsapi.model.v20200217;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dytnsapi.transform.v20200217.DescribePhoneNumberAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePhoneNumberAttributeResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private PhoneNumberAttribute phoneNumberAttribute;

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

	public PhoneNumberAttribute getPhoneNumberAttribute() {
		return this.phoneNumberAttribute;
	}

	public void setPhoneNumberAttribute(PhoneNumberAttribute phoneNumberAttribute) {
		this.phoneNumberAttribute = phoneNumberAttribute;
	}

	public static class PhoneNumberAttribute {

		private String basicCarrier;

		private String carrier;

		private Boolean isNumberPortability;

		private Long numberSegment;

		private String city;

		private String province;

		public String getBasicCarrier() {
			return this.basicCarrier;
		}

		public void setBasicCarrier(String basicCarrier) {
			this.basicCarrier = basicCarrier;
		}

		public String getCarrier() {
			return this.carrier;
		}

		public void setCarrier(String carrier) {
			this.carrier = carrier;
		}

		public Boolean getIsNumberPortability() {
			return this.isNumberPortability;
		}

		public void setIsNumberPortability(Boolean isNumberPortability) {
			this.isNumberPortability = isNumberPortability;
		}

		public Long getNumberSegment() {
			return this.numberSegment;
		}

		public void setNumberSegment(Long numberSegment) {
			this.numberSegment = numberSegment;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}
	}

	@Override
	public DescribePhoneNumberAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribePhoneNumberAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
