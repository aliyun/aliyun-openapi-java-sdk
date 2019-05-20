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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.BindAXNPrivacyNumberResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BindAXNPrivacyNumberResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Data data;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String poolId;

		private String type;

		private String telX;

		private String poolName;

		private String phoneNumber;

		private String extra;

		private String bizId;

		private String areaCode;

		private String subId;

		public String getPoolId() {
			return this.poolId;
		}

		public void setPoolId(String poolId) {
			this.poolId = poolId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getTelX() {
			return this.telX;
		}

		public void setTelX(String telX) {
			this.telX = telX;
		}

		public String getPoolName() {
			return this.poolName;
		}

		public void setPoolName(String poolName) {
			this.poolName = poolName;
		}

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getExtra() {
			return this.extra;
		}

		public void setExtra(String extra) {
			this.extra = extra;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getAreaCode() {
			return this.areaCode;
		}

		public void setAreaCode(String areaCode) {
			this.areaCode = areaCode;
		}

		public String getSubId() {
			return this.subId;
		}

		public void setSubId(String subId) {
			this.subId = subId;
		}
	}

	@Override
	public BindAXNPrivacyNumberResponse getInstance(UnmarshallerContext context) {
		return	BindAXNPrivacyNumberResponseUnmarshaller.unmarshall(this, context);
	}
}
