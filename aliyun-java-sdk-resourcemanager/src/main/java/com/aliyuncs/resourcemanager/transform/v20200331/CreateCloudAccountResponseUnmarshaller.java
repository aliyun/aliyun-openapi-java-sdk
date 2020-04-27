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

import com.aliyuncs.resourcemanager.model.v20200331.CreateCloudAccountResponse;
import com.aliyuncs.resourcemanager.model.v20200331.CreateCloudAccountResponse.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCloudAccountResponseUnmarshaller {

	public static CreateCloudAccountResponse unmarshall(CreateCloudAccountResponse createCloudAccountResponse, UnmarshallerContext _ctx) {
		
		createCloudAccountResponse.setRequestId(_ctx.stringValue("CreateCloudAccountResponse.RequestId"));

		Account account = new Account();
		account.setResourceDirectoryId(_ctx.stringValue("CreateCloudAccountResponse.Account.ResourceDirectoryId"));
		account.setAccountId(_ctx.stringValue("CreateCloudAccountResponse.Account.AccountId"));
		account.setDisplayName(_ctx.stringValue("CreateCloudAccountResponse.Account.DisplayName"));
		account.setAccountName(_ctx.stringValue("CreateCloudAccountResponse.Account.AccountName"));
		account.setFolderId(_ctx.stringValue("CreateCloudAccountResponse.Account.FolderId"));
		account.setJoinMethod(_ctx.stringValue("CreateCloudAccountResponse.Account.JoinMethod"));
		account.setModifyTime(_ctx.stringValue("CreateCloudAccountResponse.Account.ModifyTime"));
		account.setType(_ctx.stringValue("CreateCloudAccountResponse.Account.Type"));
		account.setStatus(_ctx.stringValue("CreateCloudAccountResponse.Account.Status"));
		account.setRecordId(_ctx.stringValue("CreateCloudAccountResponse.Account.RecordId"));
		createCloudAccountResponse.setAccount(account);
	 
	 	return createCloudAccountResponse;
	}
}