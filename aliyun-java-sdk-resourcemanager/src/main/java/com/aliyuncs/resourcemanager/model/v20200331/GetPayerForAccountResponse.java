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

package com.aliyuncs.resourcemanager.model.v20200331;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcemanager.transform.v20200331.GetPayerForAccountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPayerForAccountResponse extends AcsResponse {

	private String requestId;

	private String payerAccountId;

	private String payerAccountName;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPayerAccountId() {
		return this.payerAccountId;
	}

	public void setPayerAccountId(String payerAccountId) {
		this.payerAccountId = payerAccountId;
	}

	public String getPayerAccountName() {
		return this.payerAccountName;
	}

	public void setPayerAccountName(String payerAccountName) {
		this.payerAccountName = payerAccountName;
	}

	@Override
	public GetPayerForAccountResponse getInstance(UnmarshallerContext context) {
		return	GetPayerForAccountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
