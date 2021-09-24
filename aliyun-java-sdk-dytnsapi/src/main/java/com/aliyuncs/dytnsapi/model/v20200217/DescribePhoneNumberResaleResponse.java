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

package com.aliyuncs.dytnsapi.model.v20200217;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dytnsapi.transform.v20200217.DescribePhoneNumberResaleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePhoneNumberResaleResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private TwiceTelVerify twiceTelVerify;

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

	public TwiceTelVerify getTwiceTelVerify() {
		return this.twiceTelVerify;
	}

	public void setTwiceTelVerify(TwiceTelVerify twiceTelVerify) {
		this.twiceTelVerify = twiceTelVerify;
	}

	public static class TwiceTelVerify {

		private String carrier;

		private Integer verifyResult;

		public String getCarrier() {
			return this.carrier;
		}

		public void setCarrier(String carrier) {
			this.carrier = carrier;
		}

		public Integer getVerifyResult() {
			return this.verifyResult;
		}

		public void setVerifyResult(Integer verifyResult) {
			this.verifyResult = verifyResult;
		}
	}

	@Override
	public DescribePhoneNumberResaleResponse getInstance(UnmarshallerContext context) {
		return	DescribePhoneNumberResaleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
