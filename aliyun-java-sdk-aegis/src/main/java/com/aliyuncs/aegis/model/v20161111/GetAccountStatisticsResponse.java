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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.GetAccountStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAccountStatisticsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private Boolean success;

	private String message;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer remoteLogin;

		private Integer crackSuccess;

		public Integer getRemoteLogin() {
			return this.remoteLogin;
		}

		public void setRemoteLogin(Integer remoteLogin) {
			this.remoteLogin = remoteLogin;
		}

		public Integer getCrackSuccess() {
			return this.crackSuccess;
		}

		public void setCrackSuccess(Integer crackSuccess) {
			this.crackSuccess = crackSuccess;
		}
	}

	@Override
	public GetAccountStatisticsResponse getInstance(UnmarshallerContext context) {
		return	GetAccountStatisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
