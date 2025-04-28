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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetAccountByRowPermissionIdResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetAccountByRowPermissionIdResponse.DataItem;
import com.aliyuncs.dataphin_public.model.v20230630.GetAccountByRowPermissionIdResponse.DataItem.UserMappingListItem;
import com.aliyuncs.dataphin_public.model.v20230630.GetAccountByRowPermissionIdResponse.DataItem.UserMappingListItem.AccountsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccountByRowPermissionIdResponseUnmarshaller {

	public static GetAccountByRowPermissionIdResponse unmarshall(GetAccountByRowPermissionIdResponse getAccountByRowPermissionIdResponse, UnmarshallerContext _ctx) {
		
		getAccountByRowPermissionIdResponse.setRequestId(_ctx.stringValue("GetAccountByRowPermissionIdResponse.RequestId"));
		getAccountByRowPermissionIdResponse.setSuccess(_ctx.booleanValue("GetAccountByRowPermissionIdResponse.Success"));
		getAccountByRowPermissionIdResponse.setHttpStatusCode(_ctx.integerValue("GetAccountByRowPermissionIdResponse.HttpStatusCode"));
		getAccountByRowPermissionIdResponse.setCode(_ctx.stringValue("GetAccountByRowPermissionIdResponse.Code"));
		getAccountByRowPermissionIdResponse.setMessage(_ctx.stringValue("GetAccountByRowPermissionIdResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAccountByRowPermissionIdResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("GetAccountByRowPermissionIdResponse.Data["+ i +"].Id"));

			List<UserMappingListItem> userMappingList = new ArrayList<UserMappingListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAccountByRowPermissionIdResponse.Data["+ i +"].UserMappingList.Length"); j++) {
				UserMappingListItem userMappingListItem = new UserMappingListItem();
				userMappingListItem.setAccountType(_ctx.stringValue("GetAccountByRowPermissionIdResponse.Data["+ i +"].UserMappingList["+ j +"].AccountType"));

				List<AccountsItem> accounts = new ArrayList<AccountsItem>();
				for (int k = 0; k < _ctx.lengthValue("GetAccountByRowPermissionIdResponse.Data["+ i +"].UserMappingList["+ j +"].Accounts.Length"); k++) {
					AccountsItem accountsItem = new AccountsItem();
					accountsItem.setAccountId(_ctx.stringValue("GetAccountByRowPermissionIdResponse.Data["+ i +"].UserMappingList["+ j +"].Accounts["+ k +"].AccountId"));
					accountsItem.setAccountName(_ctx.stringValue("GetAccountByRowPermissionIdResponse.Data["+ i +"].UserMappingList["+ j +"].Accounts["+ k +"].AccountName"));

					accounts.add(accountsItem);
				}
				userMappingListItem.setAccounts(accounts);

				userMappingList.add(userMappingListItem);
			}
			dataItem.setUserMappingList(userMappingList);

			data.add(dataItem);
		}
		getAccountByRowPermissionIdResponse.setData(data);
	 
	 	return getAccountByRowPermissionIdResponse;
	}
}