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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetAKSAcrTempAccountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAKSAcrTempAccountResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String authorizationToken;

	private Long expireDate;

	private String tempUserName;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getAuthorizationToken() {
		return this.authorizationToken;
	}

	public void setAuthorizationToken(String authorizationToken) {
		this.authorizationToken = authorizationToken;
	}

	public Long getExpireDate() {
		return this.expireDate;
	}

	public void setExpireDate(Long expireDate) {
		this.expireDate = expireDate;
	}

	public String getTempUserName() {
		return this.tempUserName;
	}

	public void setTempUserName(String tempUserName) {
		this.tempUserName = tempUserName;
	}

	@Override
	public GetAKSAcrTempAccountResponse getInstance(UnmarshallerContext context) {
		return	GetAKSAcrTempAccountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
