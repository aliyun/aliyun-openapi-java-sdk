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

import com.aliyuncs.resourcemanager.model.v20200331.ResendCreateCloudAccountEmailResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ResendCreateCloudAccountEmailResponse.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResendCreateCloudAccountEmailResponseUnmarshaller {

	public static ResendCreateCloudAccountEmailResponse unmarshall(ResendCreateCloudAccountEmailResponse resendCreateCloudAccountEmailResponse, UnmarshallerContext _ctx) {
		
		resendCreateCloudAccountEmailResponse.setRequestId(_ctx.stringValue("ResendCreateCloudAccountEmailResponse.RequestId"));

		Account account = new Account();
		account.setResourceDirectoryId(_ctx.stringValue("ResendCreateCloudAccountEmailResponse.Account.ResourceDirectoryId"));
		account.setAccountId(_ctx.stringValue("ResendCreateCloudAccountEmailResponse.Account.AccountId"));
		account.setDisplayName(_ctx.stringValue("ResendCreateCloudAccountEmailResponse.Account.DisplayName"));
		account.setFolderId(_ctx.stringValue("ResendCreateCloudAccountEmailResponse.Account.FolderId"));
		account.setJoinMethod(_ctx.stringValue("ResendCreateCloudAccountEmailResponse.Account.JoinMethod"));
		account.setJoinTime(_ctx.stringValue("ResendCreateCloudAccountEmailResponse.Account.JoinTime"));
		account.setType(_ctx.stringValue("ResendCreateCloudAccountEmailResponse.Account.Type"));
		account.setStatus(_ctx.stringValue("ResendCreateCloudAccountEmailResponse.Account.Status"));
		account.setRecordId(_ctx.stringValue("ResendCreateCloudAccountEmailResponse.Account.RecordId"));
		account.setModifyTime(_ctx.stringValue("ResendCreateCloudAccountEmailResponse.Account.ModifyTime"));
		account.setAccountName(_ctx.stringValue("ResendCreateCloudAccountEmailResponse.Account.AccountName"));
		resendCreateCloudAccountEmailResponse.setAccount(account);
	 
	 	return resendCreateCloudAccountEmailResponse;
	}
}