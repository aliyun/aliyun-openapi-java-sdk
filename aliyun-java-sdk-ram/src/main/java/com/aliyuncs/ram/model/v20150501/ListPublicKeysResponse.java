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
package com.aliyuncs.ram.model.v20150501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ram.transform.v20150501.ListPublicKeysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPublicKeysResponse extends AcsResponse {

	private String requestId;

	private List<PublicKey> publicKeys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PublicKey> getPublicKeys() {
		return this.publicKeys;
	}

	public void setPublicKeys(List<PublicKey> publicKeys) {
		this.publicKeys = publicKeys;
	}

	public static class PublicKey {

		private String publicKeyId;

		private String status;

		private String createDate;

		public String getPublicKeyId() {
			return this.publicKeyId;
		}

		public void setPublicKeyId(String publicKeyId) {
			this.publicKeyId = publicKeyId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}
	}

	@Override
	public ListPublicKeysResponse getInstance(UnmarshallerContext context) {
		return	ListPublicKeysResponseUnmarshaller.unmarshall(this, context);
	}
}
