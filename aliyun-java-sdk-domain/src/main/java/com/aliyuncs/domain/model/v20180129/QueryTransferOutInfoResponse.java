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

package com.aliyuncs.domain.model.v20180129;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.QueryTransferOutInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTransferOutInfoResponse extends AcsResponse {

	private String requestId;

	private Integer status;

	private String email;

	private String transferAuthorizationCodeSendDate;

	private String expirationDate;

	private String pendingRequestDate;

	private String resultCode;

	private String resultMsg;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTransferAuthorizationCodeSendDate() {
		return this.transferAuthorizationCodeSendDate;
	}

	public void setTransferAuthorizationCodeSendDate(String transferAuthorizationCodeSendDate) {
		this.transferAuthorizationCodeSendDate = transferAuthorizationCodeSendDate;
	}

	public String getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getPendingRequestDate() {
		return this.pendingRequestDate;
	}

	public void setPendingRequestDate(String pendingRequestDate) {
		this.pendingRequestDate = pendingRequestDate;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return this.resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	@Override
	public QueryTransferOutInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryTransferOutInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
