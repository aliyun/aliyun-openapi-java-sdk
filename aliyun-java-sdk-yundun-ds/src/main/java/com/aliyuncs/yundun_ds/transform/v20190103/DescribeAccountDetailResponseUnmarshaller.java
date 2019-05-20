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

import com.aliyuncs.yundun_ds.model.v20190103.DescribeAccountDetailResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeAccountDetailResponse.Account;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeAccountDetailResponse.Account.EventCount;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeAccountDetailResponse.Account.EventCount.Total;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeAccountDetailResponse.Account.Privilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountDetailResponseUnmarshaller {

	public static DescribeAccountDetailResponse unmarshall(DescribeAccountDetailResponse describeAccountDetailResponse, UnmarshallerContext context) {
		
		describeAccountDetailResponse.setRequestId(context.stringValue("DescribeAccountDetailResponse.RequestId"));

		Account account = new Account();
		account.setId(context.longValue("DescribeAccountDetailResponse.Account.Id"));
		account.setUserId(context.longValue("DescribeAccountDetailResponse.Account.UserId"));
		account.setFirstLevelDepartId(context.longValue("DescribeAccountDetailResponse.Account.FirstLevelDepartId"));
		account.setLoginName(context.stringValue("DescribeAccountDetailResponse.Account.LoginName"));
		account.setFullName(context.stringValue("DescribeAccountDetailResponse.Account.FullName"));
		account.setCellphoneNum(context.stringValue("DescribeAccountDetailResponse.Account.CellphoneNum"));
		account.setTelephoneNum(context.stringValue("DescribeAccountDetailResponse.Account.TelephoneNum"));
		account.setEmail(context.stringValue("DescribeAccountDetailResponse.Account.Email"));
		account.setActiveStatus(context.stringValue("DescribeAccountDetailResponse.Account.ActiveStatus"));
		account.setDeleteStatus(context.stringValue("DescribeAccountDetailResponse.Account.DeleteStatus"));
		account.setDataInstance(context.stringValue("DescribeAccountDetailResponse.Account.DataInstance"));
		account.setCreateTime(context.longValue("DescribeAccountDetailResponse.Account.CreateTime"));
		account.setLoginDataTime(context.longValue("DescribeAccountDetailResponse.Account.LoginDataTime"));
		account.setLoginPolicyName(context.stringValue("DescribeAccountDetailResponse.Account.LoginPolicyName"));
		account.setFirstLevelDepartName(context.stringValue("DescribeAccountDetailResponse.Account.FirstLevelDepartName"));
		account.setRoleNames(context.stringValue("DescribeAccountDetailResponse.Account.RoleNames"));
		account.setAliUid(context.longValue("DescribeAccountDetailResponse.Account.AliUid"));

		EventCount eventCount = new EventCount();

		Total total = new Total();
		total.setTotalCount(context.longValue("DescribeAccountDetailResponse.Account.EventCount.Total.TotalCount"));
		total.setUndealCount(context.longValue("DescribeAccountDetailResponse.Account.EventCount.Total.UndealCount"));
		total.setConfirmCount(context.longValue("DescribeAccountDetailResponse.Account.EventCount.Total.ConfirmCount"));
		total.setExcludeCount(context.longValue("DescribeAccountDetailResponse.Account.EventCount.Total.ExcludeCount"));
		eventCount.setTotal(total);
		account.setEventCount(eventCount);

		List<Privilege> privilegeList = new ArrayList<Privilege>();
		for (int i = 0; i < context.lengthValue("DescribeAccountDetailResponse.Account.PrivilegeList.Length"); i++) {
			Privilege privilege = new Privilege();
			privilege.setProductName(context.stringValue("DescribeAccountDetailResponse.Account.PrivilegeList["+ i +"].ProductName"));
			privilege.setUseAccountId(context.stringValue("DescribeAccountDetailResponse.Account.PrivilegeList["+ i +"].UseAccountId"));
			privilege.setUseAccountType(context.integerValue("DescribeAccountDetailResponse.Account.PrivilegeList["+ i +"].UseAccountType"));
			privilege.setUseAccountTypeName(context.stringValue("DescribeAccountDetailResponse.Account.PrivilegeList["+ i +"].UseAccountTypeName"));
			privilege.setUseAccountCreateTime(context.longValue("DescribeAccountDetailResponse.Account.PrivilegeList["+ i +"].UseAccountCreateTime"));
			privilege.setUseAccountName(context.stringValue("DescribeAccountDetailResponse.Account.PrivilegeList["+ i +"].UseAccountName"));

			privilegeList.add(privilege);
		}
		account.setPrivilegeList(privilegeList);
		describeAccountDetailResponse.setAccount(account);
	 
	 	return describeAccountDetailResponse;
	}
}