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

package com.aliyuncs.ims.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ims.transform.v20190815.ListPasskeysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPasskeysResponse extends AcsResponse {

	private String requestId;

	private List<Key> passkeys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Key> getPasskeys() {
		return this.passkeys;
	}

	public void setPasskeys(List<Key> passkeys) {
		this.passkeys = passkeys;
	}

	public static class Key {

		private String passkeyName;

		private String passkeyId;

		private String createDate;

		private String lastUseDate;

		public String getPasskeyName() {
			return this.passkeyName;
		}

		public void setPasskeyName(String passkeyName) {
			this.passkeyName = passkeyName;
		}

		public String getPasskeyId() {
			return this.passkeyId;
		}

		public void setPasskeyId(String passkeyId) {
			this.passkeyId = passkeyId;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getLastUseDate() {
			return this.lastUseDate;
		}

		public void setLastUseDate(String lastUseDate) {
			this.lastUseDate = lastUseDate;
		}
	}

	@Override
	public ListPasskeysResponse getInstance(UnmarshallerContext context) {
		return	ListPasskeysResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
