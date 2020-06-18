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

package com.aliyuncs.dyiotapi.model.v20171111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyiotapi.transform.v20171111.DoIotChgBindOrUnBindResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DoIotChgBindOrUnBindResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private IotModBind iotModBind;

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

	public IotModBind getIotModBind() {
		return this.iotModBind;
	}

	public void setIotModBind(IotModBind iotModBind) {
		this.iotModBind = iotModBind;
	}

	public static class IotModBind {

		private Boolean isModSuccess;

		public Boolean getIsModSuccess() {
			return this.isModSuccess;
		}

		public void setIsModSuccess(Boolean isModSuccess) {
			this.isModSuccess = isModSuccess;
		}
	}

	@Override
	public DoIotChgBindOrUnBindResponse getInstance(UnmarshallerContext context) {
		return	DoIotChgBindOrUnBindResponseUnmarshaller.unmarshall(this, context);
	}
}
