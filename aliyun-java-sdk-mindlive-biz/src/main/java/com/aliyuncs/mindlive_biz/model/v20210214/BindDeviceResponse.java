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

package com.aliyuncs.mindlive_biz.model.v20210214;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mindlive_biz.transform.v20210214.BindDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BindDeviceResponse extends AcsResponse {

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private String errorCode;

	private Data data;

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Service service;

		public Service getService() {
			return this.service;
		}

		public void setService(Service service) {
			this.service = service;
		}

		public static class Service {

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
	}

	@Override
	public BindDeviceResponse getInstance(UnmarshallerContext context) {
		return	BindDeviceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
