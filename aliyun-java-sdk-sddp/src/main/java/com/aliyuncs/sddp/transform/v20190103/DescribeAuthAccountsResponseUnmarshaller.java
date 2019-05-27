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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeAuthAccountsResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeAuthAccountsResponse.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAuthAccountsResponseUnmarshaller {

	public static DescribeAuthAccountsResponse unmarshall(DescribeAuthAccountsResponse describeAuthAccountsResponse, UnmarshallerContext context) {
		
		describeAuthAccountsResponse.setRequestId(context.stringValue("DescribeAuthAccountsResponse.RequestId"));
		describeAuthAccountsResponse.setPageSize(context.integerValue("DescribeAuthAccountsResponse.PageSize"));
		describeAuthAccountsResponse.setCurrentPage(context.integerValue("DescribeAuthAccountsResponse.CurrentPage"));
		describeAuthAccountsResponse.setTotalCount(context.integerValue("DescribeAuthAccountsResponse.TotalCount"));

		List<Account> items = new ArrayList<Account>();
		for (int i = 0; i < context.lengthValue("DescribeAuthAccountsResponse.Items.Length"); i++) {
			Account account = new Account();
			account.setId(context.longValue("DescribeAuthAccountsResponse.Items["+ i +"].Id"));
			account.setLoginName(context.stringValue("DescribeAuthAccountsResponse.Items["+ i +"].LoginName"));
			account.setFullName(context.stringValue("DescribeAuthAccountsResponse.Items["+ i +"].FullName"));
			account.setAuthLoginName(context.stringValue("DescribeAuthAccountsResponse.Items["+ i +"].AuthLoginName"));
			account.setAuthFullName(context.stringValue("DescribeAuthAccountsResponse.Items["+ i +"].AuthFullName"));
			account.setAuthTime(context.longValue("DescribeAuthAccountsResponse.Items["+ i +"].AuthTime"));

			items.add(account);
		}
		describeAuthAccountsResponse.setItems(items);
	 
	 	return describeAuthAccountsResponse;
	}
}