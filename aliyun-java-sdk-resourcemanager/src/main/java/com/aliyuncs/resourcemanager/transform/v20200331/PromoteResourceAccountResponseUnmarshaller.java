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

package com.aliyuncs.resourcemanager.transform.v20200331;

import com.aliyuncs.resourcemanager.model.v20200331.PromoteResourceAccountResponse;
import com.aliyuncs.resourcemanager.model.v20200331.PromoteResourceAccountResponse.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class PromoteResourceAccountResponseUnmarshaller {

	public static PromoteResourceAccountResponse unmarshall(PromoteResourceAccountResponse promoteResourceAccountResponse, UnmarshallerContext _ctx) {
		
		promoteResourceAccountResponse.setRequestId(_ctx.stringValue("PromoteResourceAccountResponse.RequestId"));

		Account account = new Account();
		account.setResourceDirectoryId(_ctx.stringValue("PromoteResourceAccountResponse.Account.ResourceDirectoryId"));
		account.setAccountId(_ctx.stringValue("PromoteResourceAccountResponse.Account.AccountId"));
		account.setDisplayName(_ctx.stringValue("PromoteResourceAccountResponse.Account.DisplayName"));
		account.setFolderId(_ctx.stringValue("PromoteResourceAccountResponse.Account.FolderId"));
		account.setJoinMethod(_ctx.stringValue("PromoteResourceAccountResponse.Account.JoinMethod"));
		account.setJoinTime(_ctx.stringValue("PromoteResourceAccountResponse.Account.JoinTime"));
		account.setType(_ctx.stringValue("PromoteResourceAccountResponse.Account.Type"));
		account.setStatus(_ctx.stringValue("PromoteResourceAccountResponse.Account.Status"));
		account.setRecordId(_ctx.stringValue("PromoteResourceAccountResponse.Account.RecordId"));
		account.setModifyTime(_ctx.stringValue("PromoteResourceAccountResponse.Account.ModifyTime"));
		account.setAccountName(_ctx.stringValue("PromoteResourceAccountResponse.Account.AccountName"));
		promoteResourceAccountResponse.setAccount(account);
	 
	 	return promoteResourceAccountResponse;
	}
}