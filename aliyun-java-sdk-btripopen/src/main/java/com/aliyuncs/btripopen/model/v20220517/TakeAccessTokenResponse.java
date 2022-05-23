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

package com.aliyuncs.btripopen.model.v20220517;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.btripopen.transform.v20220517.TakeAccessTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TakeAccessTokenResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String success;

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

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String access_token;

		private Long expire;

		public String getAccess_token() {
			return this.access_token;
		}

		public void setAccess_token(String access_token) {
			this.access_token = access_token;
		}

		public Long getExpire() {
			return this.expire;
		}

		public void setExpire(Long expire) {
			this.expire = expire;
		}
	}

	@Override
	public TakeAccessTokenResponse getInstance(UnmarshallerContext context) {
		return	TakeAccessTokenResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
