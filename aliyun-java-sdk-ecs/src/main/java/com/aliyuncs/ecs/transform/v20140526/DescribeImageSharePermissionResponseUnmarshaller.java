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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeImageSharePermissionResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeImageSharePermissionResponse.Account;
import com.aliyuncs.ecs.model.v20140526.DescribeImageSharePermissionResponse.ShareGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageSharePermissionResponseUnmarshaller {

	public static DescribeImageSharePermissionResponse unmarshall(DescribeImageSharePermissionResponse describeImageSharePermissionResponse, UnmarshallerContext _ctx) {
		
		describeImageSharePermissionResponse.setRequestId(_ctx.stringValue("DescribeImageSharePermissionResponse.RequestId"));
		describeImageSharePermissionResponse.setRegionId(_ctx.stringValue("DescribeImageSharePermissionResponse.RegionId"));
		describeImageSharePermissionResponse.setTotalCount(_ctx.integerValue("DescribeImageSharePermissionResponse.TotalCount"));
		describeImageSharePermissionResponse.setPageNumber(_ctx.integerValue("DescribeImageSharePermissionResponse.PageNumber"));
		describeImageSharePermissionResponse.setPageSize(_ctx.integerValue("DescribeImageSharePermissionResponse.PageSize"));
		describeImageSharePermissionResponse.setImageId(_ctx.stringValue("DescribeImageSharePermissionResponse.ImageId"));

		List<ShareGroup> shareGroups = new ArrayList<ShareGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageSharePermissionResponse.ShareGroups.Length"); i++) {
			ShareGroup shareGroup = new ShareGroup();
			shareGroup.setGroup(_ctx.stringValue("DescribeImageSharePermissionResponse.ShareGroups["+ i +"].Group"));

			shareGroups.add(shareGroup);
		}
		describeImageSharePermissionResponse.setShareGroups(shareGroups);

		List<Account> accounts = new ArrayList<Account>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageSharePermissionResponse.Accounts.Length"); i++) {
			Account account = new Account();
			account.setAliyunId(_ctx.stringValue("DescribeImageSharePermissionResponse.Accounts["+ i +"].AliyunId"));

			accounts.add(account);
		}
		describeImageSharePermissionResponse.setAccounts(accounts);
	 
	 	return describeImageSharePermissionResponse;
	}
}