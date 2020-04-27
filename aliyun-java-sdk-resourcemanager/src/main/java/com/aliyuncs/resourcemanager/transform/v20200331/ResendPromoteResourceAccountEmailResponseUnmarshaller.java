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

import com.aliyuncs.resourcemanager.model.v20200331.ResendPromoteResourceAccountEmailResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ResendPromoteResourceAccountEmailResponse.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResendPromoteResourceAccountEmailResponseUnmarshaller {

	public static ResendPromoteResourceAccountEmailResponse unmarshall(ResendPromoteResourceAccountEmailResponse resendPromoteResourceAccountEmailResponse, UnmarshallerContext _ctx) {
		
		resendPromoteResourceAccountEmailResponse.setRequestId(_ctx.stringValue("ResendPromoteResourceAccountEmailResponse.RequestId"));

		Account account = new Account();
		account.setResourceDirectoryId(_ctx.stringValue("ResendPromoteResourceAccountEmailResponse.Account.ResourceDirectoryId"));
		account.setAccountId(_ctx.stringValue("ResendPromoteResourceAccountEmailResponse.Account.AccountId"));
		account.setDisplayName(_ctx.stringValue("ResendPromoteResourceAccountEmailResponse.Account.DisplayName"));
		account.setFolderId(_ctx.stringValue("ResendPromoteResourceAccountEmailResponse.Account.FolderId"));
		account.setJoinMethod(_ctx.stringValue("ResendPromoteResourceAccountEmailResponse.Account.JoinMethod"));
		account.setJoinTime(_ctx.stringValue("ResendPromoteResourceAccountEmailResponse.Account.JoinTime"));
		account.setType(_ctx.stringValue("ResendPromoteResourceAccountEmailResponse.Account.Type"));
		account.setStatus(_ctx.stringValue("ResendPromoteResourceAccountEmailResponse.Account.Status"));
		account.setRecordId(_ctx.stringValue("ResendPromoteResourceAccountEmailResponse.Account.RecordId"));
		account.setModifyTime(_ctx.stringValue("ResendPromoteResourceAccountEmailResponse.Account.ModifyTime"));
		account.setAccountName(_ctx.stringValue("ResendPromoteResourceAccountEmailResponse.Account.AccountName"));
		resendPromoteResourceAccountEmailResponse.setAccount(account);
	 
	 	return resendPromoteResourceAccountEmailResponse;
	}
}