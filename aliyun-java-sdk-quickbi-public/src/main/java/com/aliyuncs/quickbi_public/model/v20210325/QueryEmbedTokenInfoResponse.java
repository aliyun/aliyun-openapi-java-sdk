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

package com.aliyuncs.quickbi_public.model.v20210325;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20210325.QueryEmbedTokenInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryEmbedTokenInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String accessToken;

		private Long tokeType;

		private String invalidTime;

		private String registerTime;

		public String getAccessToken() {
			return this.accessToken;
		}

		public void setAccessToken(String accessToken) {
			this.accessToken = accessToken;
		}

		public Long getTokeType() {
			return this.tokeType;
		}

		public void setTokeType(Long tokeType) {
			this.tokeType = tokeType;
		}

		public String getInvalidTime() {
			return this.invalidTime;
		}

		public void setInvalidTime(String invalidTime) {
			this.invalidTime = invalidTime;
		}

		public String getRegisterTime() {
			return this.registerTime;
		}

		public void setRegisterTime(String registerTime) {
			this.registerTime = registerTime;
		}
	}

	@Override
	public QueryEmbedTokenInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryEmbedTokenInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
