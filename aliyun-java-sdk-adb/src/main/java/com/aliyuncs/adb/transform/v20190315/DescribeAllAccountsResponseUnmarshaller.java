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

import com.aliyuncs.adb.model.v20190315.DescribeAllAccountsResponse;
import com.aliyuncs.adb.model.v20190315.DescribeAllAccountsResponse.AccountInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAllAccountsResponseUnmarshaller {

	public static DescribeAllAccountsResponse unmarshall(DescribeAllAccountsResponse describeAllAccountsResponse, UnmarshallerContext _ctx) {
		
		describeAllAccountsResponse.setRequestId(_ctx.stringValue("DescribeAllAccountsResponse.RequestId"));

		List<AccountInfo> accountList = new ArrayList<AccountInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAllAccountsResponse.AccountList.Length"); i++) {
			AccountInfo accountInfo = new AccountInfo();
			accountInfo.setUser(_ctx.stringValue("DescribeAllAccountsResponse.AccountList["+ i +"].User"));

			accountList.add(accountInfo);
		}
		describeAllAccountsResponse.setAccountList(accountList);
	 
	 	return describeAllAccountsResponse;
	}
}