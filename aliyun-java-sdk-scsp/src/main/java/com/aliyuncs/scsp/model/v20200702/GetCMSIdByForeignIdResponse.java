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

package com.aliyuncs.scsp.model.v20200702;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.scsp.transform.v20200702.GetCMSIdByForeignIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCMSIdByForeignIdResponse extends AcsResponse {

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

		private String userId;

		private String nick;

		private String phone;

		private String foreignId;

		private String avatar;

		private String gender;

		private Integer customerTypeId;

		private Boolean anonymity;

		private Integer status;

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getNick() {
			return this.nick;
		}

		public void setNick(String nick) {
			this.nick = nick;
		}

		public String getPhone() {
			return this.phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getForeignId() {
			return this.foreignId;
		}

		public void setForeignId(String foreignId) {
			this.foreignId = foreignId;
		}

		public String getAvatar() {
			return this.avatar;
		}

		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public Integer getCustomerTypeId() {
			return this.customerTypeId;
		}

		public void setCustomerTypeId(Integer customerTypeId) {
			this.customerTypeId = customerTypeId;
		}

		public Boolean getAnonymity() {
			return this.anonymity;
		}

		public void setAnonymity(Boolean anonymity) {
			this.anonymity = anonymity;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public GetCMSIdByForeignIdResponse getInstance(UnmarshallerContext context) {
		return	GetCMSIdByForeignIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
