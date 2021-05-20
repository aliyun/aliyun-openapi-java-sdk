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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aiccs.transform.v20191015.StartMicroOutboundResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StartMicroOutboundResponse extends AcsResponse {

	private String invokeCreateTime;

	private String message;

	private String requestId;

	private String invokeCmdId;

	private String customerInfo;

	private String code;

	public String getInvokeCreateTime() {
		return this.invokeCreateTime;
	}

	public void setInvokeCreateTime(String invokeCreateTime) {
		this.invokeCreateTime = invokeCreateTime;
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

	public String getInvokeCmdId() {
		return this.invokeCmdId;
	}

	public void setInvokeCmdId(String invokeCmdId) {
		this.invokeCmdId = invokeCmdId;
	}

	public String getCustomerInfo() {
		return this.customerInfo;
	}

	public void setCustomerInfo(String customerInfo) {
		this.customerInfo = customerInfo;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public StartMicroOutboundResponse getInstance(UnmarshallerContext context) {
		return	StartMicroOutboundResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
