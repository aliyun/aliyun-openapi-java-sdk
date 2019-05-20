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

package com.aliyuncs.yundun_ds.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeAccountsResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeAccountsResponse.Account;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeAccountsResponse.Account.EventCount;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeAccountsResponse.Account.EventCount.Total;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountsResponseUnmarshaller {

	public static DescribeAccountsResponse unmarshall(DescribeAccountsResponse describeAccountsResponse, UnmarshallerContext context) {
		
		describeAccountsResponse.setRequestId(context.stringValue("DescribeAccountsResponse.RequestId"));
		describeAccountsResponse.setPageSize(context.integerValue("DescribeAccountsResponse.PageSize"));
		describeAccountsResponse.setCurrentPage(context.integerValue("DescribeAccountsResponse.CurrentPage"));
		describeAccountsResponse.setTotalCount(context.integerValue("DescribeAccountsResponse.TotalCount"));

		List<Account> items = new ArrayList<Account>();
		for (int i = 0; i < context.lengthValue("DescribeAccountsResponse.Items.Length"); i++) {
			Account account = new Account();
			account.setId(context.longValue("DescribeAccountsResponse.Items["+ i +"].Id"));
			account.setUserId(context.longValue("DescribeAccountsResponse.Items["+ i +"].UserId"));
			account.setFirstLevelDepartId(context.longValue("DescribeAccountsResponse.Items["+ i +"].FirstLevelDepartId"));
			account.setLoginName(context.stringValue("DescribeAccountsResponse.Items["+ i +"].LoginName"));
			account.setFullName(context.stringValue("DescribeAccountsResponse.Items["+ i +"].FullName"));
			account.setCellphoneNum(context.stringValue("DescribeAccountsResponse.Items["+ i +"].CellphoneNum"));
			account.setTelephoneNum(context.stringValue("DescribeAccountsResponse.Items["+ i +"].TelephoneNum"));
			account.setEmail(context.stringValue("DescribeAccountsResponse.Items["+ i +"].Email"));
			account.setActiveStatus(context.stringValue("DescribeAccountsResponse.Items["+ i +"].ActiveStatus"));
			account.setDeleteStatus(context.stringValue("DescribeAccountsResponse.Items["+ i +"].DeleteStatus"));
			account.setDataInstance(context.stringValue("DescribeAccountsResponse.Items["+ i +"].DataInstance"));
			account.setCreateTime(context.longValue("DescribeAccountsResponse.Items["+ i +"].CreateTime"));
			account.setLoginDataTime(context.longValue("DescribeAccountsResponse.Items["+ i +"].LoginDataTime"));
			account.setLoginPolicyName(context.stringValue("DescribeAccountsResponse.Items["+ i +"].LoginPolicyName"));
			account.setFirstLevelDepartName(context.stringValue("DescribeAccountsResponse.Items["+ i +"].FirstLevelDepartName"));
			account.setRoleNames(context.stringValue("DescribeAccountsResponse.Items["+ i +"].RoleNames"));
			account.setInstanceName(context.stringValue("DescribeAccountsResponse.Items["+ i +"].InstanceName"));
			account.setAliUid(context.longValue("DescribeAccountsResponse.Items["+ i +"].AliUid"));
			account.setAccountTypeId(context.longValue("DescribeAccountsResponse.Items["+ i +"].AccountTypeId"));

			EventCount eventCount = new EventCount();

			Total total = new Total();
			total.setTotalCount(context.longValue("DescribeAccountsResponse.Items["+ i +"].EventCount.Total.TotalCount"));
			total.setUndealCount(context.longValue("DescribeAccountsResponse.Items["+ i +"].EventCount.Total.UndealCount"));
			total.setConfirmCount(context.longValue("DescribeAccountsResponse.Items["+ i +"].EventCount.Total.ConfirmCount"));
			total.setExcludeCount(context.longValue("DescribeAccountsResponse.Items["+ i +"].EventCount.Total.ExcludeCount"));
			eventCount.setTotal(total);
			account.setEventCount(eventCount);

			items.add(account);
		}
		describeAccountsResponse.setItems(items);
	 
	 	return describeAccountsResponse;
	}
}