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

package com.aliyuncs.dypnsapi.model.v20170525;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dypnsapi.transform.v20170525.VerifyPhoneWithTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class VerifyPhoneWithTokenResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private GateVerify gateVerify;

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

	public GateVerify getGateVerify() {
		return this.gateVerify;
	}

	public void setGateVerify(GateVerify gateVerify) {
		this.gateVerify = gateVerify;
	}

	public static class GateVerify {

		private String verifyId;

		private String verifyResult;

		public String getVerifyId() {
			return this.verifyId;
		}

		public void setVerifyId(String verifyId) {
			this.verifyId = verifyId;
		}

		public String getVerifyResult() {
			return this.verifyResult;
		}

		public void setVerifyResult(String verifyResult) {
			this.verifyResult = verifyResult;
		}
	}

	@Override
	public VerifyPhoneWithTokenResponse getInstance(UnmarshallerContext context) {
		return	VerifyPhoneWithTokenResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
