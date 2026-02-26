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

package com.aliyuncs.kms.model.v20160120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.kms.transform.v20160120.CreateClientKeyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateClientKeyResponse extends AcsResponse {

	private String requestId;

	private String clientKeyId;

	private String keyAlgorithm;

	private String privateKeyData;

	private String notBefore;

	private String notAfter;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getClientKeyId() {
		return this.clientKeyId;
	}

	public void setClientKeyId(String clientKeyId) {
		this.clientKeyId = clientKeyId;
	}

	public String getKeyAlgorithm() {
		return this.keyAlgorithm;
	}

	public void setKeyAlgorithm(String keyAlgorithm) {
		this.keyAlgorithm = keyAlgorithm;
	}

	public String getPrivateKeyData() {
		return this.privateKeyData;
	}

	public void setPrivateKeyData(String privateKeyData) {
		this.privateKeyData = privateKeyData;
	}

	public String getNotBefore() {
		return this.notBefore;
	}

	public void setNotBefore(String notBefore) {
		this.notBefore = notBefore;
	}

	public String getNotAfter() {
		return this.notAfter;
	}

	public void setNotAfter(String notAfter) {
		this.notAfter = notAfter;
	}

	@Override
	public CreateClientKeyResponse getInstance(UnmarshallerContext context) {
		return	CreateClientKeyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
