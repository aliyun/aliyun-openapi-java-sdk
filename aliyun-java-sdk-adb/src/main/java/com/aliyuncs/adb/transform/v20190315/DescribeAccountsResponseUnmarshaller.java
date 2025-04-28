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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeAccountsResponse;
import com.aliyuncs.adb.model.v20190315.DescribeAccountsResponse.DBAccount;
import com.aliyuncs.adb.model.v20190315.DescribeAccountsResponse.DBAccount.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountsResponseUnmarshaller {

	public static DescribeAccountsResponse unmarshall(DescribeAccountsResponse describeAccountsResponse, UnmarshallerContext _ctx) {
		
		describeAccountsResponse.setRequestId(_ctx.stringValue("DescribeAccountsResponse.RequestId"));

		List<DBAccount> accountList = new ArrayList<DBAccount>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccountsResponse.AccountList.Length"); i++) {
			DBAccount dBAccount = new DBAccount();
			dBAccount.setAccountStatus(_ctx.stringValue("DescribeAccountsResponse.AccountList["+ i +"].AccountStatus"));
			dBAccount.setAccountDescription(_ctx.stringValue("DescribeAccountsResponse.AccountList["+ i +"].AccountDescription"));
			dBAccount.setAccountType(_ctx.stringValue("DescribeAccountsResponse.AccountList["+ i +"].AccountType"));
			dBAccount.setAccountName(_ctx.stringValue("DescribeAccountsResponse.AccountList["+ i +"].AccountName"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAccountsResponse.AccountList["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeAccountsResponse.AccountList["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeAccountsResponse.AccountList["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			dBAccount.setTags(tags);

			accountList.add(dBAccount);
		}
		describeAccountsResponse.setAccountList(accountList);
	 
	 	return describeAccountsResponse;
	}
}