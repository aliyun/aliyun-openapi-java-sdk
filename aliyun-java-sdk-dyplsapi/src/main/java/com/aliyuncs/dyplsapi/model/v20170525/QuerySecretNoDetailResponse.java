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

package com.aliyuncs.dyplsapi.model.v20170525;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyplsapi.transform.v20170525.QuerySecretNoDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySecretNoDetailResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private SecretNoInfoDTO secretNoInfoDTO;

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

	public SecretNoInfoDTO getSecretNoInfoDTO() {
		return this.secretNoInfoDTO;
	}

	public void setSecretNoInfoDTO(SecretNoInfoDTO secretNoInfoDTO) {
		this.secretNoInfoDTO = secretNoInfoDTO;
	}

	public static class SecretNoInfoDTO {

		private String purchaseTime;

		private Long vendor;

		private String province;

		private String city;

		private Long secretStatus;

		private Integer certifyStatus;

		public String getPurchaseTime() {
			return this.purchaseTime;
		}

		public void setPurchaseTime(String purchaseTime) {
			this.purchaseTime = purchaseTime;
		}

		public Long getVendor() {
			return this.vendor;
		}

		public void setVendor(Long vendor) {
			this.vendor = vendor;
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

		public Long getSecretStatus() {
			return this.secretStatus;
		}

		public void setSecretStatus(Long secretStatus) {
			this.secretStatus = secretStatus;
		}

		public Integer getCertifyStatus() {
			return this.certifyStatus;
		}

		public void setCertifyStatus(Integer certifyStatus) {
			this.certifyStatus = certifyStatus;
		}
	}

	@Override
	public QuerySecretNoDetailResponse getInstance(UnmarshallerContext context) {
		return	QuerySecretNoDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
