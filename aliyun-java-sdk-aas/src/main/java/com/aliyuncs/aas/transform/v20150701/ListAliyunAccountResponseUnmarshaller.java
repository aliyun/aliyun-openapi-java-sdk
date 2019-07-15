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

package com.aliyuncs.aas.transform.v20150701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aas.model.v20150701.ListAliyunAccountResponse;
import com.aliyuncs.aas.model.v20150701.ListAliyunAccountResponse.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAliyunAccountResponseUnmarshaller {

	public static ListAliyunAccountResponse unmarshall(ListAliyunAccountResponse listAliyunAccountResponse, UnmarshallerContext _ctx) {
		
		listAliyunAccountResponse.setRequestId(_ctx.stringValue("ListAliyunAccountResponse.RequestId"));
		listAliyunAccountResponse.setIsTruncated(_ctx.booleanValue("ListAliyunAccountResponse.IsTruncated"));
		listAliyunAccountResponse.setMarker(_ctx.stringValue("ListAliyunAccountResponse.Marker"));
		listAliyunAccountResponse.setTotalAccount(_ctx.integerValue("ListAliyunAccountResponse.TotalAccount"));
		listAliyunAccountResponse.setHasNext(_ctx.booleanValue("ListAliyunAccountResponse.HasNext"));

		List<Account> accounts = new ArrayList<Account>();
		for (int i = 0; i < _ctx.lengthValue("ListAliyunAccountResponse.Accounts.Length"); i++) {
			Account account = new Account();
			account.setPK(_ctx.stringValue("ListAliyunAccountResponse.Accounts["+ i +"].PK"));
			account.setLastLoginDate(_ctx.stringValue("ListAliyunAccountResponse.Accounts["+ i +"].LastLoginDate"));
			account.setAccountStatus(_ctx.stringValue("ListAliyunAccountResponse.Accounts["+ i +"].AccountStatus"));
			account.setAliyunId(_ctx.stringValue("ListAliyunAccountResponse.Accounts["+ i +"].AliyunId"));

			accounts.add(account);
		}
		listAliyunAccountResponse.setAccounts(accounts);
	 
	 	return listAliyunAccountResponse;
	}
}