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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeKmsKeysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeKmsKeysResponse extends AcsResponse {

	private String requestId;

	private List<KmsKey> kmsKeys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<KmsKey> getKmsKeys() {
		return this.kmsKeys;
	}

	public void setKmsKeys(List<KmsKey> kmsKeys) {
		this.kmsKeys = kmsKeys;
	}

	public static class KmsKey {

		private String keyAlias;

		private String keyId;

		public String getKeyAlias() {
			return this.keyAlias;
		}

		public void setKeyAlias(String keyAlias) {
			this.keyAlias = keyAlias;
		}

		public String getKeyId() {
			return this.keyId;
		}

		public void setKeyId(String keyId) {
			this.keyId = keyId;
		}
	}

	@Override
	public DescribeKmsKeysResponse getInstance(UnmarshallerContext context) {
		return	DescribeKmsKeysResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
