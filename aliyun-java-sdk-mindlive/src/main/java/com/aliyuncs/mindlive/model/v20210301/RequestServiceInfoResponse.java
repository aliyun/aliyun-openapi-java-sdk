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

package com.aliyuncs.mindlive.model.v20210301;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mindlive.transform.v20210301.RequestServiceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RequestServiceInfoResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

		private Long serviceEffectAt;

		private Long serviceExpireAt;

		private String servicePackName;

		public Long getServiceEffectAt() {
			return this.serviceEffectAt;
		}

		public void setServiceEffectAt(Long serviceEffectAt) {
			this.serviceEffectAt = serviceEffectAt;
		}

		public Long getServiceExpireAt() {
			return this.serviceExpireAt;
		}

		public void setServiceExpireAt(Long serviceExpireAt) {
			this.serviceExpireAt = serviceExpireAt;
		}

		public String getServicePackName() {
			return this.servicePackName;
		}

		public void setServicePackName(String servicePackName) {
			this.servicePackName = servicePackName;
		}
	}

	@Override
	public RequestServiceInfoResponse getInstance(UnmarshallerContext context) {
		return	RequestServiceInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
