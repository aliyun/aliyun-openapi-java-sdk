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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeAccountMaskingPrivilegeResponse;
import com.aliyuncs.rds.model.v20140815.DescribeAccountMaskingPrivilegeResponse.Data;
import com.aliyuncs.rds.model.v20140815.DescribeAccountMaskingPrivilegeResponse.Data.UserPrivilegeItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountMaskingPrivilegeResponseUnmarshaller {

	public static DescribeAccountMaskingPrivilegeResponse unmarshall(DescribeAccountMaskingPrivilegeResponse describeAccountMaskingPrivilegeResponse, UnmarshallerContext _ctx) {
		
		describeAccountMaskingPrivilegeResponse.setRequestId(_ctx.stringValue("DescribeAccountMaskingPrivilegeResponse.RequestId"));

		Data data = new Data();

		List<UserPrivilegeItem> userPrivilege = new ArrayList<UserPrivilegeItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccountMaskingPrivilegeResponse.Data.UserPrivilege.Length"); i++) {
			UserPrivilegeItem userPrivilegeItem = new UserPrivilegeItem();
			userPrivilegeItem.setExpireTime(_ctx.stringValue("DescribeAccountMaskingPrivilegeResponse.Data.UserPrivilege["+ i +"].ExpireTime"));
			userPrivilegeItem.setPrivilege(_ctx.stringValue("DescribeAccountMaskingPrivilegeResponse.Data.UserPrivilege["+ i +"].Privilege"));
			userPrivilegeItem.setUserName(_ctx.stringValue("DescribeAccountMaskingPrivilegeResponse.Data.UserPrivilege["+ i +"].UserName"));

			userPrivilege.add(userPrivilegeItem);
		}
		data.setUserPrivilege(userPrivilege);
		describeAccountMaskingPrivilegeResponse.setData(data);
	 
	 	return describeAccountMaskingPrivilegeResponse;
	}
}