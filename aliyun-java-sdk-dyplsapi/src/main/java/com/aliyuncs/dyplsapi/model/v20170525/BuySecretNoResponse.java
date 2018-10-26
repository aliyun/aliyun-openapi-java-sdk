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

package com.aliyuncs.dyplsapi.model.v20170525;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyplsapi.transform.v20170525.BuySecretNoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BuySecretNoResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private SecretBuyInfoDTO secretBuyInfoDTO;

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

	public SecretBuyInfoDTO getSecretBuyInfoDTO() {
		return this.secretBuyInfoDTO;
	}

	public void setSecretBuyInfoDTO(SecretBuyInfoDTO secretBuyInfoDTO) {
		this.secretBuyInfoDTO = secretBuyInfoDTO;
	}

	public static class SecretBuyInfoDTO {

		private String secretNo;

		public String getSecretNo() {
			return this.secretNo;
		}

		public void setSecretNo(String secretNo) {
			this.secretNo = secretNo;
		}
	}

	@Override
	public BuySecretNoResponse getInstance(UnmarshallerContext context) {
		return	BuySecretNoResponseUnmarshaller.unmarshall(this, context);
	}
}
