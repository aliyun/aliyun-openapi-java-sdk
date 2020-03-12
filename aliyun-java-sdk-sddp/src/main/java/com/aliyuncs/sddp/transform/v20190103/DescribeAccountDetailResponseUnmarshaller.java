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

import com.aliyuncs.sddp.model.v20190103.DescribeAccountDetailResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeAccountDetailResponse.Account;
import com.aliyuncs.sddp.model.v20190103.DescribeAccountDetailResponse.Account.EventCount;
import com.aliyuncs.sddp.model.v20190103.DescribeAccountDetailResponse.Account.EventCount.Total;
import com.aliyuncs.sddp.model.v20190103.DescribeAccountDetailResponse.Account.Privilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountDetailResponseUnmarshaller {

	public static DescribeAccountDetailResponse unmarshall(DescribeAccountDetailResponse describeAccountDetailResponse, UnmarshallerContext _ctx) {
		
		describeAccountDetailResponse.setRequestId(_ctx.stringValue("DescribeAccountDetailResponse.RequestId"));

		Account account = new Account();
		account.setId(_ctx.longValue("DescribeAccountDetailResponse.Account.Id"));
		account.setUserId(_ctx.longValue("DescribeAccountDetailResponse.Account.UserId"));
		account.setFirstLevelDepartId(_ctx.longValue("DescribeAccountDetailResponse.Account.FirstLevelDepartId"));
		account.setLoginName(_ctx.stringValue("DescribeAccountDetailResponse.Account.LoginName"));
		account.setFullName(_ctx.stringValue("DescribeAccountDetailResponse.Account.FullName"));
		account.setCellphoneNum(_ctx.stringValue("DescribeAccountDetailResponse.Account.CellphoneNum"));
		account.setTelephoneNum(_ctx.stringValue("DescribeAccountDetailResponse.Account.TelephoneNum"));
		account.setEmail(_ctx.stringValue("DescribeAccountDetailResponse.Account.Email"));
		account.setActiveStatus(_ctx.stringValue("DescribeAccountDetailResponse.Account.ActiveStatus"));
		account.setDeleteStatus(_ctx.stringValue("DescribeAccountDetailResponse.Account.DeleteStatus"));
		account.setDataInstance(_ctx.stringValue("DescribeAccountDetailResponse.Account.DataInstance"));
		account.setCreateTime(_ctx.longValue("DescribeAccountDetailResponse.Account.CreateTime"));
		account.setLoginDataTime(_ctx.longValue("DescribeAccountDetailResponse.Account.LoginDataTime"));
		account.setLoginPolicyName(_ctx.stringValue("DescribeAccountDetailResponse.Account.LoginPolicyName"));
		account.setFirstLevelDepartName(_ctx.stringValue("DescribeAccountDetailResponse.Account.FirstLevelDepartName"));
		account.setRoleNames(_ctx.stringValue("DescribeAccountDetailResponse.Account.RoleNames"));
		account.setAliUid(_ctx.longValue("DescribeAccountDetailResponse.Account.AliUid"));

		EventCount eventCount = new EventCount();

		Total total = new Total();
		total.setTotalCount(_ctx.longValue("DescribeAccountDetailResponse.Account.EventCount.Total.TotalCount"));
		total.setUndealCount(_ctx.longValue("DescribeAccountDetailResponse.Account.EventCount.Total.UndealCount"));
		total.setConfirmCount(_ctx.longValue("DescribeAccountDetailResponse.Account.EventCount.Total.ConfirmCount"));
		total.setExcludeCount(_ctx.longValue("DescribeAccountDetailResponse.Account.EventCount.Total.ExcludeCount"));
		eventCount.setTotal(total);
		account.setEventCount(eventCount);

		List<Privilege> privilegeList = new ArrayList<Privilege>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccountDetailResponse.Account.PrivilegeList.Length"); i++) {
			Privilege privilege = new Privilege();
			privilege.setProductName(_ctx.stringValue("DescribeAccountDetailResponse.Account.PrivilegeList["+ i +"].ProductName"));
			privilege.setUseAccountId(_ctx.stringValue("DescribeAccountDetailResponse.Account.PrivilegeList["+ i +"].UseAccountId"));
			privilege.setUseAccountType(_ctx.integerValue("DescribeAccountDetailResponse.Account.PrivilegeList["+ i +"].UseAccountType"));
			privilege.setUseAccountTypeName(_ctx.stringValue("DescribeAccountDetailResponse.Account.PrivilegeList["+ i +"].UseAccountTypeName"));
			privilege.setUseAccountCreateTime(_ctx.longValue("DescribeAccountDetailResponse.Account.PrivilegeList["+ i +"].UseAccountCreateTime"));
			privilege.setUseAccountName(_ctx.stringValue("DescribeAccountDetailResponse.Account.PrivilegeList["+ i +"].UseAccountName"));

			privilegeList.add(privilege);
		}
		account.setPrivilegeList(privilegeList);
		describeAccountDetailResponse.setAccount(account);
	 
	 	return describeAccountDetailResponse;
	}
}