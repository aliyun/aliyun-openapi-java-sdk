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

package com.aliyuncs.dyvms.model.v20170620;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyvms.transform.v20170620.QueryCustInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCustInfoResponse extends AcsResponse {

	private String requestId;

	private String code;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long custId;

		private Long partnerId;

		private Long userTag;

		private Long userTag2;

		private String custName;

		private Integer osStatus;

		private Integer certifyType;

		private String contactPhone;

		public Long getCustId() {
			return this.custId;
		}

		public void setCustId(Long custId) {
			this.custId = custId;
		}

		public Long getPartnerId() {
			return this.partnerId;
		}

		public void setPartnerId(Long partnerId) {
			this.partnerId = partnerId;
		}

		public Long getUserTag() {
			return this.userTag;
		}

		public void setUserTag(Long userTag) {
			this.userTag = userTag;
		}

		public Long getUserTag2() {
			return this.userTag2;
		}

		public void setUserTag2(Long userTag2) {
			this.userTag2 = userTag2;
		}

		public String getCustName() {
			return this.custName;
		}

		public void setCustName(String custName) {
			this.custName = custName;
		}

		public Integer getOsStatus() {
			return this.osStatus;
		}

		public void setOsStatus(Integer osStatus) {
			this.osStatus = osStatus;
		}

		public Integer getCertifyType() {
			return this.certifyType;
		}

		public void setCertifyType(Integer certifyType) {
			this.certifyType = certifyType;
		}

		public String getContactPhone() {
			return this.contactPhone;
		}

		public void setContactPhone(String contactPhone) {
			this.contactPhone = contactPhone;
		}
	}

	@Override
	public QueryCustInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryCustInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
