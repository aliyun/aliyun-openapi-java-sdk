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
import com.aliyuncs.finmall.transform.v20180723.VerifyCustomerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class VerifyCustomerResponse extends AcsResponse {

	private String requestId;

	private String code;

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

		private String returnCode;

		private String zhimaReturnUrl;

		public String getReturnCode() {
			return this.returnCode;
		}

		public void setReturnCode(String returnCode) {
			this.returnCode = returnCode;
		}

		public String getZhimaReturnUrl() {
			return this.zhimaReturnUrl;
		}

		public void setZhimaReturnUrl(String zhimaReturnUrl) {
			this.zhimaReturnUrl = zhimaReturnUrl;
		}
	}

	@Override
	public VerifyCustomerResponse getInstance(UnmarshallerContext context) {
		return	VerifyCustomerResponseUnmarshaller.unmarshall(this, context);
	}
}
