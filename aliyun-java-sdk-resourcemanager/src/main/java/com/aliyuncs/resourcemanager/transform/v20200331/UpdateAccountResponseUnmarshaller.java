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

import com.aliyuncs.resourcemanager.model.v20200331.UpdateAccountResponse;
import com.aliyuncs.resourcemanager.model.v20200331.UpdateAccountResponse.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAccountResponseUnmarshaller {

	public static UpdateAccountResponse unmarshall(UpdateAccountResponse updateAccountResponse, UnmarshallerContext _ctx) {
		
		updateAccountResponse.setRequestId(_ctx.stringValue("UpdateAccountResponse.RequestId"));

		Account account = new Account();
		account.setResourceDirectoryId(_ctx.stringValue("UpdateAccountResponse.Account.ResourceDirectoryId"));
		account.setAccountId(_ctx.stringValue("UpdateAccountResponse.Account.AccountId"));
		account.setDisplayName(_ctx.stringValue("UpdateAccountResponse.Account.DisplayName"));
		account.setAccountName(_ctx.stringValue("UpdateAccountResponse.Account.AccountName"));
		account.setFolderId(_ctx.stringValue("UpdateAccountResponse.Account.FolderId"));
		account.setJoinMethod(_ctx.stringValue("UpdateAccountResponse.Account.JoinMethod"));
		account.setJoinTime(_ctx.stringValue("UpdateAccountResponse.Account.JoinTime"));
		account.setModifyTime(_ctx.stringValue("UpdateAccountResponse.Account.ModifyTime"));
		account.setType(_ctx.stringValue("UpdateAccountResponse.Account.Type"));
		account.setStatus(_ctx.stringValue("UpdateAccountResponse.Account.Status"));
		updateAccountResponse.setAccount(account);
	 
	 	return updateAccountResponse;
	}
}