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

package com.aliyuncs.cloudphone.model.v20201230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudphone.transform.v20201230.ListImageSharePermissionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListImageSharePermissionResponse extends AcsResponse {

	private String requestId;

	private List<Account> accounts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public static class Account {

		private String aliyunId;

		public String getAliyunId() {
			return this.aliyunId;
		}

		public void setAliyunId(String aliyunId) {
			this.aliyunId = aliyunId;
		}
	}

	@Override
	public ListImageSharePermissionResponse getInstance(UnmarshallerContext context) {
		return	ListImageSharePermissionResponseUnmarshaller.unmarshall(this, context);
	}
}
