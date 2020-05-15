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

import com.aliyuncs.sddp.model.v20190103.DescribeAccountsResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeAccountsResponse.Account;
import com.aliyuncs.sddp.model.v20190103.DescribeAccountsResponse.Account.EventCount;
import com.aliyuncs.sddp.model.v20190103.DescribeAccountsResponse.Account.EventCount.Total;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountsResponseUnmarshaller {

	public static DescribeAccountsResponse unmarshall(DescribeAccountsResponse describeAccountsResponse, UnmarshallerContext _ctx) {
		
		describeAccountsResponse.setRequestId(_ctx.stringValue("DescribeAccountsResponse.RequestId"));
		describeAccountsResponse.setPageSize(_ctx.integerValue("DescribeAccountsResponse.PageSize"));
		describeAccountsResponse.setCurrentPage(_ctx.integerValue("DescribeAccountsResponse.CurrentPage"));
		describeAccountsResponse.setTotalCount(_ctx.integerValue("DescribeAccountsResponse.TotalCount"));

		List<Account> items = new ArrayList<Account>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccountsResponse.Items.Length"); i++) {
			Account account = new Account();
			account.setId(_ctx.longValue("DescribeAccountsResponse.Items["+ i +"].Id"));
			account.setUserId(_ctx.longValue("DescribeAccountsResponse.Items["+ i +"].UserId"));
			account.setFirstLevelDepartId(_ctx.longValue("DescribeAccountsResponse.Items["+ i +"].FirstLevelDepartId"));
			account.setLoginName(_ctx.stringValue("DescribeAccountsResponse.Items["+ i +"].LoginName"));
			account.setFullName(_ctx.stringValue("DescribeAccountsResponse.Items["+ i +"].FullName"));
			account.setCellphoneNum(_ctx.stringValue("DescribeAccountsResponse.Items["+ i +"].CellphoneNum"));
			account.setTelephoneNum(_ctx.stringValue("DescribeAccountsResponse.Items["+ i +"].TelephoneNum"));
			account.setEmail(_ctx.stringValue("DescribeAccountsResponse.Items["+ i +"].Email"));
			account.setActiveStatus(_ctx.stringValue("DescribeAccountsResponse.Items["+ i +"].ActiveStatus"));
			account.setDeleteStatus(_ctx.stringValue("DescribeAccountsResponse.Items["+ i +"].DeleteStatus"));
			account.setDataInstance(_ctx.stringValue("DescribeAccountsResponse.Items["+ i +"].DataInstance"));
			account.setCreateTime(_ctx.longValue("DescribeAccountsResponse.Items["+ i +"].CreateTime"));
			account.setLoginDataTime(_ctx.longValue("DescribeAccountsResponse.Items["+ i +"].LoginDataTime"));
			account.setLoginPolicyName(_ctx.stringValue("DescribeAccountsResponse.Items["+ i +"].LoginPolicyName"));
			account.setFirstLevelDepartName(_ctx.stringValue("DescribeAccountsResponse.Items["+ i +"].FirstLevelDepartName"));
			account.setRoleNames(_ctx.stringValue("DescribeAccountsResponse.Items["+ i +"].RoleNames"));
			account.setInstanceName(_ctx.stringValue("DescribeAccountsResponse.Items["+ i +"].InstanceName"));
			account.setAliUid(_ctx.longValue("DescribeAccountsResponse.Items["+ i +"].AliUid"));
			account.setAccountTypeId(_ctx.longValue("DescribeAccountsResponse.Items["+ i +"].AccountTypeId"));

			EventCount eventCount = new EventCount();

			Total total = new Total();
			total.setTotalCount(_ctx.longValue("DescribeAccountsResponse.Items["+ i +"].EventCount.Total.TotalCount"));
			total.setUndealCount(_ctx.longValue("DescribeAccountsResponse.Items["+ i +"].EventCount.Total.UndealCount"));
			total.setConfirmCount(_ctx.longValue("DescribeAccountsResponse.Items["+ i +"].EventCount.Total.ConfirmCount"));
			total.setExcludeCount(_ctx.longValue("DescribeAccountsResponse.Items["+ i +"].EventCount.Total.ExcludeCount"));
			eventCount.setTotal(total);
			account.setEventCount(eventCount);

			items.add(account);
		}
		describeAccountsResponse.setItems(items);
	 
	 	return describeAccountsResponse;
	}
}