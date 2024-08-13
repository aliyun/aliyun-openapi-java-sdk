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
import com.aliyuncs.kms.transform.v20160120.GenerateAndExportDataKeyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GenerateAndExportDataKeyResponse extends AcsResponse {

	private String keyVersionId;

	private String keyId;

	private String ciphertextBlob;

	private String requestId;

	private String exportedDataKey;

	public String getKeyVersionId() {
		return this.keyVersionId;
	}

	public void setKeyVersionId(String keyVersionId) {
		this.keyVersionId = keyVersionId;
	}

	public String getKeyId() {
		return this.keyId;
	}

	public void setKeyId(String keyId) {
		this.keyId = keyId;
	}

	public String getCiphertextBlob() {
		return this.ciphertextBlob;
	}

	public void setCiphertextBlob(String ciphertextBlob) {
		this.ciphertextBlob = ciphertextBlob;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getExportedDataKey() {
		return this.exportedDataKey;
	}

	public void setExportedDataKey(String exportedDataKey) {
		this.exportedDataKey = exportedDataKey;
	}

	@Override
	public GenerateAndExportDataKeyResponse getInstance(UnmarshallerContext context) {
		return	GenerateAndExportDataKeyResponseUnmarshaller.unmarshall(this, context);
	}
}
