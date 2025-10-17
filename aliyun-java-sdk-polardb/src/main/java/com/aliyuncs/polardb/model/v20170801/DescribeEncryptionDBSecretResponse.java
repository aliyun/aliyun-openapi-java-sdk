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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeEncryptionDBSecretResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEncryptionDBSecretResponse extends AcsResponse {

	private String requestId;

	private String encryptionKeyStatus;

	private String encryptionKey;

	private String encryptionDBStatus;

	private String dBClusterId;

	private String encryptionDBRegion;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEncryptionKeyStatus() {
		return this.encryptionKeyStatus;
	}

	public void setEncryptionKeyStatus(String encryptionKeyStatus) {
		this.encryptionKeyStatus = encryptionKeyStatus;
	}

	public String getEncryptionKey() {
		return this.encryptionKey;
	}

	public void setEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
	}

	public String getEncryptionDBStatus() {
		return this.encryptionDBStatus;
	}

	public void setEncryptionDBStatus(String encryptionDBStatus) {
		this.encryptionDBStatus = encryptionDBStatus;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public String getEncryptionDBRegion() {
		return this.encryptionDBRegion;
	}

	public void setEncryptionDBRegion(String encryptionDBRegion) {
		this.encryptionDBRegion = encryptionDBRegion;
	}

	@Override
	public DescribeEncryptionDBSecretResponse getInstance(UnmarshallerContext context) {
		return	DescribeEncryptionDBSecretResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
