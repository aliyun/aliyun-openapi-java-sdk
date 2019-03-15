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

package com.aliyuncs.finmall.model.v20180723;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.finmall.transform.v20180723.GetCustomStatusInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCustomStatusInfoResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String userState;

		private String validateState;

		private String validateTime;

		private String customId;

		public String getUserState() {
			return this.userState;
		}

		public void setUserState(String userState) {
			this.userState = userState;
		}

		public String getValidateState() {
			return this.validateState;
		}

		public void setValidateState(String validateState) {
			this.validateState = validateState;
		}

		public String getValidateTime() {
			return this.validateTime;
		}

		public void setValidateTime(String validateTime) {
			this.validateTime = validateTime;
		}

		public String getCustomId() {
			return this.customId;
		}

		public void setCustomId(String customId) {
			this.customId = customId;
		}
	}

	@Override
	public GetCustomStatusInfoResponse getInstance(UnmarshallerContext context) {
		return	GetCustomStatusInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
