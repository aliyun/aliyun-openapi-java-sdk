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

package com.aliyuncs.cloudauth.model.v20190307;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth.transform.v20190307.VerifyDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class VerifyDeviceResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private ResultObject resultObject;

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

	public ResultObject getResultObject() {
		return this.resultObject;
	}

	public void setResultObject(ResultObject resultObject) {
		this.resultObject = resultObject;
	}

	public static class ResultObject {

		private String validationRetCode;

		private String productRetCode;

		private String retCodeSub;

		private String retMessageSub;

		private String hasNext;

		private String extParams;

		public String getValidationRetCode() {
			return this.validationRetCode;
		}

		public void setValidationRetCode(String validationRetCode) {
			this.validationRetCode = validationRetCode;
		}

		public String getProductRetCode() {
			return this.productRetCode;
		}

		public void setProductRetCode(String productRetCode) {
			this.productRetCode = productRetCode;
		}

		public String getRetCodeSub() {
			return this.retCodeSub;
		}

		public void setRetCodeSub(String retCodeSub) {
			this.retCodeSub = retCodeSub;
		}

		public String getRetMessageSub() {
			return this.retMessageSub;
		}

		public void setRetMessageSub(String retMessageSub) {
			this.retMessageSub = retMessageSub;
		}

		public String getHasNext() {
			return this.hasNext;
		}

		public void setHasNext(String hasNext) {
			this.hasNext = hasNext;
		}

		public String getExtParams() {
			return this.extParams;
		}

		public void setExtParams(String extParams) {
			this.extParams = extParams;
		}
	}

	@Override
	public VerifyDeviceResponse getInstance(UnmarshallerContext context) {
		return	VerifyDeviceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
