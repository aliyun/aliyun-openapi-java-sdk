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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcemanager.model.v20200331.GetAccountResponse;
import com.aliyuncs.resourcemanager.model.v20200331.GetAccountResponse.Account;
import com.aliyuncs.resourcemanager.model.v20200331.GetAccountResponse.Account.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccountResponseUnmarshaller {

	public static GetAccountResponse unmarshall(GetAccountResponse getAccountResponse, UnmarshallerContext _ctx) {
		
		getAccountResponse.setRequestId(_ctx.stringValue("GetAccountResponse.RequestId"));

		Account account = new Account();
		account.setStatus(_ctx.stringValue("GetAccountResponse.Account.Status"));
		account.setType(_ctx.stringValue("GetAccountResponse.Account.Type"));
		account.setDisplayName(_ctx.stringValue("GetAccountResponse.Account.DisplayName"));
		account.setFolderId(_ctx.stringValue("GetAccountResponse.Account.FolderId"));
		account.setResourceDirectoryId(_ctx.stringValue("GetAccountResponse.Account.ResourceDirectoryId"));
		account.setIdentityInformation(_ctx.stringValue("GetAccountResponse.Account.IdentityInformation"));
		account.setJoinTime(_ctx.stringValue("GetAccountResponse.Account.JoinTime"));
		account.setAccountId(_ctx.stringValue("GetAccountResponse.Account.AccountId"));
		account.setJoinMethod(_ctx.stringValue("GetAccountResponse.Account.JoinMethod"));
		account.setModifyTime(_ctx.stringValue("GetAccountResponse.Account.ModifyTime"));
		account.setAccountName(_ctx.stringValue("GetAccountResponse.Account.AccountName"));
		account.setResourceDirectoryPath(_ctx.stringValue("GetAccountResponse.Account.ResourceDirectoryPath"));
		account.setLocation(_ctx.stringValue("GetAccountResponse.Account.Location"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetAccountResponse.Account.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("GetAccountResponse.Account.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("GetAccountResponse.Account.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		account.setTags(tags);
		getAccountResponse.setAccount(account);
	 
	 	return getAccountResponse;
	}
}