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
import com.aliyuncs.dypnsapi.transform.v20170525.JyCreateVerifySchemeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class JyCreateVerifySchemeResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private GateVerifySchemeData gateVerifySchemeData;

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

	public GateVerifySchemeData getGateVerifySchemeData() {
		return this.gateVerifySchemeData;
	}

	public void setGateVerifySchemeData(GateVerifySchemeData gateVerifySchemeData) {
		this.gateVerifySchemeData = gateVerifySchemeData;
	}

	public static class GateVerifySchemeData {

		private String schemeCode;

		public String getSchemeCode() {
			return this.schemeCode;
		}

		public void setSchemeCode(String schemeCode) {
			this.schemeCode = schemeCode;
		}
	}

	@Override
	public JyCreateVerifySchemeResponse getInstance(UnmarshallerContext context) {
		return	JyCreateVerifySchemeResponseUnmarshaller.unmarshall(this, context);
	}
}
