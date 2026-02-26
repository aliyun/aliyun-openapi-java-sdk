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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.kms.transform.v20160120.ListClientKeysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClientKeysResponse extends AcsResponse {

	private String requestId;

	private List<ClientKey> clientKeys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ClientKey> getClientKeys() {
		return this.clientKeys;
	}

	public void setClientKeys(List<ClientKey> clientKeys) {
		this.clientKeys = clientKeys;
	}

	public static class ClientKey {

		private String clientKeyId;

		private String createTime;

		private String publicKeyData;

		private String keyAlgorithm;

		private String notBefore;

		private String notAfter;

		private String keyOrigin;

		private String aapName;

		public String getClientKeyId() {
			return this.clientKeyId;
		}

		public void setClientKeyId(String clientKeyId) {
			this.clientKeyId = clientKeyId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getPublicKeyData() {
			return this.publicKeyData;
		}

		public void setPublicKeyData(String publicKeyData) {
			this.publicKeyData = publicKeyData;
		}

		public String getKeyAlgorithm() {
			return this.keyAlgorithm;
		}

		public void setKeyAlgorithm(String keyAlgorithm) {
			this.keyAlgorithm = keyAlgorithm;
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

		public String getKeyOrigin() {
			return this.keyOrigin;
		}

		public void setKeyOrigin(String keyOrigin) {
			this.keyOrigin = keyOrigin;
		}

		public String getAapName() {
			return this.aapName;
		}

		public void setAapName(String aapName) {
			this.aapName = aapName;
		}
	}

	@Override
	public ListClientKeysResponse getInstance(UnmarshallerContext context) {
		return	ListClientKeysResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
