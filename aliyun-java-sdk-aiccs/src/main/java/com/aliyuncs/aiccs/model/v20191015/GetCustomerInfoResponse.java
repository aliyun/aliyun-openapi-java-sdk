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

package com.aliyuncs.aiccs.model.v20191015;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aiccs.transform.v20191015.GetCustomerInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCustomerInfoResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Boolean success;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

		private String nick;

		private String photo;

		private Long userId;

		private String realName;

		private String outerId;

		private Map<Object,Object> customizeFields;

		public String getNick() {
			return this.nick;
		}

		public void setNick(String nick) {
			this.nick = nick;
		}

		public String getPhoto() {
			return this.photo;
		}

		public void setPhoto(String photo) {
			this.photo = photo;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getRealName() {
			return this.realName;
		}

		public void setRealName(String realName) {
			this.realName = realName;
		}

		public String getOuterId() {
			return this.outerId;
		}

		public void setOuterId(String outerId) {
			this.outerId = outerId;
		}

		public Map<Object,Object> getCustomizeFields() {
			return this.customizeFields;
		}

		public void setCustomizeFields(Map<Object,Object> customizeFields) {
			this.customizeFields = customizeFields;
		}
	}

	@Override
	public GetCustomerInfoResponse getInstance(UnmarshallerContext context) {
		return	GetCustomerInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
